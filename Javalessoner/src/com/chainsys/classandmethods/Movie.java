package com.chainsys.classandmethods;

public class Movie {
	private final String name;
	private int price;
	private String hero;
	private String director;
	private char certificate;
	public String getName() {
		return name;
	}
	public Movie(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getHero() {
		return hero;
	}
	public void setHero(String hero) {
		this.hero = hero;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public char getCertificate() {
		return certificate;
	}
	public void setCertificate(char certificate) {
		this.certificate = certificate;
	}
	

}
