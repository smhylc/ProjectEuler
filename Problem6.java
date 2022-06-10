public final class Problem6 {
	
	public static void main(String[] args) {
		System.out.println(new Problem6().run());
	}
	
	private static final int N = 100;
	
	public String run() {
		int sum = 0;
		int sum2 = 0;
		for (int i = 1; i <= N; i++) {
			sum += i;
			sum2 += i * i;
		}
		return Integer.toString(sum * sum - sum2);
	}
	
}
