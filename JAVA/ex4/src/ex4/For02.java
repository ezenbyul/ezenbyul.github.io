package ex4;

public class For02 {
	public static void main(String[] args) {
//		System.out.println("=============================================");
//		System.out.println("====================±¸±¸´Ü====================");
//		System.out.println("=============================================");
//		for(int i=2 ; i < 10 ; i++) {
//			for(int y=1 ; y<10 ; y++) {
//				System.out.print(i+"X"+y+" = "+i*y+"  ");
//			}
//			System.out.println();
//		}
//		System.out.println("=============================================");
//		for(int i=1 ; i < 10 ; i++) {
//			for(int y=2 ; y<10 ; y++) {
//				System.out.print(y+"X"+i+" = "+y*i+"  ");
//			}
//			System.out.println();
//		}
//		System.out.println("=============================================");
//		System.out.println("====================º°Âï±â====================");
//		System.out.println("=============================================");
//		for(int i = 1 ; i<5 ; i++ ) {
//			for( int y = 0 ; y<i ; y++ ) {
//				System.out.print("*");
//			}
//			System.out.println(); 
//		}
//		System.out.println("=============================================");
//		for(int i = 1 ; i<5 ; i++ ) {
//			for( int y = 5 ; y>i ; y-- ) {
//				System.out.print("*");		
//			}	
//			System.out.println();
//		}
//		System.out.println("=============================================");
//		for(int i = 1 ; i<5 ; i++ ) {
//			for( int y = 1 ; y<=5-i ; y++ ) {
//				System.out.print("*");		
//			}	
//			System.out.println();
//		}
		System.out.println("=============================================");
		for(int i = 0 ; i<9 ; i ++) {
			if(i<5) {
			for(int y = 0 ; y <= i ; y++) {
				System.out.print("*");
			}
			System.out.println();
			}else{			
			for (int y = 4; y>i-5 ; y--) {
				System.out.print("*");
			}
//			for (int y = 1 ; y <=11-i;y++) {
//				System.out.print("*");
//			}
			if(i!=9) {System.out.println();}
			}			
		}
		System.out.println("====================°­»ç´Ô=====================");
		for(int i = 1; i<=7; i++) {
			if ( i<=4 ) {
				for ( int j=1; j<=i; j++) {
					System.out.print("*");
				}
			}else {
				for ( int j=1; j<=8-i; j++) {
					System.out.print("*");
				}				
			}
			System.out.println();
		}
	}
}
