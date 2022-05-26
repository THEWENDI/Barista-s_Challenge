import java.util.ArrayList;

public class Order{

    private String name;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order(){
        this.name = "guest";
        this.ready = false;
    }
    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public Order(String name){
        this.name = name;
        this.ready = false;
    }
    // GETTERS & SETTERS
    public String getName(){
        return this.name;
    }
    public boolean getReady(){
        return this.ready;
    }
    public ArrayList<Item> getItems(){
        return items;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setReady(boolean ready){
        this.ready = ready;
    }
    public void setItems(ArrayList<Item> items){
        this.items = items;
    }
    
    
    
    // ORDER METHODS
    
    // Create a method called addItem  that takes an Item object 
    // as an argument and adds the item to the order's items array. 
    // No need to return anything.
    public void addItem(Item item){
        this.items.add(item);
    }
    
    // Create a method called getStatusMessage that returns 
    // a String message. If the order is ready, return 
    // "Your order is ready.", if not, return "Thank you for waiting. 
    // Your order will be ready soon."

    public String getStatusMessage(){
        if(this.ready == true){
            return "Your order is ready.";
        }else{
            return "Thank you for waiting.Your order will be ready soon.";
        }
    }
    // Similar to the getOrderTotal method from the Cafe Business 
    // Logic assignment, create a method called getOrderTotal 
    // that sums together each of the item's prices, and returns the total amount. 
    public double getOrderTotal(){
        double total = 0.0;
        for(Item i: this.items){
            total += i.getPrice();
        }
        return total;
    }
    create a method called display 
    that prints out the order information like so:
    Customer Name: Cindhuri
    drip coffee - $1.50
    capuccino - $3.50
    Total: $5.00
    public void display(){
        System.out.println("Customer Name: " + this.name);
        for(Item i: this.items){
            System.out.println(i.getName() + " - $" + i.getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }
}
