package com.customer.ws;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.sun.jersey.spi.resource.Singleton;

@Produces("application/xml")
@Path("customers")
@Singleton
public class CustomersResource {

	//In a real application, at this point you would probably 
	//wire in a database using JPA or Hibernate to help manage the customer list, but a simple in-memory map is  sufficient
	private TreeMap<Integer, Customer> customerMap = new TreeMap<Integer, Customer>();

    //hardcode a single customer as a demo
	public CustomersResource() {
	    Customer customer = new Customer();
	        customer.setName("Andrey Vetushko");
	        customer.setAddress("San Jose, CA");
	        addCustomer(customer);
	    }
	
	@GET	public List<Customer> getCustomers() {
		//throw new UnsupportedOperationException("Not yet implemented.");
        List<Customer> customers = new ArrayList<Customer>();
        customers.addAll(customerMap.values());
        return customers;
	}

	@GET	@Path("{id}")	public Customer getCustomer(@PathParam("id") int customerId) {
		//throw new UnsupportedOperationException("Not yet implemented.");
		 return customerMap.get(customerId);
	}

	@POST 	@Path("add")	@Produces("text/html")	@Consumes("application/xml")	public String addCustomer(Customer customer) {
		//throw new UnsupportedOperationException("Not yet implemented.");
        int id = customerMap.size();
        customer.setId(id);
        customerMap.put(id, customer);
        return "Customer " + customer.getName() + " added with Id " + id;
	}
}