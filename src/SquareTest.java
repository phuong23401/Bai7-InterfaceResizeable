import java.util.Scanner;

public class SquareTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);

        System.out.print("Nhập tỷ lệ: ");
        double percent = scanner.nextDouble();
        square.resize(percent);
    }
}
