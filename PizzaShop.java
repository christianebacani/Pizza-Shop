// Pizza Shop
// Created by :  Christiane A. Bacani
import java.util.Scanner;
public class PizzaShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price[] = {75,85,95,0};
        boolean order = true;
        int totalPrice = 0;
        
        System.out.print("Welcome to Bacani`s Pizza Shop!\n");
        
        System.out.print("Press enter to start : ");
        String pressEnter = input.nextLine();
        
        
        while(order){
        System.out.print("AVAILABLE FLAVORS :\n");
        System.out.print("1.) Ham and Cheese\n2.) Hawaiian\n3.) Overload\n4.) Exit\n");
        System.out.print("Enter choice here : ");
        int choice = input.nextInt();
        
        switch(choice){
            case 4:
                System.out.print("\nTHANK YOU!");
                break;
        }
        
        
        System.out.print("Enter quantity : ");
        int quantity = input.nextInt();
        
        totalPrice += price[choice - 1] * quantity;
        
        System.out.print("Do you want to order again? (y/n) : ");
        input.nextLine();
        String orderAgain = input.nextLine();
        
        if(orderAgain.equalsIgnoreCase("n")){
            order = false;
            System.out.print("Total price is : P " + totalPrice +"\n");
            
            System.out.print("Enter payment : P ");
            int payment = input.nextInt();
            
            int change = payment - totalPrice;
            
            System.out.print("Change : P " + change);
            
            System.out.print("\n\nTHANK YOU FOR BUYING, PLEASE COME AGAIN!");
            
        }
             
        }
        
    }
}
