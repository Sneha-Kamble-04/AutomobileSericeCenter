package SnehaAutomobile;
import java.util.Scanner;
public abstract class CarService
{
    Scanner sc = new Scanner(System.in);
    private int price;//encapsulation i.e private member is declare
    public String bill="";
    char ch;
    public int getPrice() 
    {
    	return price;
    }//getter are use to retrieve value

    public void setPrice(int price) 
    {
    	this.price = price;
    	}//setter is use to set value

    abstract void carWashing();//abstract method definition written in Car washing class
    void basicServices()
    {
        //Basic maintenance related operations are perform in this method
        char ch;
        do {
            System.out.println("\n>>>>Basic Services<<<<" +
                    "\n1)Clutch Problem" +
                    "\n2)Break Problem" +
                    "\n3)Door Problem");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1 :
                {
                    System.out.println("For clutch repairing you have to pay 400 Rs");
                    bill+="\nClutch Service               400 Rs";//value store in bill name variable
                    setPrice(400 + getPrice());
                }
                case 2 :
                	
                {
                    System.out.println("For Break repairing you have to pay 500 Rs");
                    bill+="\nBreak Service                500 Rs";
                    setPrice(500 + getPrice());
                }
                case 3 :
                {
                    System.out.println("For Door problem solving you have to pay 800 Rs");
                    bill+="\nDoor Service                 800 Rs";
                    setPrice(800 + getPrice());
                }
                default :System.out.println("Enter valid case");
            }
            System.out.println("Do have any basic services (y/n)");
            ch=sc.next().charAt(0);
        }while(ch=='Y' ||ch=='y');
    }
    void engineServices()
    {
        //Engine related operations are perform in this method
        do 
        {
            System.out.println("\n>>>>Engine Services<<<<" +
                    "\n1)Oil Change" +
                    "\n2)Oil level check" +
                    "\n3)Engine servicing" );
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1 :
                {
                    System.out.println("For oil changing you have to pay 700 Rs");
                    bill+="\nOil Change                   700 Rs";
                    setPrice(700 + getPrice());
                    break;
                }
                case 2 :
                {
                    System.out.println("For oil level checking you have to pay 300 Rs");
                    bill+="\nOil Level Check              300 Rs";
                    setPrice(300 + getPrice());
                    break;
                }
                case 3 :
                {
                    System.out.println("For engine servicing you have to pay 5000 Rs");
                    bill+="\nEngine Service              5000 Rs";
                    setPrice(5000 + getPrice());
                    break;
                }
                default : System.out.println("Enter valid case");

            }
            System.out.println("Do have any engine services (y/n)");
            ch=sc.next().charAt(0);
        }while(ch=='Y' ||ch=='y');
    }
}

