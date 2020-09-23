package com.devstudy.resume.repository.storage;


import com.devstudy.resume.entity.SkillCategory;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;

@RepositoryDefinition(domainClass = SkillCategory.class, idClass = Long.class)
public interface SkillCategoryRepository {


    public List<SkillCategory> findAll(Sort sort);
}
