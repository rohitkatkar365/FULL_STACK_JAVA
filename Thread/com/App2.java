package Thread.com;

import java.util.Random;


class MyCount implements Runnable{
	private int threadNo;

	public MyCount(int threadNo) {
		this.threadNo = threadNo;
	}

	@Override
	public void run() {
		Random random = new Random();
		for(int i = 0;i<=9;i++) {
			try {
				Thread.sleep(random.nextInt(500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The value if i is: "+i+" and the thread number is: "+threadNo);
		}
		
	}
	
	
}

public class App2 {

	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(new MyCount(1));
		Thread thread2 = new Thread(new MyCount(2));
		
		thread1.start();
		thread2.start();
				
	   
}
}