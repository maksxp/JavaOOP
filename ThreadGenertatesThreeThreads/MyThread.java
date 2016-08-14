
public class MyThread extends Thread{
  
	@Override
	
	public void run() {
	System.out.println(Thread.currentThread().getName());
	Thread t1 = new MyThread();
	Thread t2 = new MyThread();
	Thread t3 = new MyThread();
		if(!this.isInterrupted()){
		t1.start();
		t2.start();
		t3.start();
		t1.interrupt();
		t2.interrupt();
		t3.interrupt();
		}
	else {
		System.out.println(t1.getName()+" last");
		System.out.println(t2.getName()+" last");
		System.out.println(t3.getName()+" last");
		return;
	
	}}
	}
