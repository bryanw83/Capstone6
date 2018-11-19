package com.Week6Capstone.Week6Capstone.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Week6Capstone.Week6Capstone.entity.Tasks;

public interface TasksRepository extends JpaRepository<Tasks, Integer>{

}
