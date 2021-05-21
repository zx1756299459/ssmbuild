package com.zx.service;

import com.zx.dao.BookMapper;
import com.zx.pojo.Books;

import java.util.List;

/**
 * @Author:zx
 * @Description:
 * @Date:created in 16:28 2021/5/2
 */
public class BookServiceImpl implements BookService{
    private BookMapper bookMapper;
    public void  setBookMapper(BookMapper bookMapper){
        this.bookMapper=bookMapper;
    }
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }
    public int deleteBookByID(int id) {
        return bookMapper.deleteBookByID(id);
    }
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
