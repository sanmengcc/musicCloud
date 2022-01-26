package cc.sanmeng.base.vo;

import cc.sanmeng.core.entity.BaseValue;
import lombok.Data;

import java.util.Date;

/**
 * @Author：胡侯东
 * @Date：2022/1/26 10:17 AM
 * @Desc:
 */
@Data
public class BaseTabVo extends BaseValue {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * icon
     */
    private String icon;

    /**
     * 背景图片
     */
    private String img;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 描述文案
     */
    private String desc;

    /**
     * tab类型
     */
    private String tabType;

    /**
     * 状态
     */
    private String status;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;

}