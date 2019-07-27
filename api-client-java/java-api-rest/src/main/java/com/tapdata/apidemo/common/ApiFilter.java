package com.tapdata.apidemo.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ApiFilter {

    private Map<String, Object> where = null;

    private Map<String, Object> fields = null;

    private Integer pageSize;

    private Integer pageNum;

    private List<String> order = new ArrayList<String>();

    public ApiFilter where(Map<String, Object> where) {
        this.where = where;
        return this;
    }

    public Map<String, Object> getWhere() {
        return where;
    }

    public void setWhere(Map<String, Object> where) {
        this.where = where;
    }

    public ApiFilter fields(Map<String, Object> fields) {
        this.fields = fields;
        return this;
    }

    public Map<String, Object> getFields() {
        return fields;
    }

    public void setFields(Map<String, Object> fields) {
        this.fields = fields;
    }


    public ApiFilter pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ApiFilter pageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public ApiFilter order(List<String> order) {
        this.order = order;
        return this;
    }

    public ApiFilter addOrderItem(String orderItem) {
        if (this.order == null) {
            this.order = new ArrayList<String>();
        }
        this.order.add(orderItem);
        return this;
    }

    public List<String> getOrder() {
        return order;
    }

    public void setOrder(List<String> order) {
        this.order = order;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiFilter filter1 = (ApiFilter) o;
        return Objects.equals(this.where, filter1.where) &&
                Objects.equals(this.fields, filter1.fields) &&
                Objects.equals(this.pageSize, filter1.pageSize) &&
                Objects.equals(this.pageNum, filter1.pageNum) &&
                Objects.equals(this.order, filter1.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(where, fields, pageSize, pageNum, order);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiFilter {\n");
        sb.append("    where: ").append(toIndentedString(where)).append("\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}