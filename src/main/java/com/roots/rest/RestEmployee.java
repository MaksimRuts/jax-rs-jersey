package com.roots.rest;

import com.roots.bean.Employee;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Maksim Ruts on 4/9/2017.
 */
@Path("/employee")
public class RestEmployee {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Employee get() {
        Employee employee = new Employee();
        employee.setName("Maks");
        return employee;
    }
}
