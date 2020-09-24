package com.devstudy.resume.repository.storage;

import com.devstudy.resume.entity.Profile;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProfileRestoreRepository extends PagingAndSortingRepository<Profile, Long> {

    Profile findByToken(String token);

}
