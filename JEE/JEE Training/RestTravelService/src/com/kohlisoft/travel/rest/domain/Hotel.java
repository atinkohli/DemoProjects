package com.kohlisoft.travel.rest.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="hotel")
@XmlAccessorType(XmlAccessType.FIELD)
public class Hotel {

	@XmlElement(required=true)
	private String name;
	@XmlElement(required=true)
	private String city;
	@XmlElement(required=true)
	private int stars;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
	
}
