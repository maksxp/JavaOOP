import java.util.Random;

public class Main {
		static int numberOfCores = Runtime.getRuntime().availableProcessors();
	public static void main(String[] args) {
		
	int[] array = new int[2000000];
	Random rn = new Random();
	for (int i = 0; i < array.length; i++) {
	array[i] = rn.nextInt(10);
	}
	int[] array2 = array.clone();
	long tstart = System.currentTimeMillis();
	System.out.println(sort(array));
	long tend = System.currentTimeMillis();
	System.out.println((tend - tstart) + " ms" + "- Static method sum");
	
	tstart = System.currentTimeMillis();
	System.out.println(MultiThreadSum.sort(array2, numberOfCores));
	tend = System.currentTimeMillis();
	System.out.println((tend - tstart) + " ms" + " - MultiThread sum");
	tstart = System.currentTimeMillis();
	
}
	public static int sort (int [] array){
		int temp=0;
		for (int i =0; i < array.length; i++) {
		temp += array[i];
		}
		return temp;
	}
}