
public class MultiThreadSum {
		static int sort(int[] array, int threadNumber) {
				SingleThreadSum[] threadarray = new SingleThreadSum[threadNumber];
		for (int i = 0; i < threadarray.length; i++) {
		int size = array.length / threadNumber;
		int begin = size * i;
		int end = ((i + 1) * size);
		if ((array.length - end) < size) {
		end = array.length;
		}
		threadarray[i] = new SingleThreadSum(array, begin, end);
		}
		for (int i = 0; i < threadarray.length; i++) {
		try {
		threadarray[i].getThr().join();
		} catch (InterruptedException e) {
		System.out.println(e);
		}
		}
		int sum=0;
		for(int i=0;i<threadarray.length;i++)
        sum+=threadarray[i].getSum();
		return sum;
	}
	
	
}
