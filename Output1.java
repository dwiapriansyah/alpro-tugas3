public class Output1 {
	public static void main(String[] args) {
		// Function to demonstrate printing pattern star
		int row;
		int maks_row = 6;
		int star;
		for(row=1; row< maks_row; row++) {
			for(star=1; star<=row; star++) {
				System.out.print("*");
				}
			System.out.println();
		}
	}
}
