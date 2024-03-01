
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ATM obj=new ATM();
        obj.checkPin();


    }
}
class ATM{
    float Balance;
    int PIN=1231;

    public void checkPin() {
        System.out.println("Enter your pin");
        Scanner sc = new Scanner(System.in);
        int enterPin = sc.nextInt();
        if (enterPin == PIN) {
            menu();
        } else {
            System.out.println("Please Enter a Valid Pin");
            menu();
        }
    }
        public void menu()
        {
            System.out.println("Enter your Choice:");
            System.out.println("1. Check A/C Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Desposit Money");
            System.out.println("4. EXIT");
            Scanner sc=new Scanner(System.in);
            int opt=sc.nextInt();

            if(opt==1)
            {
                checkBalance();

            }else if(opt==2)
            {
                withdrawMoney();


            }
            else if(opt==3)
            {
                despositMoney();

            }else if(opt==4)
            {
                return;
            }else{
                System.out.println("Enter a valid choice");

            }


        }
        public void checkBalance()
        {
            System.out.println("Balance: "+Balance);
            menu();
        }
        public void withdrawMoney()
        {
            System.out.println("Enter Amount to Withdraw");
            Scanner sc=new Scanner(System.in);
            float amount=sc.nextFloat();
            if(amount>Balance)
                System.out.println("Insufficient Balance");
            else {
                Balance=Balance-amount;
                System.out.println("Money Withdraw Sucessfully");


           }
            menu();
        }
        public void despositMoney()
        {
            System.out.println("Enter the Amount");
            Scanner sc=new Scanner(System.in);
            float amount=sc.nextFloat();
            Balance=Balance+amount;
            System.out.println("Money Desposited Successfully");
            menu();
        }



    }
