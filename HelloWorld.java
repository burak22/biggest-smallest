import java.util.Scanner;
public class HelloWorld{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz? ");
        int countNumbers = sc.nextInt();
        int smallest = Integer.MAX_VALUE;
        int biggest = Integer.MIN_VALUE;
        for (int i = 1; i <= countNumbers; i++) {
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
