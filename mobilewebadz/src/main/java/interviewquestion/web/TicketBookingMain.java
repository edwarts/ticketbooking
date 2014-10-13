package interviewquestion.web;

import org.restlet.Component;
import org.restlet.Server;
import org.restlet.data.Protocol;
import org.restlet.ext.jaxrs.JaxRsApplication;

public class TicketBookingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Make an instance of Server Component
		Component ticketServerComponent=new Component();
		Server ticketServer=ticketServerComponent.getServers().add(Protocol.HTTP,8000);
		// Setup the Booking ticket environment
		JaxRsApplication bookingServerApplicaiton=new JaxRsApplication();
		bookingServerApplicaiton.add(new );

	}

}
