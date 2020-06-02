<%@page import="org.slf4j.LoggerFactory"%>
<%@ taglib prefix="c" 		uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true" %>


<%
    LoggerFactory.getLogger("search-form.jsp").debug("Display search-form.jsp");
%>

<html>
<body>

<h2>Input Name</h2>
<c:if test="${invalid}">
    <h5 style="color:red;">Please input correct value </h5>
</c:if>

<form action="/search" method="post">
    <input name="query"/>
    <input type="submit" value="Search"/>

</form>
</body>
</html>
