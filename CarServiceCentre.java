package SnehaAutomobile;
import java.util.Scanner;
public class CarServiceCentre extends CarWashing implements ServiceOffice{
    String name,c_name,c_model;
    int c_year;
    long m_no;
    Scanner sc=new Scanner(System.in);
    String acceptDetails()
    {//method overloading

        System.out.println("Welcome to Sneha's Car Service Center\n" +
                "Please do registration first\n");
        System.out.println("Enter your name");
        name=sc.next();
        System.out.println("Enter your mobile no");
        m_no=sc.nextLong();
        System.out.println("Enter your car name");
        c_name=sc.next();
        return c_name;
    }
    void acceptDetails(String c_name)
    {// method overloading
        System.out.println("Enter car model");
        c_model=sc.next();
        System.out.println("Enter car purchasing year");
        c_year=sc.nextInt();
    }
    @Override

    public void services() 
    {
        acceptDetails(acceptDetails());
        char ch;
        do
        {
           System.out.println("\n>>>>>> Available Services <<<<<<<" +
                   "\n1)Basic service" +
                   "\n2)Engine Service" +
                   "\n3)Car Washing");
           System.out.print("Enter choice:-");
           int choice=sc.nextInt();
           switch (choice)
           {
               case 1 :basicServices();
               case 2 :engineServices();
               case 3 :carWashing();
               default:System.out.println("Enter valid case");
           }
           System.out.println("Do you have more services (y/n)");
           ch=sc.next().charAt(0);
        }while(ch=='y' || ch=='Y');
       displayBill();
    }
    void displayBill()
    {
        System.out.print("\nCustomer name:- "+name);
        System.out.print("\nCustomer mobile no:- "+m_no);
        System.out.print("\nCustomer car name:- "+c_name);
        System.out.print("\nCustomer car model:- "+c_model);
        System.out.print("\nCustomer car purchasing year:- "+c_year);
        System.out.println(">>>>>>>> Bill Details <<<<<<<<<<<<");
        System.out.print("Service Name                  Price");
        System.out.println(bill);
        System.out.println("-------------------------------------\n" +
                "Total                       "+getPrice()+"Rs");
        payBill();

    }
    public void payBill()
    {
        boolean f=true;
        System.out.println("\nOur car is ready sir play pay a bill");
        do 
        {
            System.out.println("\n>>>>Payment mode<<<<" +
                    "\n1)Google pay" +
                    "\n2)Phone pay" +
                    "\n3)Cash");
            System.out.println("choose payment mode");
            int pay = sc.nextInt();
            switch (pay)
            {
                case 1 :
                {
                    System.out.println("Welcome to Google pay mode enter your pin");
                    int pin = sc.nextInt();
                    if (pin == pin)
                    {
                        System.out.println("Payment Done.....\nThank you Sir Please visit again....");
                        f=false;
                    } 
                    else 
                    {
                        System.out.println("Entered wrong pin");
                    }
                    break;
                }
                case 2 :
                {
                    System.out.println("Welcome to Phone pay mode enter your pin");
                    int pin = sc.nextInt();
                    if (pin == pin)
                    {
                        f=false;
                        System.out.println("Payment Done.....\nThank you Sir Please visit again....");
                    } 
                    else
                    {
                        System.out.println("Enter wrong pin");
                    }
                    break;
                }
                
                case 3 :
                {
                    f=false;
                    System.out.println("Payment Done.....\nThank you Sir Please visit again....");
                    break;
                }
                default : System.out.println("Payment process not done\nPlease try again");
            }
        }while(f);
    }
    public static void main(String[] args) 
    {
        new CarServiceCentre().services();
    }
}