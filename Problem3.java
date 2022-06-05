public final class Problem3 {

	/**
	 * @author Semih YOLCU
	 * @create-date 2022-06-02
	 */

	
	public static void main(String[] args) {
		System.out.println(new p003().run());
	}
	
	public String run() {
		long n = 600851475143L;
		while (true) {
			long p = smallestFactor(n);
			if (p < n)
				n /= p;
			else
				return Long.toString(n);
		}
	}

	private static long smallestFactor(long n) {
		if (n <= 1)
			throw new IllegalArgumentException();
		for (long i = 2, end = Library.sqrt(n); i <= end; i++) {
			if (n % i == 0)
				return i;
		}
		return n;  
	}
	
}
