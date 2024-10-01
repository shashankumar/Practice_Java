package com.sk.Resources;

import java.util.List;

import com.sk.model.Employee;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/msg")
public class Massage {
	
	/*
	 * @GET
	 * 
	 * @Produces(MediaType.TEXT_PLAIN) public String hello() { return
	 * "Hello Shahsank"; }
	 */
	
	@GET()
	
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getList(){
		EmployeeService es = new EmployeeService();
	    return es.addemp();	
	}
	
    @GET()
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getList(@PathParam("id") int id){
		EmployeeService es = new EmployeeService();
	    return es.getEmpById(id);	
	}

}
