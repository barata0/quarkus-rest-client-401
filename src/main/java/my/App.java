package my;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/app")
public class App {

    @Inject
    @RestClient
    AppService appService;

    @GET
    @Path("ok")
    @Produces(MediaType.TEXT_PLAIN)
    public String ok() {
        return appService.ok();
    }

    @GET
    @Path("deny")
    @Produces(MediaType.TEXT_PLAIN)
    public String deny() {
        return appService.deny();
    }


    @GET
    @Path("code200")
    @Produces(MediaType.TEXT_PLAIN)
    public String code200() {
        return "ok";
    }

    @GET
    @Path("code401")
    @Produces(MediaType.TEXT_PLAIN)
    public String code401() {
        throw new NotAuthorizedException(Response.status(401).build());
    }

}