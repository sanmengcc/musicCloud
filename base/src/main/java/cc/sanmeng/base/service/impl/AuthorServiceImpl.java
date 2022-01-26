package cc.sanmeng.base.service.impl;

import cc.sanmeng.base.dao.AuthorDAO;
import cc.sanmeng.base.service.AuthorService;
import cc.sanmeng.base.vo.AuthorVo;
import cc.sanmeng.core.util.Json;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author：胡侯东
 * @Date：2022/1/26 1:57 PM
 * @Desc:
 */
@Service
public class AuthorServiceImpl implements AuthorService {

    @Resource
    private AuthorDAO authorDAO;

    @Override
    public List<AuthorVo> selectByMusicId(Long musicId) {
        return Json.createList(authorDAO.selectByMusicId(musicId), AuthorVo.class);
    }
}