package interviewquestion.bll;

import org.junit.Test;

import junit.framework.TestCase;

public class TicketTest  extends TestCase {
	
	@Test
	public static void testSeat()
	{
		final ITicketPoolBLL iTicketPoolBLL=new TicketAppFileBasedFactory().getInstance("TicketPool");
		
		Thread oneTestThread=new Thread(new Runnable() {
			
			@Override
			public void run() {
				iTicketPoolBLL.decreaseOneTicket();
				
			}
		});
		Thread twoTestThread=new Thread(new Runnable() {
			
			@Override
			public void run() {
				iTicketPoolBLL.decreaseOneTicket();
				
			}
		});
		Thread threeTestThread=new Thread(new Runnable() {
			
			@Override
			public void run() {
				iTicketPoolBLL.decreaseOneTicket();
				
			}
		});
		oneTestThread.run();
		twoTestThread.run();
		oneTestThread.run();
		threeTestThread.run();
		int seatsSizeExpected=46;
		int seatsSizeActual=Integer.parseInt(iTicketPoolBLL.getTickets());
		assertEquals(seatsSizeActual, seatsSizeExpected);
	
	}
	
}

