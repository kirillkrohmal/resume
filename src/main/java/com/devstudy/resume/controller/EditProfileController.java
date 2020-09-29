package com.devstudy.resume.controller;

import com.devstudy.resume.form.SkillForm;
import com.devstudy.resume.repository.storage.ProfileRepository;
import com.devstudy.resume.repository.storage.SkillCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class EditProfileController {
    @Autowired
    SkillCategoryRepository skillCategoryRepository;

    @Autowired
    ProfileRepository profileRepository;

    @RequestMapping(value="/edit", method = RequestMethod.GET)
    public String getEditProfile() {
        return "edit";
    }

    @RequestMapping(value = "/edit/skills", method = RequestMethod.GET)
    public String getEditTechSkills(Model model) {
        model.addAttribute("skillForm", new SkillForm(profileRepository.findOne(1L).getSkills()));
        return goToSkillsJSP(model);
    }

    @RequestMapping(value = "/edit/skills", method = RequestMethod.POST)
    public String saveEditSkills(@ModelAttribute("skillForm") SkillForm skillForm, Model model, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return goToSkillsJSP(model);
        }

        return "redirect:/mike-ross";
    }


    public String goToSkillsJSP(Model model) {
        model.addAttribute("skillCategories", skillCategoryRepository.findAll(new Sort("id")));

        return "edit/skills";
    }
}
