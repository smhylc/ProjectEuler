public final class Problem4  {
	
  	/**
	 * @author Semih YOLCU
	 * @create-date 2022-06-04
	 */

	
	public static void main(String[] args) {
		System.out.println(new p004().run());
	}
	
	public String run() {
		int maxPalin = -1;
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				int prod = i * j;
				if (Library.isPalindrome(prod) && prod > maxPalin)
					maxPalin = prod;
			}
		}
		return Integer.toString(maxPalin);
	}
	
}
