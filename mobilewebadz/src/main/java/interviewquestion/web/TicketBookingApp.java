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
	 router.attach("/seat", TicketWebServiceInRestlet.class);
	 router.attach("/seat/book", TicketWebServiceInRestlet.class);
	 router.attach("/seat/cancel/{tikcetId}", TicketWebServiceInRestlet.class);
	 return router;
	}
	

}
