package com.spring.jdbc.dao;
import java.util.List;

import com.spring.jdbc.Student;

public interface StudentDao {
      public int insert(Student stu);
      public int update(Student stu);
      public int delete(int stuId);
      public Student getStudent(int stuid);
      public List<Student> getAllStudents();
}
