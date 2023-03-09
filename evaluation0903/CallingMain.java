package evaluation0903;

import java.util.Scanner;

public class CallingMain {
    public static void main(String[] args) {
        boolean exit = true;
        Scanner scanner = new Scanner(System.in);
        Telecom telecom = new Telecom();
        while(exit){
            System.out.println("1: Prepaid user\n2: New Connection\n3.View All User\n0: Exit");
            int choice = scanner.nextInt();
            switch (choice){
                case 1: telecom.prepaid();
                break;
                case 2: telecom.newConnection();
                break;
                case 3: telecom.viewUser();
                break;
                case 0: exit=false;
            }
        }
    }
}
//1: Prepaid user
//2: New Connection
//3.View All User
//0: Exit
//2
//Enter the name
//yash
//Enter the email
//yaassa
//Enter the address
//uyadaciug
//Enter the sim type
//prepaid
//Enter the adhar number
//3456
//Enter the initial balance
//100
//Congratulation your mobile number is 1188565335
//1: Prepaid user
//2: New Connection
//3.View All User
//0: Exit
//3
//1: Prepaid user
//2: New Connection
//3.View All User
//0: Exit
//3
//User{name='yash', email='yaassa', address='uyadaciug', simType='prepaid', adharNo=3456, balance=100.0, mobileNumber=1188565335, validity=1}
//1: Prepaid user
//2: New Connection
//3.View All User
//0: Exit
//1
//Enter the Mobile Number
//355
//You have entered wrong mobile number
//Please enter correct mobile number
//1: Prepaid user
//2: New Connection
//3.View All User
//0: Exit
//1
//Enter the Mobile Number
//1188565335
//0: Check balance and validity 
//1: Recharge
//0
//Your balance is 100.0 validity is 1
//1: Prepaid user
//2: New Connection
//3.View All User
//0: Exit
//1
//Enter the Mobile Number
//1188565335
//0: Check balance and validity 
//1: Recharge
//1
//Enter recharge amount
//0
//you have entered wrong amount
//Amount should be greater than 0
//1: Prepaid user
//2: New Connection
//3.View All User
//0: Exit
//1
//Enter the Mobile Number
//1188565335
//0: Check balance and validity 
//1: Recharge
//1
//Enter recharge amount
//1000
//1: Prepaid user
//2: New Connection
//3.View All User
//0: Exit
//1
//Enter the Mobile Number
//1188565335
//0: Check balance and validity 
//1: Recharge
//0
//Your balance is 1100.0 validity is 2
//1: Prepaid user
//2: New Connection
//3.View All User
//0: Exit
//0
//
//Process finished with exit code 0
