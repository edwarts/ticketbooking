package interviewquestion.web;

import org.restlet.resource.Put;

public class TicketCancelResource extends TicketWebServiceInRestlet {
	
	private String ticketId;
	@Override
	protected void doInit()
	{
		ticketId=getAttribute("ticketId");
	}
	@Put("txt")
	public String cacnelTicket()
	{
		return (cancelOneTicket(ticketId)==true)?"Ticket "+ticketId+"canceled!":"Fail to cancel";
		
		
	}

}
