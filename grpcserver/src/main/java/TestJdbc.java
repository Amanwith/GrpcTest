/**
 * <p>项目文档: TODO</p>
 *
 * @author weng
 */
import com.weng.rpc.entity.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TestJdbc {
    static Connection con = null;
    static {
        //1、注册驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //2、获取数据库的连接对象
        try {
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/library?userUnicode=true&characterEncoding=utf-8&useSSL=false",
                    "root",
                    "wenghao1019");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public static int insert(Book book) {
        Statement stat=null;
        try{
            //3、定义sql语句
            String sql =String.format("insert into booklist values('%s','%s')",book.getId(),book.getName());
            System.out.println(sql);
            //4、获取执行sql语句的对象
            stat = con.createStatement();
            //5、执行sql并接收返回结果
            int count = stat.executeUpdate(sql);
            return count;
            //6、处理结果
        }catch (Exception e){
            e.printStackTrace();
            return -1;
        }finally {
            if (stat != null){  //避免空指针异常
                //7、释放资源
                try {
                    stat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static Book selectById(String id){
        Statement stat=null;
        Book book=new Book();
        try{
            //3、定义sql语句
            String sql =String.format("select * from booklist where id='%s'",id);
            System.out.println(sql);
            //4、获取执行sql语句的对象
            stat = con.createStatement();
            //5、执行sql并接收返回结果
            ResultSet rs = stat.executeQuery(sql);
            if(rs.next()){
                book.setId(rs.getString(1));
                book.setName(rs.getString(2));
                return book;
            }
            else return null;
            //6、处理结果
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            if (stat != null){  //避免空指针异常
                //7、释放资源
                try {
                    stat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static List<Book> selectByName(String name){
        Statement stat=null;
        List<Book> selectedBooks = new ArrayList<>();
        try{
            //3、定义sql语句
            String sql = "select * from booklist where name like '%" + name +"%'";
            System.out.println(sql);
            //4、获取执行sql语句的对象
            stat = con.createStatement();
            //5、执行sql并接收返回结果
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                Book book = new Book();
                book.setId(rs.getString(1));
                book.setName(rs.getString(2));
                selectedBooks.add(book);
            }
            return selectedBooks;
            //6、处理结果
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            if (stat != null){  //避免空指针异常
                //7、释放资源
                try {
                    stat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static int delete(String id){
        Statement stat = null;
        int count = 0;
        try{
            String sql = String.format("delete from booklist where id = '%s'",id);
            System.out.println(sql);
            try {
                stat = con.createStatement();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                count = stat.executeUpdate(sql);
                return count;
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }catch (Exception e){
            e.printStackTrace();
            return -1;
        }finally {
            if (stat != null){  //避免空指针异常
                //7、释放资源
                try {
                    stat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return count;
    }
    public static void close(){
        if (con != null){   //避免空指针异常
            //7、释放资源
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
