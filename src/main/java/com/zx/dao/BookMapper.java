package com.zx.dao;

import com.zx.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author:zx
 * @Description:
 * @Date:created in 14:16 2021/5/2
 */
public  interface BookMapper {
   int addBook(Books books);
   int deleteBookByID(@Param("bookID") int id);
   int updateBook(Books books);
   Books queryBookById(@Param("bookID") int id);
   List<Books> queryAllBook();
}
