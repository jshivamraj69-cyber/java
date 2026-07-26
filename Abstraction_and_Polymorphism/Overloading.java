package Abstraction_and_Polymorphism;

public class Overloading {

    public int sum(int a, int b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }

    public int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        Overloading overload = new Overloading();

        int sum = overload.sum(3, 4);
        String b = "b";

        System.out.println(overload.add("a", b));
        System.out.println(overload.sum(5, sum));
    }
}