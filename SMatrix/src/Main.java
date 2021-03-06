
public class Main {

	public static void main(String[] args) {
		printSpiral(SM(5));
	}

	public static int[][] SM(int size) {
		int[][] SM = new int[size][size];
		int con = (int) Math.ceil(size / 2);

		int current = 1;
		int sideLength = size;
		int j;

		for (int i = 0; i < con; i++) {
			for (j = 0; j < sideLength; j++) {
				SM[i][i + j] = current++;
			}
			for (j = 1; j < sideLength; j++) {
				SM[i + j][size - 1 - i] = current++;
			}
			for (j = sideLength - 2; j > -1; j--) {
				SM[size - 1 - i][i + j] = current++;
			}
			for (j = sideLength - 2; j > 0; j--) {
				SM[i + j][i] = current++;
			}
			sideLength -= 2;
		}
		return SM;
	}

	public static void printSpiral(int[][] array) {
		for (int[] row : array) {
			for (int elem : row) {
				System.out.printf("%3d", elem);
			}
			System.out.println();
		}
	}

}
