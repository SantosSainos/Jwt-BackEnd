package com.jwt.springAngular.respository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jwt.springAngular.model.Role;
import com.jwt.springAngular.model.RoleName;

/**
 * 
 * @author Santos Sainos Hernández
 *
 * @versino 1.0
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
	Optional<Role> findByName(RoleName roleName);
}
