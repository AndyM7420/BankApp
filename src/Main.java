import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Bank bank= new Bank();
        Scanner s= new Scanner(System.in);
        System.out.println("What's your name?");
        String userName= s.nextLine();
        System.out.println("How many bagels in starting inventory?");
        int inventory= s.nextInt();
        System.out.println("How much each  bagel costs?");
        int startBagel=s.nextInt();
        BankApp app= new BankApp();
        String pin="";
        BagelShop single= new BagelShop(userName, inventory,startBagel,bank);
        for(int i=0;i<4;i++){
            pin+=""+(int)Math.random()*10;
        }
        CreditCard userOne= new CreditCard(userName,pin);
        // call methods from your BankApp object to handle program logic
    }
}
