package interviewquestion.web;

import org.restlet.resource.Get;

public class TicketBookReource extends TicketWebServiceInRestlet{
	
	@Get
	public String Booking()
	{
		return bookOneTicket();
	}

}
