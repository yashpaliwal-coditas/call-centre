package evaluation0903;

import javafx.scene.transform.Scale;

import java.util.*;

public class Telecom {
    Scanner scanner = new Scanner(System.in);

    ArrayList<User> list = new ArrayList<>();
    void prepaid(){
        System.out.println("Enter the Mobile Number");
        int mobilNo=scanner.nextInt();
        boolean exist=false;
        for(User user1:list){
            if(user1.mobileNumber==mobilNo){
                exist = true;
                System.out.println("0: Check balance and validity \n1: Recharge");
                int choice = scanner.nextInt();
                switch (choice){
                    case 0:
                        System.out.println("Your balance is "+user1.balance+" validity is "+user1.validity);
                        break;
                        case 1:
                            System.out.println("Enter recharge amount");
                            int amount=scanner.nextInt();
                            if(amount <= 0){
                                try{
                                    throw new RechargeAmountTooLowException();
                                }catch (RechargeAmountTooLowException r){
                                    System.out.println("Amount should be greater than 0");
                                }
                            }
                            else{
                            user1.balance+=amount;
                            user1.validity+=1;
                            }


                }
            }
        }
        if(!exist){
            try{
                throw new UserDoesNotExistException();
            }
            catch (UserDoesNotExistException e){
                System.out.println("Please enter correct mobile number");
            }
        }

    }
    void newConnection(){
        int mobilno;

        while(true) {
            Random random = new Random();
            mobilno = random.nextInt(900000000) + 1000000000;
            boolean exist=false;
            for(User user1:list) {
                if (user1.mobileNumber == mobilno) {
                    exist = true;
                }
            }
            if(!exist){
                break;
            }
        }
        System.out.println("Enter the name");
        String name = scanner.nextLine();
        System.out.println("Enter the email");
        String email = scanner.nextLine();
        System.out.println("Enter the address");
        String address= scanner.nextLine();
        System.out.println("Enter the sim type");
        String simType = scanner.nextLine();
        System.out.println("Enter the adhar number");
        int adharNumber= scanner.nextInt();
        System.out.println("Enter the initial balance");
        int balance = scanner.nextInt();
        list.add(new User(name,email,address,simType,adharNumber,balance,mobilno));
        System.out.println("Congratulation your mobile number is "+mobilno);
    }
    void viewUser(){
        Collections.sort(list,new Comparator<User>(){
            public int compare(User u1,User u2){
                return (u1.name).compareTo(u2.name);
            }
        });
        for(User user : list)
        System.out.println(user);
    }
}
