package com.devstudy.resume.configuration;


import com.devstudy.resume.filter.ResumeFilter;
import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;
import org.springframework.context.ApplicationListener;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.*;
import java.util.EnumSet;

public class ResumeWebApplicationInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext container) throws ServletException {
        WebApplicationContext ctx = createWebApplicationInitializer(container);

        container.setSessionTrackingModes(EnumSet.of(SessionTrackingMode.COOKIE));
        container.addListener(new ContextLoaderListener(ctx));
        container.addListener(ctx.getBean(ApplicationListener.class));

        registerFilters(container, ctx);
        registerSpringApplicationDispatcher(container, ctx);
    }

    private void registerFilters(ServletContext container, WebApplicationContext ctx) {
        registerFilter(container, (Filter) ctx.getBean(String.valueOf(ResumeFilter.class)));
        registerFilter(container, new CharacterEncodingFilter("UTF-8", true));
        registerFilter(container, buildConfigurableSiteMeshFilter(), "sitemesh");
    }

    private void registerFilter(ServletContext container, Filter filter, String... filterNames) {
        String filterName = filterNames.length > 0 ? filterNames[0] : filter.getClass().getSimpleName();
        container.addFilter(filterName, filter).addMappingForUrlPatterns(null, true, "/*");
    }

    public WebApplicationContext createWebApplicationInitializer(ServletContext container) {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();

        ctx.scan("com.devstudy.resume.configuration");
        ctx.setServletContext(container);
        ctx.refresh();

        return ctx;
    }


    public void registerSpringApplicationDispatcher(ServletContext container, WebApplicationContext ctx) {
        ServletRegistration.Dynamic appServlet = container.addServlet("dispatcher", new DispatcherServlet(ctx));
        appServlet.setLoadOnStartup(1);
        appServlet.addMapping("/");
    }

    private ConfigurableSiteMeshFilter buildConfigurableSiteMeshFilter() {
        return new ConfigurableSiteMeshFilter() {
            @Override
            protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
                builder
                        .addDecoratorPath("/*", "/WEB-INF/template/page-template.jsp");
            }
        };
    }
}
