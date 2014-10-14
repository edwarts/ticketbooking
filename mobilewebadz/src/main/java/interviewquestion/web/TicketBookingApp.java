package interviewquestion.web;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class TicketBookingApp extends Application {
	public TicketBookingApp()
	{
		setName("Tiecket Booking API");
	}
	@Override
	public synchronized Restlet createInboundRoot(){ 
	 Router router = new Router(getContext());
	 router.attach("/seat", TicketWebServiceInRestlet.class);//This is root
	 router.attach("/seat/book", TicketBookReource.class);
	 router.attach("/seat/cancel/{ticketId}", TicketCancelResource.class);
	 return router;
	}
	

}
