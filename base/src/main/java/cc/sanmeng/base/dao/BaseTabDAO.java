package cc.sanmeng.base.dao;

import cc.sanmeng.base.po.BaseTabPo;
import cc.sanmeng.base.ro.BaseTabRo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author：胡侯东
 * @Date：2022/1/26 10:17 AM
 * @Desc:
 */
@Mapper
public interface BaseTabDAO{

    /**
     * 查询列表
     * @param ro
     * @return
     */
    List<BaseTabPo> selectList(BaseTabRo ro);

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    BaseTabPo queryById(Long id);
}