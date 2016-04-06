package com.lexiang.main.mapper.po;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * <p>Title: Book.java</p>
 * <p>Description: 图书实体类</p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: Sage</p>
 * @author 五虎将
 * @date 2016年3月24日下午11:35:58
 * @version 1.0
 */
public class UpBook  implements Serializable{

	/** serialVersionUID*/
	private static final long serialVersionUID = -838163788074256138L;

	private long bookId;  //id
	
	private String bookname; //书名
	
	private String booktype; //分类
	
	private String author;  //作者
	
	private String urlpath;  //网盘路径
	
	private String password;  //网盘密码
	
	private String status;    //图书状态
	
	private Date  createtime;  //创建时间

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

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

	public String getUrlpath() {
		return urlpath;
	}

	public void setUrlpath(String urlpath) {
		this.urlpath = urlpath;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}


	
}
