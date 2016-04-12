package com.lexiang.main.pojo.query;
/**
 * 
 * <p>Title: BaseQuery.java</p>
 * <p>Description: 基础查询类</p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: Sage</p>
 * @author 五虎将
 * @date 2016年4月12日下午10:08:17
 * @version 1.0
 */
public class BaseQuery {

	private String id;
	
	private int page = 1;
	
	private int pageSize  = 10;

	private int start = 0 ;
	

	
	public int  getStart(){
		this.start = (getPage()-1)*getPageSize();
		return start;
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		if(page>1){
			this.page = page;
		}
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}


	
	
}
