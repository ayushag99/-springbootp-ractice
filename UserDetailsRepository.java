package com.infygo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infygo.entity.UserDetails;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, String> {

}
