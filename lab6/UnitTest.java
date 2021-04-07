package lab6;
import java.awt.print.Book;
import java.util.Scanner;
public class UnitTest {

	    public static void main(String[] args) {
	        Scanner sn = new Scanner(System.in);

	        while(true)
	        {
	            Order.showMenu();
	            int choose = sn.nextInt();
	            boolean exit = false;

	            switch (choose)
	            {
	                case 0:
	                {
	                    exit = true;
	                    break;
	                }

	                case 1:
	                {
	                    System.out.println("Create new order");
	                    Order newOrder = new Order();
	                    break;
	                }

	                case 2:
	                {

	                    System.out.println("Add item to the order");
	                    System.out.println("1. Digital Disc");
	                    System.out.println("2. Books");

	                    int choose2 = sn.nextInt();
	                    sn.nextLine();

	                    System.out.print("Title: ");
	                    String title = sn.nextLine();
	                    System.out.print("Category: ");
	                    String category = sn.nextLine();
	                    System.out.print("Cost: ");
	                    float cost = sn.nextFloat();
	                    sn.nextLine();

	                    switch (choose2)
	                    {
	                        case 1:
	                        {
	                            System.out.print("Directory: ");
	                            String directory = sn.nextLine();
	                            System.out.print("Length: ");
	                            int length = sn.nextInt();
	                            DigitalVideoDisc newDisc = new DigitalVideoDisc(title, category, cost, directory, length);
	                            System.out.println("Choose order to add");
	                            Order.listOrder();
	                            int choose3 = sn.nextInt();
	                            sn.nextLine();
	                            Order.getOrderList().get(choose3 - 1).addMedia(newDisc);
	                            break;
	                        }

	                        case 2:
	                        {
	                            Books newBook = new Books(title, category, cost);
	                            System.out.println("Choose order to add");
	                            Order.listOrder();
	                            int choose3 = sn.nextInt();
	                            sn.nextLine();
	                            Order.getOrderList().get(choose3 - 1).addMedia(newBook);
	                            break;
	                        }
	                    }

	                    break;
	                }

	                case 3:
	                {
	                    System.out.println("Choose order");
	                    Order.listOrder();
	                    int choose3 = sn.nextInt();
	                    sn.nextLine();
	                    System.out.print("ID: ");
	                    int id = sn.nextInt();
	                    Order.getOrderList().get(choose3 - 1).removeMedia(id);
	                    break;
	                }

	                case 4:
	                {
	                    System.out.println("List of Orders");
	                    Order.listOrder();
	                    int choose2 = sn.nextInt();
	                    Order.getOrderList().get(choose2 - 1).getList();
	                    break;
	                }
	            }

	            if(exit)
	                break;
	        }
	    }
	}
