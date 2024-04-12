import java.util.*;

class RestaurantManagement{
    private static final int nofItems=10;
    private static double prices[]=new double[nofItems];
    private static String Items[]=new String[nofItems];
    private static int counter=0;
    private static Scanner scanner = new Scanner(System.in);
 
    private static void initializeMenu() {
        // Initialize menu with some default items
        addItem("Spaghetti", 10.99);
        addItem("Pizza", 12.99);
        addItem("Burger", 8.99);
        addItem("Salad", 6.99);
    }
    public static void displayMenu(){
        if (counter == 0) {
            System.out.println("Menu is empty.");
        } else {
            for (int i = 0; i < counter; i++) {
                System.out.println((i + 1) + ". " + Items[i] + " - $" + prices[i]);
            }
        }
        
    }

    public static void addItem(String name, double price){
        if (counter < nofItems) {
            Items[counter] = name;
            prices[counter] = price;
            counter++;
        } else {
            System.out.println("Menu is full. Cannot add more items.");
        }
    }

    private static void addDish() {
        if (counter < nofItems) {
            System.out.print("Enter the name of the dish: ");
            String name = scanner.nextLine();
            System.out.print("Enter the price of the dish: ");
            double price = scanner.nextDouble();
            addItem(name, price);
        } else {
            System.out.println("Menu is full. Cannot add more items.");
        }
    }

    public static void removeDish(){
        if (counter == 0) {
            System.out.println("Menu is empty.");
            return;
        }

        System.out.print("Enter the index of the dish you want to remove: ");
        int index = scanner.nextInt();
        if (index < 1 || index > counter) {
            System.out.println("Invalid index.");
        } else {
            index--; // Adjust index to array index
            for (int i = index; i < counter - 1; i++) {
                Items[i] = Items[i + 1];
                prices[i] = prices[i + 1];
            }
            counter--;
            System.out.println("Dish removed successfully.");
        }
    }

    public static void changePrice(){
        if (counter == 0) {
            System.out.println("Menu is empty.");
            return;
        }

        System.out.print("Enter the index of the dish you want to modify: ");
        int index = scanner.nextInt();
        if (index < 1 || index > counter) {
            System.out.println("Invalid index.");
        } else {
            index--; // Adjust index to array index
            System.out.print("Enter the new price: ");
            double newPrice = scanner.nextDouble();
            prices[index] = newPrice;
            System.out.println("Price modified successfully.");
        }

    }    
    
    public static void showMenu(){
        char choice;
        initializeMenu();
        
        do{
            
        
           // consume newline character
           System.out.println("\nMenu:");
            displayMenu();

            System.out.println("\nChoose an action:");
            System.out.println("a. View the current menu with prices");
            System.out.println("b. Add a new dish to the menu");
            System.out.println("c. Remove a dish from the menu");
            System.out.println("d. Modify the price of a dish on the menu");
            System.out.println("e. Exit the program");

            choice = scanner.next().charAt(0);
            scanner.nextLine();

            switch (choice) {
                case 'a':
                    displayMenu();
                    break;
                case 'b':
                    addDish();
                    break;
                case 'c':
                    removeDish();
                    break;
                case 'd':
                    changePrice();
                    break;
                case 'e':
                    System.out.println("Thanks! Have a great day.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while(choice!='e');
        scanner.close();
    

    } 
       
    
    public static void main(String[] args) {
       showMenu();
    }

}