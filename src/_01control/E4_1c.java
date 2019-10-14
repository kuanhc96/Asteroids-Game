public class E4_1c {
	public static void main(String[] args) {
		int sumPow = 0;
		for (int i = 0; i < 21; i++) {
			sumPow += Math.pow(2, i);
		}
		System.out.println(sumPow);
	}
}
