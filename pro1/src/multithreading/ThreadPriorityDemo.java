package multithreading;

class MyThread1 extends Thread {
	
	public MyThread1(String str) {
		super(str);
	}

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Running Thread: "+Thread.currentThread());
			try {
				Thread.sleep(5000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 t1 = new MyThread1("First Thread");
		MyThread1 t2 = new MyThread1("Second Thread");
		MyThread1 t3 = new MyThread1("Third Thread");
		
		System.out.println("Thread names are following:");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t2.start();
		t1.start();
		t3.start();
	}

}
