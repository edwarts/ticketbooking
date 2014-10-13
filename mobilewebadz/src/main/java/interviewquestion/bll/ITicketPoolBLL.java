package interviewquestion.bll;

import interviewquestion.model.TicketPool;;

public interface ITicketPoolBLL {
	
	public void initialTheTicketPool(long ticketPoolSize);
	public TicketPool getTicketPool() throws Exception;
	public boolean increaseOneTicket(String ticketId);
	public String decreaseOneTicket();
	public String getTickets();

}
