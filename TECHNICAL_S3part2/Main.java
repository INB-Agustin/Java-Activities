package TECHNICAL_S3part2;
public class Main {
    public static void main(String[] args) {

        Arithmetic arithmetic = new Arithmetic();
        arithmetic.Add(1, 3);
        arithmetic.Add(1, 3, 4, 5);
        arithmetic.Multiply(2, 3, 4);
        arithmetic.Multiply(1, 1);
        arithmetic.Subtract(3, 1);
        arithmetic.Divide(5, 2);
    }
}
