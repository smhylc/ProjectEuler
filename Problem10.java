public final class Problem7 {
	
	public static void main(String[] args) {
		System.out.println(new p010().run());
	}

	private static final int LIMIT = 2000000;
  
	public String run() {
		long sum = 0;
		for (int p : Library.listPrimes(LIMIT - 1))
			sum += p;
		return Long.toString(sum);
	}
	
}
