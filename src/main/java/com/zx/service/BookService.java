package com.zx.service;
import com.zx.pojo.Books;
import java.util.List;

/**
 * @Author:zx
 * @Description:
 * @Date:created in 16:27 2021/5/2
 */
public interface BookService {
    int addBook(Books books);
    int deleteBookByID(int id);
    int updateBook(Books books);
    Books queryBookById(int id);
    List<Books> queryAllBook();
}
