package cc.sanmeng.base.service.impl;

import cc.sanmeng.base.dao.MusicDAO;
import cc.sanmeng.base.po.MusicPo;
import cc.sanmeng.base.ro.music.TabMusicRo;
import cc.sanmeng.base.service.AuthorService;
import cc.sanmeng.base.service.MusicService;
import cc.sanmeng.base.vo.AuthorVo;
import cc.sanmeng.base.vo.music.TabMusicInfoVo;
import cc.sanmeng.core.entity.DataPageValue;
import cc.sanmeng.core.mybatis.PagingParamVo;
import cc.sanmeng.core.util.Json;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author：胡侯东
 * @Date：2022/1/26 1:34 PM
 * @Desc:
 */
@Service
public class MusicServiceImpl implements MusicService {

    @Resource
    private MusicDAO musicDAO;
    @Resource
    private AuthorService authorService;

    @Override
    public DataPageValue<TabMusicInfoVo> selectTabPage(TabMusicRo ro, Integer page, Integer pageSize) {
        PagingParamVo param = new PagingParamVo();
        param.setExtra(Json.bean2Map(ro));
        param.setPage(page);
        param.setPageSize(pageSize);
        Long count = musicDAO.selectTabCount(param);
        param.getPager().setRowCount(count);
        List<MusicPo> musicPos = musicDAO.selectTabList(param);

        List<TabMusicInfoVo> musics = Json.createList(musicPos, TabMusicInfoVo.class);

        for (TabMusicInfoVo music : musics) {
            //查询制作者信息
            List<AuthorVo> authors = authorService.selectByMusicId(music.getId());
            music.setAuthors(authors);
        }
        return new DataPageValue<>(musics, count, pageSize, page);
    }
}