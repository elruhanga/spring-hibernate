package com.hibernate.training.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "instructor")
public class Instructor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "instructor_Id")
	private int instructorId;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "email")
	private String email;

	@OneToMany(mappedBy = "instructor")
	private List<InstructorDetails> instructorDetails;

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<InstructorDetails> getInstructorDetails() {
		return instructorDetails;
	}

	public void setInstructorDetails(List<InstructorDetails> instructorDetails) {
		this.instructorDetails = instructorDetails;
	}

	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + "]";
	}

}
