package multithreading;

class MyThread2 extends Thread{

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Child: "+i);
		}
	}
	
}

public class ThreadJoinDemo  {

	public static void main(String[] args)throws InterruptedException {
		MyThread2 t = new MyThread2();
		t.start();
		t.join();//Main waits here, allows t to finish
		for(int i=1;i<=5;i++) {
			System.out.println("Main "+i);
		}
	}

}
