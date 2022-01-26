package cc.sanmeng.base.vo;

import cc.sanmeng.core.entity.BaseValue;
import lombok.Data;

import java.util.Date;

/**
 * @Author：胡侯东
 * @Date：2022/1/26 1:33 PM
 * @Desc:
 */
@Data
public class MusicVo extends BaseValue {

    /**
     * id
     */
    private Long id;

    /**
     * 音乐名称
     */
    private String name;

    /**
     * 封面图片
     */
    private String img;

    /**
     * 播放地址（默认）
     */
    private String playerUrl;

    /**
     * 上下架状态
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