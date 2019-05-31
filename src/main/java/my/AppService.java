/**
 * AppService
 */

package my;


import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("app")
@RegisterRestClient
public interface AppService {

    @GET
    @Path("code200")
    public String ok();

    @GET
    @Path("code401")
    public String deny();
}