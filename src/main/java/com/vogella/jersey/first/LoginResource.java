package com.vogella.jersey.first;

import com.vogella.jersey.first.Model.User;
import com.vogella.jersey.first.database.LoginDatabase;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by marti on 13-6-2017.
 */
@Path("login")
public class LoginResource {
    @GET
    @Path("/{param1}/{param2}")
    @Produces(MediaType.APPLICATION_JSON)
    public String Login(@PathParam("param1") String username, @PathParam("param2") String password) {
        JsonArrayBuilder jab = Json.createArrayBuilder();
        LoginDatabase dat = new LoginDatabase();
        System.out.println("start");
        User user = dat.checkLogin(username, password);
        JsonObjectBuilder job = Json.createObjectBuilder();
        job.add("username", user.getUsername());
        job.add("voornaam", user.getVoornaam());
        job.add("achternaam", user.getAchternaam());
        job.add("functie", user.getFunctie());
        job.add("geboortedatum", user.getGeboorteDatum());
        job.add("email", user.getEmail());
        job.add("adres", user.getAdres());
        job.add("aangenomen", user.getAangenomen());

        jab.add(job);

        return jab.toString();

    }
}
