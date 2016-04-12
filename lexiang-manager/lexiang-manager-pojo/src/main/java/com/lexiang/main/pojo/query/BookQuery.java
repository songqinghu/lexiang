package com.lexiang.main.pojo.query;
/**
 * 
 * <p>Title: BookQuery.java</p>
 * <p>Description:图书查询 </p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: Sage</p>
 * @author 五虎将
 * @date 2016年4月12日下午10:11:12
 * @version 1.0
 */
public class BookQuery extends BaseQuery {

	
	private String bookname; //书名
	
	private String booktype; //分类
	
	private String author;  //作者

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getBooktype() {
		return booktype;
	}

	public void setBooktype(String booktype) {
		this.booktype = booktype;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}
