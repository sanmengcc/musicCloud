package cc.sanmeng.core.mybatis;


import cc.sanmeng.core.entity.BaseValue;

/**
 * 分页计算
 */
public class PagerVo extends BaseValue {
    private static final long serialVersionUID = 8854823747011229592L;
    private int pageId = 1;
    private long rowCount = 0L;
    private int pageSize = 10;
    private int pageCount = 0;
    private int pageOffset = 0;
    private int pageTail = 0;
    private String orderField;
    private boolean orderDirection = true;
    private int length = 6;
    private int startIndex = 0;
    private int endIndex = 0;
    private int[] indexs;

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int[] getIndexs() {
        int len = this.getEndIndex() - this.getStartIndex() + 1;
        this.indexs = new int[len];

        for(int i = 0; i < len; ++i) {
            this.indexs[i] = this.getStartIndex() + i;
        }

        return this.indexs;
    }

    public void setIndexs(int[] indexs) {
        this.indexs = indexs;
    }

    public int getStartIndex() {
        this.startIndex = this.pageId - this.length / 2;
        if (this.startIndex < 1) {
            this.startIndex = 1;
        }

        return this.startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        if (this.getStartIndex() < 1) {
            this.setStartIndex(1);
        }

        this.endIndex = this.getStartIndex() + this.length <= this.getPageCount() ? this.getStartIndex() + this.length : this.getPageCount();
        return this.endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public PagerVo() {
    }

    protected void doPage() {
        this.pageCount = (int)this.rowCount / this.pageSize + 1;
        if (this.rowCount % (long)this.pageSize == 0L && this.pageCount > 1) {
            --this.pageCount;
        }

        this.pageOffset = (this.pageId - 1) * this.pageSize;
        this.pageTail = this.pageOffset + this.pageSize;
        if ((long)(this.pageOffset + this.pageSize) > this.rowCount) {
            this.pageTail = (int)this.rowCount;
        }

    }

    public String getOrderCondition() {
        String condition = "";
        if (this.orderField != null && this.orderField.length() != 0) {
            condition = " order by " + this.orderField + (this.orderDirection ? " " : " desc ");
        }

        return condition;
    }

    public String getMysqlQueryCondition() {
        String condition = "";
        condition = " limit " + this.pageOffset + "," + this.pageSize;
        return condition;
    }

    public void setOrderDirection(boolean orderDirection) {
        this.orderDirection = orderDirection;
    }

    public boolean isOrderDirection() {
        return this.orderDirection;
    }

    public void setOrderField(String orderField) {
        this.orderField = orderField;
    }

    public String getOrderField() {
        return this.orderField;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public void setPageId(int pageId) {
        this.pageId = pageId;
    }

    public int getPageId() {
        return this.pageId;
    }

    public void setPageOffset(int pageOffset) {
        this.pageOffset = pageOffset;
    }

    public int getPageOffset() {
        return this.pageOffset;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageTail(int pageTail) {
        this.pageTail = pageTail;
    }

    public int getPageTail() {
        return this.pageTail;
    }

    public void setRowCount(long rowCount) {
        this.rowCount = rowCount;
        this.doPage();
    }

    public long getRowCount() {
        return this.rowCount;
    }
}
