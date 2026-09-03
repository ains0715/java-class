import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class ExactPriceCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("단가(원): ");
        long prineWon = scanner.nextLong();
        System.out.print("수량(개): ");
        long count = scanner.nextLong();
        System.out.print("할인율(%): ");
        long discountRate = scanner.nextLong();



    }
}
