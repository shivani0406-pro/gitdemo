package multithreading;

class MyThread extends Thread{

	@Override
	public void run() {
		System.out.println("Running thread "+Thread.currentThread());
	}
	
}

public class MultiThread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		
		t1.start();
		t2.start();
		
		System.out.println("Thread names are following: ");
		System.out.println(t1.getName());
		System.out.println(t2.getName());

	}

}
