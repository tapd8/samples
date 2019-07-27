package com.tapdata.apidemo.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ApiResponse {

    private List<?> data = new ArrayList<>();

    private Integer total = null;

    public ApiResponse data(List<Object> data) {
        this.data = data;
        return this;
    }

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getTotal() {
        return total;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiResponse response = (ApiResponse) o;
        return Objects.equals(this.data, response.data) &&
                Objects.equals(this.total, response.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, total);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiResponse {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

