package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entites.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;
	private String query;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	// mysql oprations...
	// insert query...
	public int insert(Student student) {

		query = "INSERT INTO `student` (`id`, `name`, `city`) VALUES (?,?,?)";
		return this.jdbcTemplate.update(query, student.getId(), student.getNaem(), student.getCity());
	}

	// update query
	public int update(Student student) {

		query = "UPDATE student SET name = ?, city = ? WHERE id = ?";
		return this.jdbcTemplate.update(query, student.getNaem(), student.getCity(), student.getId());
	}

}
