package Thread.com;
class Brakets{
	synchronized public void generate(){
		for(int i=1; i<=10; i++){
			if(i<=5){
				System.out.print("[");
			}else{
				System.out.print("]");
			}
		}
		System.out.println();
	}
	
}

public class App3 {

	public static void main(String[] args) {
		Brakets braket = new Brakets();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1; i<=5; i++){
					braket.generate();
				}

			}
		}).start();
		
       new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1; i<=5; i++){
					braket.generate();
				}

			}
		}).start();
		

	}

}