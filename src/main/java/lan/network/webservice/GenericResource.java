/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lan.network.webservice;

import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

@Path("generic")
public class GenericResource {

	public GenericResource() {
	}

	@GET
	@Produces("application/xml")
	public String getXml() {
		throw new UnsupportedOperationException();
	}

	@PUT
	@Consumes("application/xml")
	public void putXml(String content) {
	}
}
