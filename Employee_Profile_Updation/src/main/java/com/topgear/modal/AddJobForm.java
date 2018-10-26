package com.topgear.modal;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class AddJobForm {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int jobId;
	private String	jobName;
	private String	jobDescription;
	private String	projectName;
	private String[]	skillsRequired;
	private String[]	optionalSkills;
	private String[]	location;
	private String	employeeBand;
	private String	yearsOfExperience;
	private String	noOfposition;
	private String	contactPersonEmailID;
	private String	contactNumber;
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String[] getSkillsRequired() {
		return skillsRequired;
	}
	public void setSkillsRequired(String[] skillsRequired) {
		this.skillsRequired = skillsRequired;
	}
	public String[] getOptionalSkills() {
		return optionalSkills;
	}
	public void setOptionalSkills(String[] optionalSkills) {
		this.optionalSkills = optionalSkills;
	}
	public String[] getLocation() {
		return location;
	}
	public void setLocation(String[] location) {
		this.location = location;
	}
	public String getEmployeeBand() {
		return employeeBand;
	}
	public void setEmployeeBand(String employeeBand) {
		this.employeeBand = employeeBand;
	}
	public String getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(String yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	public String getNoOfposition() {
		return noOfposition;
	}
	public void setNoOfposition(String noOfposition) {
		this.noOfposition = noOfposition;
	}
	public String getContactPersonEmailID() {
		return contactPersonEmailID;
	}
	public void setContactPersonEmailID(String contactPersonEmailID) {
		this.contactPersonEmailID = contactPersonEmailID;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	


}
