package com.jwt.springAngular.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Santos Sainos Hernández
 *
 * @versino 1.0
 * 
 *          – TestRestAPIs define 3 RestAPIs:
 * 
 *          /api/test/user -> access by users has USER_ROLE or ADMIN_ROLE
 *          /api/test/pm -> access by users has USER_PM or ADMIN_ROLE
 *          /api/test/admin -> access by users has ADMIN_ROLE
 */

@CrossOrigin(origins = "*", maxAge=300)
@RestController
public class TestRestAPIs {
	
	@GetMapping("/api/test/user")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public String userAccess() {
		return ">>> User Contents!";
	}
	
	@GetMapping("/api/test/pm")
	@PreAuthorize("hasROle('PM') or hasRole('ADMIN')")
	public String projectManagementAccess() {
		return ">>> Project Management Board";
	}
	
	@GetMapping("/api/test/Admin")
	@PreAuthorize("hasROle('ADMIN')")
	public String adminAccess() {
		return ">>> Admin Contents";
	}
}
