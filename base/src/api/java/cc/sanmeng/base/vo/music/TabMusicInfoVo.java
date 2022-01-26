package cc.sanmeng.base.vo.music;

import cc.sanmeng.base.vo.AuthorVo;
import cc.sanmeng.base.vo.MusicVo;
import lombok.Data;

import java.util.List;

/**
 * @Author：胡侯东
 * @Date：2022/1/26 1:47 PM
 * @Desc:
 */
@Data
public class TabMusicInfoVo extends MusicVo {

    /**
     * 制作者信息
     */
    private List<AuthorVo> authors;
}