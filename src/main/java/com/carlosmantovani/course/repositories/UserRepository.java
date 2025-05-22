package com.carlosmantovani.course.repositories;

import com.carlosmantovani.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
