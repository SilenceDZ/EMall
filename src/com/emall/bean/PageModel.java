package com.emall.bean;

import java.util.List;

public class PageModel<T> {
	/**
	 * @fields result:保存某一页的数据
	 */
	private List<T> result;
	
	/**
	 * @fields currentPage:当前页
	 */
	private int currentPage;
	/**
	 * @fields pageSize:每页显示记录的数量 
	 */
	private int pageSize;
	/**
	 * @fields totalCount:总记录数 
	 */
	private int totalCount;
	/**
	 * @fields pageCount:页面数量 
	 */
	private int pageCount;
	
	public PageModel() {
		super();
	}
	
	public PageModel(List<T> result, int currentPage, int pageSize,
			int totalCount, int pageCount) {
		super();
		this.result = result;
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.totalCount = totalCount;
		this.pageCount = pageCount;
	}
	public List<T> getResult() {
		return result;
	}
	public void setResult(List<T> result) {
		this.result = result;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getPageCount() {
		pageCount=(totalCount-1)/pageSize+1;
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
	
}
