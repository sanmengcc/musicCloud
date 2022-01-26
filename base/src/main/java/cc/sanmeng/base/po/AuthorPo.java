package cc.sanmeng.base.po;

import cc.sanmeng.core.entity.BaseValue;
import lombok.Data;

import java.util.Date;

/**
 * @Author：胡侯东
 * @Date：2022/1/26 1:48 PM
 * @Desc:
 */
@Data
public class AuthorPo extends BaseValue {

    /**
     * id
     */
    private Integer id;

    /**
     * 作者姓名
     */
    private String username;

    /**
     * 音乐制作人类型
     */
    private String authorType;

    /**
     * 作者头像
     */
    private String img;

    /**
     * 描述信息
     */
    private String describe;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;
}