package evaluation0903;

public class User {
    String name,email,address,simType;
    int adharNo;
    double balance;
    int mobileNumber,validity;

    public User(String name, String email, String address, String simType, int adharNo, double balance, int mobileNumber) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.simType = simType;
        this.adharNo = adharNo;
        this.balance = balance;
        this.mobileNumber = mobileNumber;
        validity =1;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", simType='" + simType + '\'' +
                ", adharNo=" + adharNo +
                ", balance=" + balance +
                ", mobileNumber=" + mobileNumber +
                ", validity=" + validity +
                '}';
    }
}
