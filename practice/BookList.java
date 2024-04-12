import java.util.*;

class Book{
private String name;
private int id;
private double price;

public Book(){   
}

public Book(String name, int id, double price) {
    this.name = name;
    this.id = id;
    this.price = price;           
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public double getPrice() {
    return price;
}

public void setPrice(double price) {
    this.price = price;
}


@Override
public boolean equals(Object obj) {
    if(obj!=null){
        Book other=(Book)obj;
        return this.id==other.id;
    }
    return false;
}

@Override
public String toString() {
    return String.format("%-15s%-10d%.2f",this.name,this.id,this.price);
}

}

class SortById implements Comparator<Book>{
    public int compare(Book b1, Book b2){
        return b1.getId()-b2.getId();
    }
}

class SortByPrice implements Comparator<Book>{
    public int compare(Book b1, Book b2){
        return (int)(b1.getPrice()-b2.getPrice());
    }
}

class SortByName implements Comparator<Book>{
    public int compare(Book b1, Book b2){
        return (b1.getName().compareTo(b2.getName()));
    }
}

public static ArrayList<Book> acceptArrayList(){
    ArrayList<Book> BookList=new ArrayList<>();

    BookList.add(new Book("Dune", 123, 145.5));
    BookList.add(new Book("Half Girlfriend", 120, 105.5));
    BookList.add(new Book("Da vinci Code", 120, 105.5));

    return BookList;
}


class Main{
    public static void main(String[] args) {
        ArrayList<Book> BookList;
           
        System.out.println("BookList:   ");
        for (Book book : BookList) {
            System.out.println(book);
        }
        System.out.println();
        
        BookList.remove(1);
           
        System.out.println("after removal:  ");   
        for (Book book : BookList) {
            System.out.println(book);
        }

        System.out.println();

        Collections.sort(BookList,new SortById());

        System.out.println("after sorting by Id:    ");
        for (Book book : BookList) {
            System.out.println(book);
        }

    }
}