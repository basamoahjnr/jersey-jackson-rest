package fr.husta.test.rest;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;

import fr.husta.test.pojo.SimplePojo;

@Path("/app")
@Produces(MediaType.APPLICATION_JSON)
public class MyResource {

    @GET
    @Path("test")
    public Response getTest() {
        SimplePojo simplePojo = new SimplePojo();
        simplePojo.setOldDate(new Date());
        simplePojo.setName("test-1");
        simplePojo.setDob(LocalDate.now());
        simplePojo.setTimestamp(LocalDateTime.now());
        simplePojo.setTimestampWithTimezone(DateTime.now());

        return Response.ok(simplePojo).build();
    }

}
