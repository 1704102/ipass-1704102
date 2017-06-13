package com.vogella.jersey.first;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by marti on 13-6-2017.
 */
@Path("hello")
public class LoginResource {
        @GET
        @Produces(MediaType.TEXT_PLAIN)
        public String getOrders()  {
            return "hi";
    }
}
