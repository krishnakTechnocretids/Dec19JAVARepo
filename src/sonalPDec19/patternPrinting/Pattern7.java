package sonalPDec19.patternPrinting;
/*
  Pattern -
	*
	**
	***
	****
	*****
	****
	***
	**
	*
*/

public class Pattern7 {

	static void pattern() {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		int m = 4;
		for (int i = m; i >= 1; i--) {
			for (int j = m; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}

			System.out.println("");
		}
	}

	public static void main(String[] args) {
		pattern();
	}
}
