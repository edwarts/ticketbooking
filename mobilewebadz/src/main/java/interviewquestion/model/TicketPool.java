package interviewquestion.model;

import java.util.HashSet;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ThreadLocalRandom;
import interviewquestion.bll.ITicketPoolBLL;



public class TicketPool implements ITicketPoolBLL
{
	private static int ticketIdLength=32;
	private static TicketPool _TicketPool=null;
	private static ConcurrentLinkedQueue<String> _tickeIdRef=new ConcurrentLinkedQueue<String>();
    private static HashSet<String> _ticketBackupHashSet=new HashSet<String>();
	public TicketPool(long totalTicketNumber)
	{
		
		for(int i=0;i<totalTicketNumber;i++)
		{
			String oneTicketId=random(ticketIdLength);
			_tickeIdRef.add(oneTicketId);
			_ticketBackupHashSet.add(oneTicketId);
		}
	}
	public  void initialTheTicketPool(long ticketPoolSize)
	{
		_TicketPool=new TicketPool(ticketPoolSize);
	}
	public static TicketPool getTicketPool() throws Exception
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
	public boolean increaseOneTicket(String ticketId) {
		// TODO Auto-generated method stub
		try {
			//if the incoming ticket Id exist in ticket id backup, this means the ticketId is a valid one
			if(_ticketBackupHashSet.contains(ticketId))
			{
				
				_tickeIdRef.add(ticketId);
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
	public String decreaseOneTicket() {
		// TODO Auto-generated method stub
				try {
					if(_tickeIdRef.size()!=0)
					{
					String idGenerated=_tickeIdRef.poll();//Generate the reference ID
					
					return idGenerated;
					}
					else {
						return "";
					}
				} catch (Exception e) {
					return "";
				}
	}
	@Override
	public String getTickets() {
		String returnString=String.valueOf(_tickeIdRef.size());
		return returnString;
	}
	
	public static String random(int length) {
		StringBuilder builder = new StringBuilder(length);
		for (int i = 0; i < length; i++) {
			builder.append((char) (ThreadLocalRandom.current().nextInt(65, 90)));
		}
		return builder.toString();
	}
	}
