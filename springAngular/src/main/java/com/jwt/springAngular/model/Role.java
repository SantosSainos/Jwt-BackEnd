
package com.jwt.springAngular.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

/**
 * 
 * @author Santos Sainos Hernández
 *
 * @versino 1.0
 */
@Entity
@Table(name = "roles")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	@NaturalId
	@Column(length = 60)
	private RoleName name;
	
	public Role() {
		
	}
	public Role(RoleName name) {
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public RoleName getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(RoleName name) {
		this.name = name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + "]";
	}
	
	

}