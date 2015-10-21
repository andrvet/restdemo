package com.original.city;

public class City {

	private String mName;
	private String mDescription;

	public String getDescription() {
		return mDescription;
	}

	public void setDescription(String description) {
		this.mDescription = description;
	}

	public final String getKey() {
		return this.getName().toUpperCase();
	}

	public String getName() {
		return mName;
	}

	public void setName(String name) {
		this.mName = name;
	}

	public City(final String name, final String description) {
		mName = name;
		mDescription = description;
	}
	public City(final String name) {
		mName = name;
	}

}
