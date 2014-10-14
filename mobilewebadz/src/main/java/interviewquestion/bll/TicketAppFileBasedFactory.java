package interviewquestion.bll;

import interviewquestion.model.TicketPool;

public class TicketAppFileBasedFactory implements ITicketFactory{

	
	public ITicketPoolBLL getInstance(String instanceName) {
		// TODO Auto-generated method stub
		switch (instanceName) {
		case "TicketPool":
			try {
				return TicketPool.getTicketPool(50L);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		default:
			return null;
		}
	}
	
	

}
