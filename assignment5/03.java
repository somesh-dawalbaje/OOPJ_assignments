import java.util.*;

class Book{
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private int year;
    private double price;
    private int quantity;
    
    public Book(String title,String author,String publisher,String isbn,int year, double price, int quantity){
        this.title=title;
        this.author=author;
        this.publisher=publisher;
        this.isbn=isbn;
        this.year=year;
        this.price=price;
        this.quantity=quantity;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public void setAuthor(String author){
        this.author=author;
    }

    public void setPublisher(String publisher){
        this.publisher=publisher;
    }

    public void setIsbn(String isbn){
        this.isbn=isbn;
    }

    public void setYear(int year){
        this.year=year;
    }

    public void setTitle(double price){
        this.price=price;
    }

    public void setTitle(int quantity){
        this.quantity=quantity;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuhor(){
        return this.author;
    }

    public String getPublisher(){
        return this.publisher;
    }

    public String getIsbn(){
        return this.isbn;
    }

    public int getYear(){
        return this.year;
    }

    public double getPrice(){
        return this.price;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public void increaseQuantity(int quantity){
        if(quantity>=0)
            this.quantity+=quantity;
        else
            System.out.println("Enter positve value");
    }

    public void decreaseQuantity(int quantity){
        if(quantity>=0 && this.quantity>=quantity)
            this.quantity-=quantity;
        else
            System.out.println("insufficient quantity");
    }

    public double getInventoryValue(){
        double inventoryValue=price*quantity;

        return price*quantity;
    }

}

class User1{
    public static void main(String[] args){
        Book b1=new Book("Dune","Frank Herber","Chilton Books","9754827640",1965,397.20,5);
        
        System.out.println("quantity of the book: "+b1.getQuantity());
        b1.increaseQuantity(3);
        System.out.println("quantity of the book: "+b1.getQuantity());
        b1.decreaseQuantity(4);
        System.out.println("quantity of the book: "+b1.getQuantity());
        System.out.println("inventory value of the book: "+b1.getInventoryValue());
    }
}