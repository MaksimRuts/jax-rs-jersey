package com.roots.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Maksim Ruts on 4/9/2017.
 */
@Path("/example")
public class RestExample {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        return "hello";
    }

}
