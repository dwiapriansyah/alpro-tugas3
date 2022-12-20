public class Output2 {
	public static void main(String[] args) {
		// Function to demonstrate printing pattern number
		int row;
		int maks_row = 6;
		int i;
		for(row=1; row< maks_row; row++) {
			for(i=1; i<=row; i++) {
				System.out.print(i + " ");
				}
			System.out.println();
		}
	}
}