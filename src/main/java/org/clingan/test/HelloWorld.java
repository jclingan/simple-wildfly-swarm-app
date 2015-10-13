package org.clingan.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 * @author Yoshimasa Tanabe
 */
@Path("/hello")
public class HelloWorld {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String findAll() {
	return "Hello World!";
    }

}
