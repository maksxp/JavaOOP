
public class SingleThreadSum implements Runnable{
	private int sum;
	private int[] array;
	private int begin;
	private int end;
	private Thread thr;
	private int index;
	private boolean stop = false;
	
	public SingleThreadSum(int[] array, int begin, int end) {
		this.array = array;
		this.begin = begin;
		this.end = end;
		thr = new Thread(this);
		thr.start();
		this.index = begin;
		}
	public Thread getThr() {
		return thr;
		}
	
	public int getSum() {
		return sum;
	}
	public boolean isStop() {
		return stop;
		}
	public void run() {
		int temp=0;
		for (int i = begin; i < end; i++) {
		temp += array[i];
		}
		sum=temp;
		}
	
}
