public class E2_20 {
	
	public static void main(String[] args) {
		drawTree();
	}

	private static void drawTree() {
		for (int i = 0; i < 4; i++) {
			drawLeaves(4-i, 2*i);
		}
		drawBase();
		drawTrunk(3);
	}

	private static void drawLeaves(int rightShift, int inBetween) {
		for (int i = 0; i < rightShift; i++) {
			System.out.print(" ");
		}
		System.out.print("/");
		for (int j = 0; j < inBetween; j++) {
			System.out.print(" ");
		} 
		System.out.println("\\");
	}

	private static void drawBase() {
		System.out.println(" --------");
	}

	private static void drawTrunk(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("   \"  \"");
		}
	}
}
