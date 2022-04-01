package com.esprit.tpSpring.entity;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.esprit.tpSpring.enums.RoleName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	@Enumerated(EnumType.STRING)
	private RoleName role;
	
	
}
