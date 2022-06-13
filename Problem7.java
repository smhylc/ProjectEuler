public final class Problem7 {
	
	public static void main(String[] args) {
		System.out.println(new Problem7().calculate());
	}

	public String calculate() {
		for (int i = 2, count = 0; ; i++) {
			if (Library.isPrime(i)) {
				count++;
				if (count == 10001)
					return Integer.toString(i);
			}
		}
	}
	
}
