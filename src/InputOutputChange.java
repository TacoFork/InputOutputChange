import java.util.Scanner;
public class InputOutputChange {
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        double num1, num2;
        double average = 0;

        System.out.print( "First temperature? " );
        num1 = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print( "Second temperature? " );
        num2 = keyboard.nextInt();
        keyboard.nextLine();

        average = (num1 + num2)/2;

        System.out.println("The average is: " + average);
    }
}
