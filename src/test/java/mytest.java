
import com.mchange.v2.log.log4j.Log4jMLog;
import com.zx.dao.BookMapper;
import com.zx.pojo.Books;
import com.zx.service.BookService;
import com.zx.service.BookServiceImpl;
import com.zx.utils.mybatisutils;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author:zx
 * @Description:
 * @Date:created in 14:27 2021/5/2
 */
public class mytest {
    @Test
    public void  test1(){
        SqlSession sqlsession = mybatisutils.getsqlsession();
        BookMapper mapper = sqlsession.getMapper(BookMapper.class);
        int i = mapper.addBook(new Books(5, "javaweb", 3, "不会"));
        System.out.println(i);
        sqlsession.commit();
        sqlsession.close();
    }
    @Test
    public void  test2(){
        SqlSession sqlsession = mybatisutils.getsqlsession();
        BookMapper mapper = sqlsession.getMapper(BookMapper.class);
        int i = mapper.deleteBookByID(5);
        System.out.println(i);
        sqlsession.commit();
        sqlsession.close();
    }
    @Test
    public void  test3(){
        SqlSession sqlsession = mybatisutils.getsqlsession();
        BookMapper mapper = sqlsession.getMapper(BookMapper.class);
        int i = mapper.updateBook(new Books(6, "javaweb", 100, "不会"));
        System.out.println(i);
        sqlsession.commit();
        sqlsession.close();
    }
    @Test
    public void  test4(){
        SqlSession sqlsession = mybatisutils.getsqlsession();
        BookMapper mapper = sqlsession.getMapper(BookMapper.class);
        List<Books> books = mapper.queryAllBook();
        for (Books book : books) {
            System.out.println(book);
        }
        sqlsession.commit();
        sqlsession.close();
    }
    @Test
    public  void test(){
        ApplicationContext Context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bean =(BookService) Context.getBean("BookServiceImpl");
        for (Books books : bean.queryAllBook()) {
            System.out.println(books);
        }

    }
}