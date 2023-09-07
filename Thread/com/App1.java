package Thread.com;


class MyCounter1 extends Thread{
	private int threadNo;

	public MyCounter1(int threadNo) 
	{
		this.threadNo = threadNo;
	}
	
	@Override
	public void run() {
		countMe();
	}
	
	public void countMe(){
		for(int i=1; i<=9;i++){
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The value if i is: "+i+" and the thread number is: "+threadNo);
		}
	}
	
}

public class App1 {

	public static void main(String[] args) throws InterruptedException {
		MyCounter1 counter1 = new MyCounter1(1);
		MyCounter1 counter2 = new MyCounter1(2);
		
	    long startTime = System.currentTimeMillis();
		counter1.start(); //Run should be called by JVM
		System.out.println("**************************");
		counter2.start(); //Run should be called by JVM
		Thread.sleep(4505);
		long endTime = System.currentTimeMillis();
		System.out.println("Total time required to process: "+(endTime-startTime));
	}

}