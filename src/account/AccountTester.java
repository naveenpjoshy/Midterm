/*

* To change this license header, choose License Headers in Project Properties.

* To change this template file, choose Tools | Templates

* and open the template in the editor.

*/

package account;

import java.util.Scanner;

/**

*

* @author Denbin Jose

*/

public class AccountTester {

   

    public static void main(String[] args) {

        /*here assumed that 500 accounts can be created

        for the given bank*/

        Account ac[]=new Account[500];

       

        System.out.println("enter initial amount:");

       

        Scanner sc=new Scanner(System.in);

        double bal=sc.nextDouble();

       

        System.out.println("Please enter the unique user name:");

        sc.nextLine();

        String user=sc.nextLine();

       

        Account a=new Account(bal,user);

        ac[0]=a;

       

       if(a.getBalance()>50){

               

        System.out.println("Account is created successfully");    

        System.out.println(" balance : "+a.getBalance()); 

        System.out.println(" Interest per month is "+a.getInterestRate());

       

        System.out.println("The Final Balance "+a.getYearlyInterestRate());

       }

       else

           System.out.println("Account creation failed");

          

    }

}



 

