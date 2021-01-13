import java.util.Scanner;
public class bankingTester {
    public static void main(String[] args){
        bankingFunctions bank[] = new bankingFunctions[100];
        Scanner scanner = new Scanner(System.in);
        int op = 0;

        System.out.println("Please choose one of the options from the menu to get started: ");
        System.out.println("1. Open a new bank account");
        System.out.println("2. Deposit money into the account");
        System.out.println("3. Withdraw money from the account");
        System.out.println("4. View your bank account");
        System.out.println("5. Display all the bank accounts");
        System.out.println("6. Exit");
        op  = scanner.nextInt();
        int cnt =0;
        do{

            if(op == 1){
                bank[cnt] = new bankingFunctions();
                bank[cnt].newAccount();
                cnt++;
            }
            if(op == 2) {
                System.out.print("Enter the account number to search");
                int inp = scanner.nextInt();
                for (int i = 0; i < 100; i++) {
                    if (bank[i].find(inp)) {
                        bank[i].dep();
                        break;
                    }
                }
            }
            if(op == 3){
                System.out.print("Enter the account number to search");
                int inp = scanner.nextInt();
                for (int i = 0; i < 100; i++) {
                    if (bank[i].find(inp)) {
                        bank[i].with();
                        break;
                    }
                }
            }

            if(op == 4) {
                System.out.print("Enter the account number to search");
                int inp = scanner.nextInt();
                for (int i = 0; i < 100; i++) {
                    if (bank[i].find(inp)) {
                        bank[i].disp();
                        break;
                    }
                }
            }
            if(op == 5){
                for(int i= 0; i < cnt; i++){
                    bank[i].disp();
                }
            }

            System.out.println("Please choose one of the options from the menu to get started: ");
            op  = scanner.nextInt();
        }
        while(op != 6);
    }
}