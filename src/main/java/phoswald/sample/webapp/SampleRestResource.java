package phoswald.sample.webapp;

import java.time.LocalDateTime;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/sample-resource")
public class SampleRestResource {

	@GET
	public Response get() {
		String now = LocalDateTime.now().toString();
		System.out.println("SampleRestResource called on " + now);
		return Response.ok("Greetings from SampleRestResource, the current time is " + now, MediaType.TEXT_PLAIN_TYPE).build();
	}
}
