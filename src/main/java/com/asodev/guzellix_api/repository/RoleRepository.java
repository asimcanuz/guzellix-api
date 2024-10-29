package com.asodev.guzellix_api.repository;

import com.asodev.guzellix_api.models.ERole;
import com.asodev.guzellix_api.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
