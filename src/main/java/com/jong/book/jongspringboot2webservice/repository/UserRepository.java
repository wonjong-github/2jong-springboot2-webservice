package com.jong.book.jongspringboot2webservice.repository;

import com.jong.book.jongspringboot2webservice.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
