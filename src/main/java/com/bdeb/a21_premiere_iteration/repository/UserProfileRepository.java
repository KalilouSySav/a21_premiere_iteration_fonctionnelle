package com.bdeb.a21_premiere_iteration.repository;

import com.bdeb.a21_premiere_iteration.entities.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {

}

