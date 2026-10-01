package multithreading;


class NameThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running thread "+Thread.currentThread());
	}
	
}

public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameThread t1 = new NameThread();
		NameThread t2 = new NameThread();
		Thread ta = new Thread(t1);
		Thread tb = new Thread(t2);
		ta.setName("I am First Thread");
		tb.setName("I am Second Thread");
		ta.start();
		tb.start();
		System.out.println("Thread names are following: ");
		System.out.println(ta.getName());
		
		try {
			Thread.sleep(5000);
		}catch (Exception e) {
			System.out.println(tb.getName());
		}
		
	}

}
