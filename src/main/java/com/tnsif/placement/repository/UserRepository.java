package com.tnsif.placement.repository;

import com.tnsif.placement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
