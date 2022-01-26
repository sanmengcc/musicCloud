package cc.sanmeng.base.service;

import cc.sanmeng.base.ro.BaseTabRo;
import cc.sanmeng.base.vo.BaseTabVo;

import java.util.List;

/**
 * @Author：胡侯东
 * @Date：2022/1/26 10:18 AM
 * @Desc:
 */
public interface BaseTabService {

    /**
     * 查询列表
     * @param ro
     * @return
     */
    List<BaseTabVo> selectList(BaseTabRo ro);

    /**
     * 根据ID查询数据
     * @param id
     * @return
     */
    BaseTabVo selectById(Long id);
}