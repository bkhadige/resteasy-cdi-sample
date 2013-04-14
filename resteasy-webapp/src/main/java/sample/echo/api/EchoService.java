package sample.echo.api;

import sample.message.util.MessageFormat;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/message")
public class EchoService {

    @Inject
    MessageFormat messageFormat;

	@GET
	@Path("/{param}")
	public Response echo(@PathParam("param") String message) {
		return Response.status(200).entity(messageFormat.format(message)).build();
	}

}