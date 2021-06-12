package GoFo;
import java.util.Scanner;
/**
 * 
 * @author pvv
 */
public class Gofomain {


	
	public static void main(String[] args) {
		Playgrounds all = new Playgrounds ();
		Scanner input = new Scanner(System.in);
		while (true)
		{
			
			System.out.println("1- Register as Playground Owner.");
			System.out.println("2- Register as Player.");
			System.out.println("3- Exit");
			int choice = input.nextInt();
			if (choice ==1)
			{
				// Enter 1 playground by User for example only 
				System.out.print("Add Your Name: ");
				String n = input.next();
				System.out.print("Add Your Phone Number: ");
				String ph = input.next();
				System.out.print("Add Your Email: ");
				String e = input.next();
				System.out.print("Add Your Password: ");
				String pa = input.next();
				PlaygroundOwner ob1 = new PlaygroundOwner(n,ph,e,pa);
				
				// ADD 4 Playgrounds owned by Playground for testing
				
				for(int i=0 ; i< 4; ++i)
				{
					System.out.print("Name of #" + (i+1) + " Playground: ");
					String name = input.next();
					System.out.print("Size of Playground: ");
					int size = input.nextInt();
					System.out.print("Price per Hour of Playground: ");
					double price = input.nextDouble();
					ob1.addPlayground(name , size , price , all);
				}	
				ob1.DisplayOwnerPlayground();
	
			}
			else if (choice == 2)
			{
				// Testing Registeration as player
				System.out.print("Add Your Name: ");
				String n = input.next();
				System.out.print("Add Your Phone Number: ");
				String ph = input.next();
				System.out.print("Add Your Email: ");
				String e = input.next();
				System.out.print("Add Your Password: ");
				String pa = input.next();
				Player obj = new Player(n,ph,e,pa);
				// Testing for Booking
				System.out.println("Do You want to Book?");
				System.out.println("1- Yes");
				System.out.println("2- No");
				int c= input.nextInt();
				if (c==1)
				{
					obj.Booking(all);
				}
				System.out.print(obj.getbalance());
			
			}
			else if (choice ==3)
			{
				// Testing Exit
				return;
			}
		}	
	}
}
