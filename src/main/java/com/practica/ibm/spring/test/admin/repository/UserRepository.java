package com.practica.ibm.spring.test.admin.repository;

import com.practica.ibm.spring.test.admin.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
