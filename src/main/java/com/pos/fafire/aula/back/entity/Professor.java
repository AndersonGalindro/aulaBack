package com.pos.fafire.aula.back.entity;

import java.util.Set;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Professor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;

	String name;
	String cpf;
//	Integer departmentId;

	@ManyToOne
	@JoinColumn(name = "department_id", referencedColumnName = "id")
	Department department;

	@OnDelete(action = OnDeleteAction.CASCADE)
	@OneToMany(mappedBy = "professor")
	Set<Allocation> allocations;
}
