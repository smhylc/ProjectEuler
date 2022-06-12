public final class Problem8{
	
	public static void main(String[] args) {
		System.out.println(new Problem8().calculate());
	}
	
	
	private static final int pe = 1000;
	
	public String calculate() {
		for (int a = 1; a < pe; a++) {
			for (int b = a + 1; b < pe; b++) {
				int c = pe - a - b;
				if (a * a + b * b == c * c) {
					return Integer.toString(a * b * c);
				}
			}
		}
	}
	
}
