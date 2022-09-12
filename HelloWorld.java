import java.util.Scanner;
public class HelloWorld{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz? ");
        int countNumbers = sc.nextInt();
        double smallest = Double.POSITIVE_INFINITY;
        double biggest = Double.NEGATIVE_INFINITY;
        for (int i = 1; i < countNumbers; i++) {
            System.out.print(i + ".  ");
            int number = sc.nextInt();
            smallest = (number<smallest)? number:smallest;
            biggest = (number>biggest)? number:biggest;
        }
        System.out.println("En büyük: " + biggest);
        System.out.println("En küçük: " + smallest);
        sc.close();

    }            
}