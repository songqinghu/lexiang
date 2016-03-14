package com.lexiang.main.common.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * <p>Title: ResultData.java</p>
 * <p>Description:返回结果数据封装通用类</p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: Sage</p>
 * @author 五虎将
 * @date 2016年3月14日下午10:49:07
 * @version 1.0
 * @param <T>
 */
public class ResultData<T> {

	private int status = 200;//默认成功
	
	private Boolean result = true;
	
	private List<T> data = new ArrayList<T>();

	private T mateData;
	
	
	
	public T getMateData() {
		return mateData;
	}

	public void setMateData(T mateData) {
		this.mateData = mateData;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Boolean getResult() {
		return result;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}
	
}
