import java.util.Scanner;

class ItemPrice{
    static double Soda = 100;
    static double Chips = 50;
    static double Gum = 20;

    public static double sodaPrice(){
        return Soda;
    }

    public static double chipsPrice(){
        return Chips;
    }

    public static double gumPrice(){
        return Gum;
    }
}

public class Main {

    public static void main(String[] params){

        int item=0, qty=0;
        double total_amount=0, cash_received=0, payment=0;

        System.out.println("===== AUTOMATIC VENDING MACHINE =====");
        System.out.println("1 - Soda...\tKSH 100\n2 - Chips..\tKSH 50\n3 - Gum...\tKSH 20");

        System.out.print("Choose The item:\t");
        item = new Scanner(System.in).nextInt();

        if(item <=0 || item >3){
            System.out.println("Error: Entry out of range. Choose the Item again!");
            System.out.print("Item:\t");
            item = new Scanner(System.in).nextInt();
        }
        System.out.print("Enter The quantity:\t");
        qty = new Scanner(System.in).nextInt();
        switch(item){
            case 1: total_amount = ItemPrice.sodaPrice()*qty; break;
            case 2: total_amount = ItemPrice.chipsPrice()*qty; break;
            case 3: total_amount = ItemPrice.gumPrice()*qty; break;
            default:
        }
        System.out.println("The total price of your purchase is:\t"+total_amount);
        System.out.println("Please Pay by entering/typing the cash amount on hand");
        System.out.println("");
        payment = new Scanner(System.in).nextInt();
        if(payment==total_amount){
            System.out.println("Purchase Successful, Welcome Again");
        }else if(payment<total_amount){
            System.out.println("Error: Insufficient funds");
        }else if(payment>total_amount){
            System.out.println("Purchase Successful, Welcome Again. Your change is:\t"+(payment-total_amount));
        }
        System.out.print("Do you want to purchase again? Y/N:\t");
        String ch = new Scanner(System.in).next();
        if(ch.equalsIgnoreCase("y")) {
        	main(null);
        }
        System.out.print("\nTHANK YOU FOR SHOPPING WITH US");
    } 
}

