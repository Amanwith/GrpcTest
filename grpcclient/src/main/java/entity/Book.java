package entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("booklist")
public class Book implements Serializable {
    public String id=null;
    public String name=null;

    public Book(){

    }
    public Book(String bookId, String bookName) {
        id = bookId;
        name = bookName;
    }
}
