package cc.sanmeng.core.entity;

import lombok.Data;

/**
 * 分页参数
 */
@Data
public class PageRo extends BaseValue{

    /**
     * 页数
     */
    private Integer page;

    /**
     * 条数
     */
    private Integer pageSize;
}