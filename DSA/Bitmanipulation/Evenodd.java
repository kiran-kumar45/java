package DSA.Bitmanipulation;

public class Evenodd {
    public static void Eveodd(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }

    public static void main(String[] args) {
        Eveodd(3);
        Eveodd(14);
    }
}