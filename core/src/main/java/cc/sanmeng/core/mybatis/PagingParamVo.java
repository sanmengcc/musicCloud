package cc.sanmeng.core.mybatis;


import cc.sanmeng.core.entity.BaseValue;

import java.util.HashMap;
import java.util.Map;

/**
 * 分页查询体
 */
public class PagingParamVo extends BaseValue {
    private static final long serialVersionUID = 6141741367303676093L;
    private int page = 1;
    private int rows = 10;
    private String sort;
    private int total;
    private String footer;
    private String order;
    public String extraCond;
    public String extraOrder;
    public Map extra = new HashMap();
    private PagerVo pager = new PagerVo();

    public PagingParamVo() {
    }

    public PagerVo getPager() {
        this.pager.setPageId(this.getPage());
        this.pager.setPageSize(this.getRows());
        String orderField = "";
        if (this.sort != null) {
            orderField = this.sort;
        }

        if (orderField != null && this.order != null) {
            orderField = orderField + " " + this.order;
        }

        this.pager.setOrderField(orderField);
        return this.pager;
    }

    public void setPager(PagerVo pager) {
        this.pager = pager;
    }

    public String getExtraCond() {
        return this.extraCond;
    }

    public void setExtraCond(String extraCond) {
        this.extraCond = extraCond;
    }

    public String getExtraOrder() {
        return this.extraOrder;
    }

    public void setExtraOrder(String extraOrder) {
        this.extraOrder = extraOrder;
    }

    public Map getExtra() {
        return this.extra;
    }

    public void setExtra(Map extra) {
        this.extra = extra;
    }

    public int getStartIndex() {
        return (this.page - 1) * this.rows;
    }

    public int getPage() {
        return this.page;
    }

    public int getCurrentPage() {
        return this.page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setCurrentPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return this.rows;
    }

    public int getPageSize() {
        return this.rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setPageSize(int rows) {
        this.rows = rows;
    }

    public String getSort() {
        return this.sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public int getTotal() {
        return this.total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getFooter() {
        return this.footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public String getOrder() {
        return this.order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
