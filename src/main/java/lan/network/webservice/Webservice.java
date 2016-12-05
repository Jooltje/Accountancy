package lan.network.webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/webservice")
public class Webservice {

	public Webservice() {
	}

	@GET
	@Produces("text/html")
	public String getHtml() {
		return "<html lang=\"en\"><body><h1>Hello, webservice!!</h1></body></html>";
	}
}