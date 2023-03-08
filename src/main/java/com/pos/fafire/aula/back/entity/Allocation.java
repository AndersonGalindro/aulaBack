package com.pos.fafire.aula.back.entity;

import java.time.DayOfWeek;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Allocation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;

	@Enumerated(EnumType.STRING)
	DayOfWeek dayOfWeek;

	LocalDate startHour;
	LocalDate endHour;
//	Integer professorId;
//	Long curseId;

	@ManyToOne
	@JoinColumn(name = "professor_id", referencedColumnName = "id")
	Professor professor;
	@ManyToOne
	@JoinColumn(name = "course_id", referencedColumnName = "id")
	Course course;

}
