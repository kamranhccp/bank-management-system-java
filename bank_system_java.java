// Bank Management System using Java with Terminal Based
public class talha_bank {
    public static void main(String[] args) {
        System.out.println("Welcome to Talha Bank");
        System.out.println("Please select an option");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Check Balance");
        System.out.println("5. Exit");

        int option = 0;
        int balance = 0;
        int deposit = 0;
        int withdraw = 0;

        while (option != 5) {
            option = Integer.parseInt(System.console().readLine());
            switch (option) {
                case 1:
                    System.out.println("Enter your name");
                    String name = System.console().readLine();
                    System.out.println("Enter your CNIC");
                    String cnic = System.console().readLine();
                    System.out.println("Enter your phone number");
                    String phone = System.console().readLine();
                    System.out.println("Enter your address");
                    String address = System.console().readLine();
                    System.out.println("Enter your age");
                    int age = Integer.parseInt(System.console().readLine());
                    System.out.println(" ");
                    System.out.println("Account Created Successfully");
                    System.out.println(" ");
                    
                    // showing account details
                    System.out.println("Account Details");
                    System.out.println("Name: " + name);
                    System.out.println("CNIC: " + cnic);
                    System.out.println("Phone: " + phone);
                    System.out.println("Address: " + address);
                    System.out.println("Age: " + age);
                    System.out.println(" ");

                    
                    break;
                case 2: 
                    System.out.println("Enter the amount you want to deposit");
                    deposit = Integer.parseInt(System.console().readLine());
                    balance = balance + deposit;
                    System.out.println(" ");
                    System.out.println("Amount Deposited Successfully");
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("Enter the amount you want to withdraw");
                    withdraw = Integer.parseInt(System.console().readLine());
                    if (withdraw > balance) {
                        System.out.println(" ");
                        System.out.println("Insufficient Balance");
                        System.out.println(" ");
                    } else {
                        balance = balance - withdraw;
                        System.out.println(" ");
                        System.out.println("Amount Withdrawn Successfully");
                        System.out.println(" ");
                    }
                    break;
                case 4: 
                    System.out.println(" ");
                    System.out.println("Your Balance is: " + balance);
                    System.out.println(" ");
                    break;
                case 5:
                    System.out.println(" ");
                    System.out.println("Thank you for using Talha Bank");
                    System.out.println(" ");
                    break;
                default:
                    System.out.println(" ");
                    System.out.println("Invalid Option");
                    System.out.println(" ");
                    break;
                }
            }

                
    }
}
