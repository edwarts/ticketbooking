package interviewquestion.web;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class TicketSeatsResource extends TicketWebServiceInRestlet{
	
	@Get("txt")
	public String getSeats()
	{
		return getSeatNumbers();
	}

}
