package sairajJDec19.assignment4;

public class Pattern7 {
	public static void main(String[] args) {
		for(int i=1; i<=5;i++) {
			for(int j=5; j>=1;j--) {
				if(j>i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for(int i=4; i>=1;i--) {
			for(int j=5; j>=1;j--) {
				if(j>i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
