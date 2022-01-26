package cc.sanmeng.base.api.app;

import cc.sanmeng.base.ro.BaseTabRo;
import cc.sanmeng.base.service.BaseTabService;
import cc.sanmeng.base.vo.BaseTabVo;
import cc.sanmeng.core.entity.DataListValue;
import cc.sanmeng.core.entity.DataValue;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author：胡侯东
 * @Date：2022/1/26 10:23 AM
 * @Desc:
 */
@CrossOrigin
@RestController
@RequestMapping(value = "/api/app/BaseTab")
public class BaseTabApi{

    @Resource
    private BaseTabService baseTabService;

    /**
     * 根据状态获取BaseTab列表
     * @param ro
     * @return
     */
    @GetMapping(value = "selectList")
    public DataListValue<BaseTabVo> selectList(BaseTabRo ro) {
        return DataListValue.success(baseTabService.selectList(ro));
    }

    /**
     * 根据ID获取BaseTab
     * @param id
     * @return
     */
    @GetMapping(value = "selectById")
    public DataValue<BaseTabVo> selectById(Long id) {
        return DataValue.success(baseTabService.selectById(id));
    }
}