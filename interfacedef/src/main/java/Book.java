import java.io.Serializable;
public class Book implements Serializable{
    private static final long serialVersionUID = 1L;

    public String bookID;

    public String bookName;

    public Book(String id, String name){
        bookID = id;
        bookName = name;
    }

    public String BookInfo(){
        return ("图书ID: "+bookID+"图书名: "+bookName);
    }
}
