package com.zx.pojo;

/**
 * @Author:zx
 * @Description:
 * @Date:created in 14:19 2021/5/2
 */
public class Books {
    private  int bookID;
    private  String bookName;
    private  int bookCounts;
    private  String detail;

    public int getBookID() {
        return bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public int getBookCounts() {
        return bookCounts;
    }

    public String getDetail() {
        return detail;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookCounts(int bookCounts) {
        this.bookCounts = bookCounts;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Books() {
    }

    public Books(int bookID, String bookName, int bookCounts, String detail) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.bookCounts = bookCounts;
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookID=" + bookID +
                ", bookName='" + bookName + '\'' +
                ", bookCounts=" + bookCounts +
                ", detail='" + detail + '\'' +
                '}';
    }
}
