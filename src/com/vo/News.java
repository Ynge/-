package com.vo;

public class News {
	private int id;
	private String title;
	private String content;
	private String username;
	private String pubtime;
	
	public News() {
		super();
	}
	
	public News(int id, String title, String content, String username, String pubtime) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.username = username;
		this.pubtime = pubtime;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPubtime() {
		return pubtime;
	}
	public void setPubtime(String pubtime) {
		this.pubtime = pubtime;
	}

	@Override
	public String toString() {
		return "News [id=" + id + ", title=" + title + ", content=" + content
				+ ", username=" + username + ", pubtime=" + pubtime + "]";
	}
	
	
}
