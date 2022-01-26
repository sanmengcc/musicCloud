package cc.sanmeng.base.service;

import cc.sanmeng.base.vo.AuthorVo;

import java.util.List;

/**
 * @Author：胡侯东
 * @Date：2022/1/26 1:57 PM
 * @Desc:
 */
public interface AuthorService {

    /**
     * 查询音乐制作人信息
     * @param musicId
     * @return
     */
    List<AuthorVo> selectByMusicId(Long musicId);
}