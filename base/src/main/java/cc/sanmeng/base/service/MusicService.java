package cc.sanmeng.base.service;

import cc.sanmeng.base.ro.music.TabMusicRo;
import cc.sanmeng.base.vo.music.TabMusicInfoVo;
import cc.sanmeng.core.entity.DataPageValue;

/**
 * @Author：胡侯东
 * @Date：2022/1/26 1:34 PM
 * @Desc:
 */
public interface MusicService {

    /**
     * 分页查询Tab音乐
     * @param ro
     * @param page
     * @param pageSize
     * @return
     */
    DataPageValue<TabMusicInfoVo> selectTabPage(TabMusicRo ro, Integer page, Integer pageSize);
}