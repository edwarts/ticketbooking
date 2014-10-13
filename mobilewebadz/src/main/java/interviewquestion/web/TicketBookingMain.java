package interviewquestion.web;

import org.restlet.Component;
import org.restlet.Server;
import org.restlet.data.Protocol;

public class TicketBookingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello");
		//Make an instance of Server Component
	
	    try {
	    	Component ticketServerComponent=new Component();
			Server ticketServer=ticketServerComponent.getServers().add(Protocol.HTTP,8000);
		    ticketServerComponent.getDefaultHost().attach(new TicketBookingApp());
			// Setup the Booking ticket environment
			ticketServerComponent.start();
			//Debug Info


	        System.out.println("Server started on port " + ticketServer.getPort());
	        System.out.println("Press key to stop server");
	        System.in.read();
	        System.out.println("Stopping server");
	        ticketServerComponent.stop();
	        System.out.println("Server stopped");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
