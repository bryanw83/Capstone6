package com.Week6Capstone.Week6Capstone.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tasks")
public class Tasks {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer taskid;
	private String taskname;
	private String taskdescription;
	private String taskstatus;
	private Integer userid;
	
	public Tasks() {
		
	}

	public Tasks(String taskname, String taskdescription, String taskstatus) {
		super();
		this.taskname = taskname;
		this.taskdescription = taskdescription;
		this.taskstatus = taskstatus;
	}

	public Tasks(Integer taskid, String taskname, String taskdescription, String taskstatus) {
		super();
		this.taskid = taskid;
		this.taskname = taskname;
		this.taskdescription = taskdescription;
		this.taskstatus = taskstatus;
	}

	public Tasks(String taskname, String taskdescription, String taskstatus, Integer userid) {
		super();
		this.taskname = taskname;
		this.taskdescription = taskdescription;
		this.taskstatus = taskstatus;
		this.userid = userid;
	}

	public Tasks(Integer taskid, String taskname, String taskdescription, String taskstatus, Integer userid) {
		super();
		this.taskid = taskid;
		this.taskname = taskname;
		this.taskdescription = taskdescription;
		this.taskstatus = taskstatus;
		this.userid = userid;
	}

	public Integer getTaskid() {
		return taskid;
	}

	public void setTaskid(Integer taskid) {
		this.taskid = taskid;
	}

	public String getTaskname() {
		return taskname;
	}

	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}

	public String getTaskdescription() {
		return taskdescription;
	}

	public void setTaskdescription(String taskdescription) {
		this.taskdescription = taskdescription;
	}

	public String getTaskstatus() {
		return taskstatus;
	}

	public void setTaskstatus(String taskstatus) {
		this.taskstatus = taskstatus;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	

}
