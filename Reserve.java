
package reserve;


import java.util.Scanner;
public class Reserve {

  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
     
        Room room = new Room();
        Name name = new Name();
        
        String Fname;
        String Lname;
        int book;
        int days;
    
        try{
        System.out.print("Enter your First Name: ");
        Fname = sc.nextLine().toUpperCase();
        
        room.setFname(Fname);
        
        System.out.print("Enter Last Name: ");
        Lname = sc.nextLine().toUpperCase();
        room.setLname(Lname);
        
        }catch(Exception e){
            System.out.println("Invalid Input");
        }
        
       
        System.out.print("Book a Room (any number): ");
        book = sc.nextInt();
        room.setRoom(book);
        
        
        System.out.print("How many days?: ");
        days = sc.nextInt();
        room.setChoice(days);
        
               System.out.println("");
        System.out.println("----- "+ room.getFname()+" "+ room.getLname()+" ------" );
        System.out.println("You Book Room #" + room.getRoom() );
        System.out.println("You stay for "+ room.getChoice() + " days");
        name.display();
        
    }
    
}
