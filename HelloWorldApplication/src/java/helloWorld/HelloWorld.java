/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloWorld;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.enterprise.context.RequestScoped;

/**
 * REST Web Service
 *
 * @author lsilvs
 */
@Path("helloworld")
@RequestScoped
public class HelloWorld {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of HelloWorld
     */
    public HelloWorld() {
    }

    /**
    * Retrieves representation of an instance of helloWorld.HelloWorld
    * @return an instance of java.lang.String
    */
   @GET
   @Path("/{name}")
   @Produces("text/html")
   public String getHtml(@PathParam("name") String name) {
       return "<html lang=\"en\"><body><h1>Hello, " + name + "!!</body></h1></html>";
   }

    /**
     * PUT method for updating or creating an instance of HelloWorld
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("text/html")
    public void putHtml(String content) {
    }
}
