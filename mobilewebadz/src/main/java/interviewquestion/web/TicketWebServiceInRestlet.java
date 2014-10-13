package interviewquestion.web;

import interviewquestion.bll.ITicketFactory;
import interviewquestion.bll.ITicketPoolBLL;
import interviewquestion.bll.TicketAppFileBasedFactory;
import interviewquestion.model.TicketPool;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.restlet.resource.ServerResource;

public class TicketWebServiceInRestlet extends ServerResource implements ITicketWebService {

	private static ITicketPoolBLL _ITicketPoolBLL;
	private static ITicketWebService _ticketWebService;
	private static ITicketFactory _TicketFactory;
	public TicketWebServiceInRestlet()
	{
		ITicketFactory ticketFac=new TicketAppFileBasedFactory();
		_ITicketPoolBLL=ticketFac.getInstance("TicketPool");
	}
	@Override
	public ITicketWebService getService() {
		// TODO Auto-generated method stub
		if(_ticketWebService==null)
		{
			//Inject an instance of TicketPoolBLL
			new TicketWebServiceInRestlet();
			return _ticketWebService;
			
		}
		else {
			return _ticketWebService;
		}
		
	}

	@Path("/seat")
	@GET
	@Produces("text/plain")
	public String getSeatNumbers() {
		return _ITicketPoolBLL.getTickets();
		
	}

	@Override
	public String bookOneTicket() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean cancelOneTicket(String tikcetId) {
		// TODO Auto-generated method stub
		return false;
	}

}
