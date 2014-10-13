package interviewquestion.web;

import org.restlet.resource.Get;

public class TicketBookReource extends TicketWebServiceInRestlet{
	
	@Get("txt")
	public String Booking()
	{
		return "{ booking:"+bookOneTicket()+"}";
	}

}
