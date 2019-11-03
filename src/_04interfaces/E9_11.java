package _04interfaces;


public class E9_11 { // person
    public static void main(String[] args) {
        Person kuan = new Student("Kuan", 1996, "Chemical Engineering");
        Person yolanda = new Person("Yolanda", 2000);
        Instructor patricia = new Instructor("Patricia", 1968, 120000);
        System.out.println(kuan);
        System.out.println(yolanda);
        System.out.println(patricia);
        patricia.setSalary(130000);
        System.out.println(patricia);
        ((Student) kuan).setMajor("Computer Science");
        System.out.println(kuan);
    }
}
