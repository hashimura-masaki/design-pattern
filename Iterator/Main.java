package design;
import design.*;
public class Main{
    public static void main(String[] args){
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World"));
        bookShelf.appendBook(new Book("bb"));
        bookShelf.appendBook(new Book("ccound the World"));
        bookShelf.appendBook(new Book("ddound the World"));
        Iterator it = bookShelf.iterator();
        while(it.hasNext()){
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}