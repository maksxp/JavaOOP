import java.math.BigInteger;

public class FactorialCounter implements Runnable {
   
		//method below counts factorial
	private static BigInteger factorial (BigInteger  numberToCount){
		if (numberToCount.equals(BigInteger.ZERO))
			return BigInteger.ZERO;
		if (numberToCount.equals(BigInteger.ONE))
			return BigInteger.ONE;
		return numberToCount.multiply(factorial(numberToCount.subtract(BigInteger.ONE)));
		}

	@Override
	public void run() {
		//gets string with only digits from the name of thread
		String str = Thread.currentThread().getName().replaceAll("\\D+","");
		//converts string str into the bigInteger
		BigInteger big = BigInteger.valueOf((long)Integer.parseInt(str));
		System.out.println(factorial( big));
	}

}
