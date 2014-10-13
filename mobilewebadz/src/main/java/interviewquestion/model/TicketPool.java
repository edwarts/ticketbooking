package interviewquestion.model;

import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

import interviewquestion.bll.ITicketPoolBLL;



public class TicketPool implements ITicketPoolBLL
{
	private static long ticketNumber=0;
	private static TicketPool _TicketPool=null;
	private static HashMap<String, Integer> _tickeIdRef=new HashMap<String,Integer>();

	public TicketPool(long totalTicketNumber)
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
			_TicketPool=new TicketPool(50);
			return _TicketPool;
		}
		else {
			return _TicketPool;
		}
	}

	@Override
	public synchronized boolean increaseOneTicket(String ticketId) {
		// TODO Auto-generated method stub
		try {
			if(_tickeIdRef.containsKey(ticketId))
			{
				ticketNumber++;
				return true;
			}
			else {
				return false;
				
			}
			
		} catch (Exception e) {
			return false;
		}
	}
	@Override
	public synchronized String decreaseOneTicket() {
		// TODO Auto-generated method stub
				try {
					ticketNumber--;
					String idGenerated=random(32);//Generate the reference ID
					_tickeIdRef.put(idGenerated, 1);
					return idGenerated;
				} catch (Exception e) {
					return "";
				}
	}
	@Override
	public String getTickets() {
		String returnString=String.valueOf(ticketNumber);
		return returnString;
	}
	
	public static String random(int length) {
		StringBuilder builder = new StringBuilder(length);
		for (int i = 0; i < length; i++) {
			builder.append((char) (ThreadLocalRandom.current().nextInt(33, 128)));
		}
		return builder.toString();
	}
	}
