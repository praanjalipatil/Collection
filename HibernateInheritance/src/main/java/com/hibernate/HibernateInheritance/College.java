package com.hibernate.HibernateInheritance;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="College_Info")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name="info")

public class College {
	@Id
	private int collegeId;
	private String collegeName;
	
	public College() {
		super();
	}
	
	public College(int collegeId, String collegeName) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
	}

	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
		
}

@Entity
class Student extends College{
	
	private int studentId;
	private String studentName;
	
	public Student() {
		super();
	}
	
	public Student(int collegeId, String collegeName, int studentId, String studentName) {
		super(collegeId, collegeName);
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}	
	
}

@Entity
class Teacher extends College{
	
	private int teacherId;
	private String teacherString;
	
	public Teacher() {
		super();
	}
	
	public Teacher(int collegeId, String collegeName, int teacherId, String teacherString) {
		super(collegeId, collegeName);
		this.teacherId = teacherId;
		this.teacherString = teacherString;
	}
	
	public int getTeacherId() {
		return teacherId;
	}
	
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	
	public String getTeacherString() {
		return teacherString;
	}
	
	public void setTeacherString(String teacherString) {
		this.teacherString = teacherString;
	}	
	
}
