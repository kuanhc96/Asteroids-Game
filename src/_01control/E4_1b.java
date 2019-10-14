public class E4_1b {
	public static void main(String[] args) {
		int sumSquared = 0;
		for (int i = 1; i < 101; i++) {
			sumSquared += Math.pow(i, 2);
		}
		System.out.println(sumSquared);
	}
}
