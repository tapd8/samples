package com.tapdata.apidemo.common;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Pager<T> {

    private long count;
    @JsonProperty("page_no")
    private int pageNumber;

    @JsonProperty("page_size")
    private int pageSize;

    @JsonProperty("order_by")
    private List<String> orderBy;

    private Map<String, Object> query = new LinkedHashMap<>();

    private List<T> items;

    public Pager() {
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    @JsonIgnore
    public List<String> getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(List<String> orderBy) {
        this.orderBy = orderBy;
    }

    public Map<String, Object> getQuery() {
        return query;
    }

    public void setQuery(Map<String, Object> query) {
        this.query = query;
    }

    @Override
    public String toString() {
        return "Page [count=" + count + ", pageNumber=" + pageNumber
                + ", pageSize=" + pageSize + ", orderBy=" + orderBy
                + ", query=" + query + ", items=" + items + "]";
    }

}
