package com.paws_company.paws_project.repository;

import com.paws_company.paws_project.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
