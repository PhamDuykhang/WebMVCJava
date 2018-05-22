package com.cnttctu.mywebmvc.Entity;

public class employee {
	private int id;
	private String name;
	private String birth;
	private String Job;
	/**
	 * @param id
	 * @param name
	 * @param birth
	 * @param job
	 */
	public employee(int id, String name, String birth, String job) {
		super();
		this.id = id;
		this.name = name;
		this.birth = birth;
		Job = job;
	}
	/**
	 * 
	 */
	public employee() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getJob() {
		return Job;
	}
	public void setJob(String job) {
		Job = job;
	}
	
}
