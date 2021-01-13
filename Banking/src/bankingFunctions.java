
import java.util.Scanner;
public class  bankingFunctions{
    private int accNo;
    private double bal;
    private String name;
    private String gender;
    Scanner scanner = new Scanner(System.in);
    void newAccount() {
        System.out.print("Enter the account number to create: ");
        accNo = scanner.nextInt();
        System.out.print("Enter the name on the account: ");
        name = scanner.next();
        System.out.print(name + ", Please enter the gender of the account holder: ");
        gender = scanner.next();
        System.out.print("Enter the initial money deposit: ");
        bal = scanner.nextDouble();
    }
    void dep(){
        System.out.print("Please enter the money you want to deposit: ");
        double dp = scanner.nextDouble();
        bal += dp;
    }
    void with() {
        System.out.print("Please enter the money you want to withdraw: ");
        double dp = scanner.nextDouble();
        bal -= dp;
    }
    boolean find( int num ){
        if( num == accNo){
            return true;
        }
        return false;
    }
    void disp(){
        System.out.print("The account no is " + accNo + ". It is held by " + name + "(" + gender + "). The account balance is " + bal + ".");
    }
}
