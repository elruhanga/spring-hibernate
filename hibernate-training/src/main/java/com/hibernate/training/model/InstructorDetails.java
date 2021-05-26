package com.hibernate.training.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "instructor_details")
public class InstructorDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "instructor_Details_Id")
	private int instructorDetailsId;
	@Column(name = "youtube_channel")
	private String youtubleChannel;
	@Column(name = "hobby")
	private String hobby;
	
	@ManyToOne
	private Instructor instructor;

	public int getInstructorDetailsId() {
		return instructorDetailsId;
	}

	public void setInstructorDetailsId(int instructorDetailsId) {
		this.instructorDetailsId = instructorDetailsId;
	}

	public String getYoutubleChannel() {
		return youtubleChannel;
	}

	public void setYoutubleChannel(String youtubleChannel) {
		this.youtubleChannel = youtubleChannel;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	@Override
	public String toString() {
		return "InstructorDetails [instructorDetailsId=" + instructorDetailsId + ", youtubleChannel=" + youtubleChannel
				+ ", hobby=" + hobby + "]";
	}

}
