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
//1314829488
//Enter the name
//yash
//Enter the email
//yasash
//Enter the address
//agra
//Enter the sim type
//prepaid
//Enter the adhar number
//533763
//Enter the initial balance
//200
//Congratulation your mobile number is 1314829488
//1: Prepaid user
//2: New Connection
//3.View All User
//0: Exit
//1
//Enter the Mobile Number
//65424275
//You have entered wrong mobile number
//Please enter correct mobile number
//1: Prepaid user
//2: New Connection
//3.View All User
//0: Exit
//1
//Enter the Mobile Number
//131482988
//You have entered wrong mobile number
//Please enter correct mobile number
//1: Prepaid user
//2: New Connection
//3.View All User
//0: Exit
//1
//Enter the Mobile Number
//1314829488
//0: Check balance and validity
//1: Recharge
//1
//Enter recharge amount
//500
//1: Prepaid user
//2: New Connection
//3.View All User
//0: Exit
//3
//User{name='yash', email='yasash', address='agra', simType='prepaid', adharNo=533763, balance=700.0, mobileNumber=1314829488, validity=2}
//1: Prepaid user
//2: New Connection
//3.View All User
//0: Exit
//
//Process finished with exit code 130