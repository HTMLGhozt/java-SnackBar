package snackBarApp;

public class Main
{
  private static void makeTransaction(Customer c, Snack s, int quantity)
  {
    c.buy(s.getTotalCost(quantity));
    s.buySnack(quantity);
  }

  private static void workWithData()
  {
    Customer c1 = new Customer("Jane", 45.25);
    Customer c2 = new Customer("Bob", 33.14);

    VendingMachine v1 = new VendingMachine("Food");
    VendingMachine v2 = new VendingMachine("Drink");
    VendingMachine v3 = new VendingMachine("Office");

    Snack s1 = new Snack("Chips", 36, 1.75, v1.id);
    Snack s2 = new Snack("Chocolate Bar", 36, 1.00, v1.id);
    Snack s3 = new Snack("Pretzel", 30, 2.00, v1.id);
    Snack s4 = new Snack("Soda", 24, 2.50, v2.id);
    Snack s5 = new Snack("Water", 20, 2.75, v2.id);

    System.out.println("*** Query Data ***");
    makeTransaction(c1, s4, 3);
    System.out.println(c1.getName() + " has $" + c1.getCashOnHand());
    System.out.println(s4.getQuantity());
    
    makeTransaction(c1, s3, 1);
    System.out.println(c1.getName() + " has $" + c1.getCashOnHand());
    System.out.println(s3.getQuantity());
    
    makeTransaction(c2, s4, 2);
    System.out.println(c2.getName() + " has $" + c2.getCashOnHand());
    System.out.println(s4.getQuantity());

    c1.addCash(10);
    System.out.println(c1.getName() + " has $" + c1.getCashOnHand());

    makeTransaction(c1, s2, 1);
    System.out.println(c1.getName() + " has $" + c1.getCashOnHand());
    System.out.println(s2.getQuantity());

    s3.addQuantity(12);
    System.out.println(s3.getQuantity());

    makeTransaction(c2, s3, 3);
    System.out.println(c2.getName() + " has $" + c2.getCashOnHand());
    System.out.println(s3.getQuantity());
  }

  public static void main(String[] args)
  {
    workWithData();
  }
}
