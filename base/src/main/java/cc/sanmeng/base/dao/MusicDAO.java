package cc.sanmeng.base.dao;

import cc.sanmeng.base.po.MusicPo;
import cc.sanmeng.core.mybatis.PagingParamVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author：胡侯东
 * @Date：2022/1/26 1:34 PM
 * @Desc:
 */
@Mapper
public interface MusicDAO {

    /**
     * 分页查询Tab music的List
     * @param param
     * @return
     */
    List<MusicPo> selectTabList(PagingParamVo param);

    /**
     * 分页查询Tab music的数量
     * @param param
     * @return
     */
    Long selectTabCount(PagingParamVo param);
}