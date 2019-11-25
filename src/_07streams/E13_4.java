package _07streams;

public class E13_4 {
    public static void main(String[] args) {
        int integer = binary2int("1100110111101110", 0, 0);
        System.out.println(integer);
    }

    public static int binary2int(String binary, int current, int power) {
        if (binary.length() == 1) {
            if (binary.charAt(0) == '0') {
                return current;
            } else {
                return (int) (current + Math.pow(2, power));
            }
        } else {
            if (binary.charAt(binary.length() - 1) == '1') {
                current += (int) Math.pow(2, power);
            }
            return binary2int(binary.substring(0, binary.length() - 1), current, power + 1);
        }
    }
}
