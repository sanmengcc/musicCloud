package cc.sanmeng.base.dao;

import cc.sanmeng.base.po.AuthorPo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author：胡侯东
 * @Date：2022/1/26 1:53 PM
 * @Desc:
 */
@Mapper
public interface AuthorDAO {

    /**
     * 根据音乐ID查询制作者信息
     * @param musicId
     * @return
     */
    List<AuthorPo> selectByMusicId(Long musicId);
}