package cc.sanmeng.base.api.app;

import cc.sanmeng.base.ro.music.TabMusicRo;
import cc.sanmeng.base.service.MusicService;
import cc.sanmeng.base.vo.music.TabMusicInfoVo;
import cc.sanmeng.core.entity.DataPageValue;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author：胡侯东
 * @Date：2022/1/26 2:00 PM
 * @Desc:
 */
@CrossOrigin
@RestController
@RequestMapping(value = "/api/app/TabMusic")
public class MusicTabApi {

    @Resource
    private MusicService musicService;

    /**
     * 分页查询Tabmusic
     * @param ro
     * @param page
     * @param pageSize
     * @return
     */
    @GetMapping(value = "selectTabPage")
    public DataPageValue<TabMusicInfoVo> selectTabPage(TabMusicRo ro, Integer page, Integer pageSize) {
        return musicService.selectTabPage(ro, page, pageSize);
    }
}