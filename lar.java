// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class lar {
    public static int getLargest(int number[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }

        }
        return largest;
    }

    public static void main(String[] args) {
        int number[] = { 1, 3, 5, 8, 3 };
        System.out.println(getLargest(number));
        System.out.println("Done");
    }
}