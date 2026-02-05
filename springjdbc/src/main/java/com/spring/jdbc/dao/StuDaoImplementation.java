package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.Student;

@Component("sdi")
public class StuDaoImplementation implements StudentDao{

	private JdbcTemplate jdbctemp;
	@Override
	public int insert(Student stu) {
		//Insert Query
		String query = "insert into student(id,name,city) values (?,?,?)";
		
		int r = this.jdbctemp.update(query,stu.getId(),stu.getName(),stu.getCity());
		return r;
	}
	@Override
	public int update(Student stu) {
	    //Update Query
		String query = "update student set name=? , city=? where id=?";
		int r = this.jdbctemp.update(query,stu.getName(),stu.getCity(),stu.getId());
		return r;
	}
	@Override
	public int delete(int stuId) {
	    //Delete Query
		String query = "delete from student where id=?";
		int r = this.jdbctemp.update(query,stuId);
		return r;
	}
	@Override
	public Student getStudent(int stuid) {
		//Read Query(Read single row from Table)
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student obj = this.jdbctemp.queryForObject(query, rowMapper,stuid);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
		return obj;
	}
	@Override
	public List<Student> getAllStudents() {
		//Read Query(Read all row form Table)
		String query = "select * from student ";
		List<Student> lst = this.jdbctemp.query(query, new RowMapperImpl());
		return lst;
	}
	public JdbcTemplate getJdbctemp() {
		return jdbctemp;
	}
	@Autowired
	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}
}
