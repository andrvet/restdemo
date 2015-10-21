package com.improved.site;

import javax.xml.bind.annotation.XmlRootElement;

//JAXB annotation that allows JAXB to convert this entity from Java to XML and back
@XmlRootElement
public class Site {

	public Site() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String name;

	public Site(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public final String getKey() {
		return this.getName().toUpperCase();
	}

}
