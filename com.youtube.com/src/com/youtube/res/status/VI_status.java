package com.youtube.res.status;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
@Path("/VI/status/")
public class VI_status {
	public static final String api_Version = "00.01.00";
@GET
@Produces(MediaType.TEXT_HTML)
public String returnTitle(){
	return "<p>Java Web Service</p>";
	
}
@Path("/Version")
@GET
@Produces(MediaType.TEXT_HTML)
public String returnVersion(){
	return "<p>Version: </p>"+ api_Version;
	
}	
}
