package com.customer.ws;

import javax.xml.bind.annotation.XmlRootElement;

//JAXB annotation that allows JAXB to convert this entity from Java to XML and back
@XmlRootElement
public class Customer {
	  private int id;
	  private String name;
	  private String address;

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

	  public String getAddress() {
	     return address;
	  }

	  public void setAddress(String address) {
	    this.address = address;
	  }
}
