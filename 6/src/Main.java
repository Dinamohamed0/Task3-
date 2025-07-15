import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");//هنا هنكتب رقم علشان نعكسه
        int number = input.nextInt();
        int reverse = 0;
        while (number !=0 ){
            int digit = number % 10 ;
            reverse = reverse * 10 + digit ;
            number = number/10;

        }
        System.out.println("Reverse number="+reverse);
    }
}