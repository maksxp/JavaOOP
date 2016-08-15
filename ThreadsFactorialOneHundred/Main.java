
public class Main {

	public static void main(String[] args) {
		Thread [] threadArray = new Thread [100];
		//create an array of threads 
		for (int i=0; i<100;i++){
			threadArray[i]=new Thread(new FactorialCounter()); 
					
		}
		//start all threads in cycle below
		for (int i=0; i<100;i++){
			threadArray[i].start(); 
		}
	}
}