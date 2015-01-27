package frontend.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import client.StringJumblerService;

import com.google.common.base.Optional;

@Path("/jumbler")
@Produces(MediaType.APPLICATION_JSON)
public class JumblerApi {
	private final StringJumblerService stringJumblerService;

	private final String defaultString;

	public JumblerApi(StringJumblerService stringJumblerService, String defaultString) {
		this.stringJumblerService = stringJumblerService;
		this.defaultString = defaultString;
	}
	
	@GET
	public String jumble(@QueryParam("string") Optional<String> str) {
		String result;
		try {
			result = this.stringJumblerService.jumbleMuhString(str.or(this.defaultString));
		} catch (Exception ex) {
			result = ex.getMessage();
		}
		return result;
	}
}
