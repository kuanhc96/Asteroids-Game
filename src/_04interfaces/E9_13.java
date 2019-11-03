package _04interfaces;

public class E9_13 { //better rectangle
    public static void main(String[] args) {
        BetterRectangle br = new BetterRectangle();
        System.out.println("Original Perimeter: " + br.getPerimeter());
        System.out.println("Original Area: " + br.getArea());
        br.setSize(10, 50);
        System.out.println("perimeter: " + br.getPerimeter());
        System.out.println("area: " + br.getArea());
    }
}
