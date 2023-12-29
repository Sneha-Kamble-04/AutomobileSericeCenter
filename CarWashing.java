package SnehaAutomobile;
import java.util.Scanner;
public class CarWashing extends CarService
{//single inheritance is use
    public void carWashing() 
    {
        //incomplete method is completed
        Scanner sc= new Scanner(System.in);
        System.out.println("\n1)Car Wash                      300 Rs" +
                "\n2)Car Wash with Deep Cleaning   500 Rs" +
                "\n3)Deep cleaning                 200 Rs" );
        System.out.println("Enter choice ");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1 : 
            {
                    System.out.println("For Car wash charges 300 Rs");
                    bill+="\nCar Wash                     300 Rs";
                    setPrice(300 + getPrice());
                    break;
            }

            case 2 :
            {
                System.out.println("For Car wash with deep clean charges 500 Rs");
                bill+="\nCar Wash with deep clean     500 Rs";
                setPrice(500 + getPrice());
                break;
            }
            case 3 :
            {
                System.out.println("For Deep clean charges 00 Rs");
                bill+="\nDeep cleaning                200 Rs";
                setPrice(200 + getPrice());
            }
            default : 
            	System.out.println("Enter valid case");
        }
    }
}