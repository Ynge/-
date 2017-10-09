package com.vo;

public class User {
	private int id;
	private String username;
	private String password;
	private String sex;
	private String profession;
	private String favourite;
	private String note;
	private String type;
	
	public User() {
		super();
	}
	
	public User(int id, String username, String password, String sex,
			String profession, String favourite, String note, String type) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.profession = profession;
		this.favourite = favourite;
		this.note = note;
		this.type = type;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getFavourite() {
		return favourite;
	}
	public void setFavourite(String favourite) {
		this.favourite = favourite;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", sex=" + sex + ", profession=" + profession
				+ ", favourite=" + favourite + ", note=" + note + ", type="
				+ type + "]";
	}
	
}
