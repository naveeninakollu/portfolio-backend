package dev.portfolio.model;

import org.springframework.data.annotation.Id;

public class Socials {

	@Id
	private int id;
	
	private String url;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
