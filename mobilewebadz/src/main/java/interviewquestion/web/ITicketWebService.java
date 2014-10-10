package interviewquestion.web;

import java.io.ObjectInputStream.GetField;

public interface ITicketWebService {
	public ITicketWebService getService();
	public String getSeatNumbers();
	public String bookOneTicket();
	public boolean cancelOneTicket(String tikcetId);
}
