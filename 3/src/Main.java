import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number (1,2,3,4,5,6,7):");
        int day = input.nextInt();
        switch (day){
            case 1:
                System.out.println("Saturday!");
                break;
            case 2:
                System.out.println("Sunday!");
                break;
            case 3:
                System.out.println("Monday!");
                break;
            case 4:
                System.out.println("Tuesday!");
                break;
            case 5:
                System.out.println("Wednesday!");
                break;
            case 6:
                System.out.println("Thursday!");
                break;
            case 7:
                System.out.println("Friday!");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}