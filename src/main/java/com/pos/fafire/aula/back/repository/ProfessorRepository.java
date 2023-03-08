package com.pos.fafire.aula.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pos.fafire.aula.back.entity.Professor;

@Repository
interface ProfessorRepository extends JpaRepository<Professor, Integer> {

}
