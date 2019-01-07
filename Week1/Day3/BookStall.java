/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cb.Week1.Day3;

/**
 *
 * @author cb-vidhya
 */
class Author
{
    private String name,email;
    private char gender;
    Author(String name,String email,char gender)
    {
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    Author()
    {
    }
    String getName()
    {
        return this.name;
    }
    void setEmail(String email)
    {
        this.email=email;
    }
    String getEmail()
    {
        return this.email;
    }
    char getGender()
    {
        return this.gender;
    }
    String toDisplay()
    {
        return "["+name+"]"+" [("+gender+")]"+" at "+"["+email+"]";
    }
}
class Book
{
    private String name;
    private Author[] authors;
    private double price;
    private int qtyInStock=0;
    Book(String name,Author[] authors,double price,int qtyInStock)
    {
        this.name=name;
        authors=new Author[authors.length];
        for(int temp=0;temp<authors.length;temp++)
            this.authors[temp]=authors[temp]; 
        this.price=price;
        this.qtyInStock=qtyInStock;
    }
    Book(String name,Author author,double price,int qtyInStock)
    {
        this.name=name;
        authors=new Author[1];
        this.authors[0]=author;
        this.price=price;
        this.qtyInStock=qtyInStock;
    }
    String getname()
    {
        return name;
    }
    Author[] getAuthor()
    {
        return authors;
    }
    double getPrice()
    {
        return price;
    }
    void setPrice(double price)
    {
        this.price=price;
    }
    int getQtyInStock()
    {
        return qtyInStock;
    }
    void setQtyInStock(int qtyInStock)
    {
        this.qtyInStock=qtyInStock;
    }
    String toDisplay()
    {
        String result=this.name;
        int temp;
        for(temp=0;temp<authors.length-1;temp++)
        {
            result=result+"["+authors[temp].toDisplay()+"], ";
        }
        result+="["+authors[temp].toDisplay()+"].";
        result+="\nPrice: $"+price+"\nNo. of books available: "+qtyInStock;
        return result;
    }
    void printAuthors()
    {
        int temp;
        for(temp=0;temp<authors.length;temp++)
        {
            System.out.println(authors[temp]);
        }
    }
    void addAuthor(Author author)
    {
        int length=authors.length;
        Author[] newAuthors=new Author[length];
        System.arraycopy(authors,0, newAuthors, 0, length);
        authors=new Author[length+1];
        System.arraycopy(newAuthors, 0, authors, 0, length);
        authors[length]=author;
    }
}
public class BookStall {
    public static void main(String[] arg)
    {
        //For author class
        Author author=new Author("a","abc@gmail.com",'M');
        String result;
        result=author.toDisplay();
        System.out.println(result);
        author.setEmail("xyz@gmail.com");
        result=author.toDisplay();
        System.out.println(result);
        //For Book class
        Book book=new Book("HarryPotter",author,200,10);
        result=book.toDisplay();
        System.out.println(result);
        book.addAuthor(new Author("b","pqr@gmail.com",'F'));
        book.printAuthors();
        result=book.toDisplay();
        System.out.println(result);
    }
}
