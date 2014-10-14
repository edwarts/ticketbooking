package interviewquestion.web;

import org.restlet.resource.Get;

public class TicketBookReource extends TicketWebServiceInRestlet{
	
	@Get("txt")
	public String Booking()
	{
		String bookedTicket=bookOneTicket();
		if(bookedTicket!="")
		{
			return "{ booking:"+bookedTicket+"}";
			
		}
		else {
			return "{404 tickets not available}";
		}
	}

}
