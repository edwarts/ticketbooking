package interviewquestion.model;

import interviewquestion.bll.TicketPoolBLL;



public class TicketPool implements TicketPoolBLL
{
	private static long ticketNumber=0;
	private static TicketPool _TicketPool=null;
	private TicketPool(long totalTicketNumber)
	{
		ticketNumber=totalTicketNumber;
	}
	public  void initialTheTicketPool(long ticketPoolSize)
	{
		_TicketPool=new TicketPool(ticketPoolSize);
	}
	public synchronized TicketPool getTicketPool() throws Exception
	{
		if(_TicketPool==null)
		{
			throw new Exception("Initial the pool first");
		}
		else {
			return _TicketPool;
		}
	}

	@Override
	public synchronized boolean increaseOneTicket() {
		// TODO Auto-generated method stub
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		ticketNumber++;
		return false;
	}
	@Override
	public synchronized String decreaseOneTicket() {
		// TODO Auto-generated method stub
		return null;
	}
	}
