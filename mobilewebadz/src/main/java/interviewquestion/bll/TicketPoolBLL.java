package interviewquestion.bll;

import interviewquestion.model.TicketPool;;

public interface TicketPoolBLL {
	
	public void initialTheTicketPool(long ticketPoolSize);
	public TicketPool getTicketPool() throws Exception;
	public boolean increaseOneTicket();
	public String decreaseOneTicket();

}
