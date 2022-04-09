package com.book.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.library.entity.UserRegistration;

public interface UserRegistrationRepo extends JpaRepository<UserRegistration, Integer> {

}
