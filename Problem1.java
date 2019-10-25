import java.util.ArrayList;

public class Problem1 {
	
	/**
	* @author  Semih YOLCU
	* @since   2019-10-25 
	*/
	
	
	
	public static void main(String[] args) {		
		
		System.out.println(Problem1());
		
	}
	
	
	
	// Problem name : Multiples of 3 and 5 
	// Problem explanation : If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.Find the sum of all the multiples of 3 or 5 below 1000.
	
	// Problem ismi : 3 ve 5'in katlar�. 
	/* Problem A��klamas� : 
	 * 10 say�s�n�n alt�nda ki 3 ve 5 in katlar� 3,5,6 ve 9 say�lar�d�r ve bu say�lar�n toplam� ise 23't�r. 
	 * Peki 1000 say�s�n�n alt�nda ki 3 ve 5 in katlar�n�n toplam� nedir? */
	
	
	private static int Problem1() {
		
		int total = 0; 


		for( int i = 3 ; i<1000 ; i++) {
			
			
		    if (i % 3 == 0 || i % 5 == 0) {
		    	
		        total += i;
		        
		      }
			
		}
		
		
		return total;
	}



	
	
	

}
