package syn;


class reciever{
	public static void recieve(String Msg)
	{
		System.out.println("Sending "+Msg);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("Thrade interuppted");
		}
		System.out.println(Msg +" Sent");
	}
}

class thread1 extends Thread{
	private String Msg;
	reciever sent;
	public thread1(String msg, reciever sent) {
		super();
		Msg = msg;
		this.sent = sent;
	}
	public void run()
	{
			reciever.recieve(Msg);
	}
	
	
}
public class sample {
	public static void main(String Args[]) {
		reciever r1 = new reciever();
		thread1 t1 = new thread1("hi",r1);
		thread1 t2 = new thread1("bye",r1);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}
		catch(Exception e)
		{
			System.out.println("Interrupted");
		}
	}
	
	
	

}
