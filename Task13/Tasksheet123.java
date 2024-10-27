package Task13;





    class Book{

        String title;
        String author;
        int yearPublished;
        double price;


     public Book(String title, String author, int yearPublished, double price){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

     
     // toString method to print the details of the book
         @Override
          public String toString() {    
                return "Title: \"" + title + "\"\n" + "Author: \"" + author + "\"\n" + "Year Published: " + yearPublished + "\n" + "Price: $" + price; }
                                                                 
            }    
            
            public class Tasksheet123{
            public static void main(String[] args) 
            {
                Book book1info = new Book ("Java Programming", "John Smith", 2021, 39.99);
                Book book2_info = new Book("Python Basics", "Jane Doe", 2020, 29.99);
                Book book3_info = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);
                
                System.out.println("Book 1");
                System.out.println(book1info);
                System.out.println("\nBook 2");
                System.out.println(book2_info);
                System.out.println("\nBook3");
                System.out.println(book3_info);
             

            }
          }
       

