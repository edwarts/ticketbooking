package interviewquestion.bll;

import interviewquestion.model.TicketPool;

public class TicketAppFileBasedFactory implements ITicketFactory{

	
	public ITicketPoolBLL getInstance(String instanceName) {
		// TODO Auto-generated method stub
		switch (instanceName) {
		case "TicketPool":
			return new TicketPool(50);
		default:
			return null;
		}
	}
	
	

}
