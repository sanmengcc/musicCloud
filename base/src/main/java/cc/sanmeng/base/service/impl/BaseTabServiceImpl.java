package cc.sanmeng.base.service.impl;

import cc.sanmeng.base.dao.BaseTabDAO;
import cc.sanmeng.base.po.BaseTabPo;
import cc.sanmeng.base.ro.BaseTabRo;
import cc.sanmeng.base.service.BaseTabService;
import cc.sanmeng.base.vo.BaseTabVo;
import cc.sanmeng.core.util.Json;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author：胡侯东
 * @Date：2022/1/26 10:18 AM
 * @Desc:
 */
@Service
public class BaseTabServiceImpl implements BaseTabService {

    @Resource
    private BaseTabDAO baseTabDAO;

    @Override
    public List<BaseTabVo> selectList(BaseTabRo ro) {
        List<BaseTabPo> dataList = baseTabDAO.selectList(ro);
        return Json.createList(dataList, BaseTabVo.class);
    }

    @Override
    public BaseTabVo selectById(Long id) {
        BaseTabPo po = baseTabDAO.queryById(id);
        return Json.createBean(po, BaseTabVo.class);
    }
}