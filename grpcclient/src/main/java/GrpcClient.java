import java.util.List;
import java.util.Scanner;

public class GrpcClient {
    /**
     * 接收rpc服务端ip和端口
     */
    private static final String host="localhost";
    private static final int serverport=9999;

    public static void ShowIndex(){
        System.out.println("------欢迎使用书籍信息管理系统------\n输入数字使用相应的功能");
        System.out.println("[1]添加书籍对象");
        System.out.println("[2]根据ID查询书籍");
        System.out.println("[3]根据书籍名查询书籍（支持模糊查询）");
        System.out.println("[4]删除指定ID的书籍对象");
        System.out.println("[5]退出系统");
    }

    public static void main(String[] args) throws Exception{
        try(Scanner input = new Scanner(System.in)){
            int key = 5;
            ShowIndex();
            while((key = input.nextInt()) != 5){
                switch (key){
                    case 1:{
                        while(true){
                            System.out.println("「添加书籍」请输入书籍五位数字ID和名称：");
                            String id = input.next();
                            String name = input.next();
                            entity.Book book = new entity.Book(id, name);
                            boolean flag = BookService.add(book);
                            BookService.shutDown();
                            if(flag == true){
                                System.out.println("书籍添加成功 是否继续添加?(y/n)");
                                String choice = input.next();
                                if(choice.equals("y")) continue;
                                else break;
                            }
                            else{
                                System.out.println("添加失败 已存在同ID书籍 是否继续添加?(y/n)");
                                String choice = input.next();
                                if(choice.equals("y")) continue;
                                else break;
                            }
                        }
                    }break;

                    case 2:{
                        System.out.println("「根据ID查找书籍」请输入书籍五位数字ID：");
                        String id = input.next();
                        entity.Book book = BookService.queryByID(id);
                        BookService.shutDown();
                        if(book == null){
                            System.out.println("查询失败 未找到ID为 " + id + " 的书籍");
                        }
                        else{
                            System.out.println("查询成功 书籍信息如下");
                            System.out.println("ID："+book.id+" 书籍名称：《"+book.name+"》");
                        }
                    }break;

                    case 3:{
                        System.out.println("「根据名称查找书籍」请输入书籍名称或关键字：");
                        String name = input.next();
                        List<entity.Book> bookList = BookService.queryByName(name);
                        BookService.shutDown();
                        if(bookList.size()==0){
                            System.out.println("查询失败 未找到名称为 " + name + "或名称包含"+ name + " 的书籍");
                        }
                        else{
                            System.out.println("查询成功 书籍信息如下");
                            for(entity.Book book : bookList){
                                System.out.println("ID："+book.id+" 书籍名称：《"+book.name+"》");
                            }
                        }
                    }break;

                    case 4:{
                        while(true){
                            System.out.println("「删除书籍」请输入书籍五位数字ID：");
                            String id = input.next();
                            boolean flag = BookService.delete(id);
                            BookService.shutDown();
                            if(flag == true){
                                System.out.println("书籍删除成功 是否继续删除?(y/n)");
                                String choice = input.next();
                                if(choice.equals("y")) continue;
                                else break;
                            }
                            else{
                                System.out.println("删除失败 不存在ID为"+id+"的书籍 是否继续删除?(y/n)");
                                String choice = input.next();
                                if(choice.equals("y")) continue;
                                else break;
                            }
                        }
                    }break;
                }
                System.exit(0);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
