package lab5;

import java.util.Scanner;

class account{
     public int balance=500;
    void create(){
        //int balance=500;
    System.out.println("Account is created");

}
 void deposite(int amount){

     int bal=balance+amount;
     System.out.println("TOTAL BALANCE"+bal);
}

 
void withdraw(int wamount){
    if(wamount>=500){
        System.out.println("Not enough balance");
    }
        else {
          balance=balance-wamount;
          System.out.println("TOTAL BALANCE"+balance);
          
        }

}


}
public class bank {
    public static void main(String[] args) {
        account a=new account();
      //  Scanner sc=new Scanner(System.in);
        a.create();
        System.out.println();
        //a.deposite();
        //System.out.println("Enter amount to be deposite");
        //int amt=sc.nextINT();
       a.deposite(100);
        System.out.println();
        a.withdraw(700);

       

    }
    
}
