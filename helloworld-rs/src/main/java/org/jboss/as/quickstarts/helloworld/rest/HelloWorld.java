/*
 * Copyright The WildFly Authors
 * SPDX-License-Identifier: Apache-2.0
 */
package org.jboss.as.quickstarts.helloworld.rest;

//import jakarta.ws.rs.GET;
//import jakarta.ws.rs.PUT;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.core.MediaType;
import jakarta.inject.Inject;

/**
 * A simple REST service which is able to say "Hello World!"
 *
 * @author Ashwin Mehendale
 * @author emartins
 */

@Path("/")
@Consumes("application/json")
public class HelloWorld {

    @Inject
    private EdvigeService edvige;

    @POST
    @Path("/entry")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes("application/json")
    public String createEntry(Entry entry) {
      if ( edvige != null ) {
          edvige.createEntry(entry);
          return "Entry created:" + entry;
      }
      return "Hello World!";
    }
}
