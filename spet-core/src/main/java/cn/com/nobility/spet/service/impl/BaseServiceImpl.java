package cn.com.nobility.spet.service.impl;

import cn.com.nobility.po.BasePo;
import cn.com.nobility.spet.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @author: spt
 * @description:
 * @date: 2019/5/15 14:48
 */
@Service
public class BaseServiceImpl implements BaseService {

    @Autowired
    private JdbcTemplate dao;

    @Override
    public String add(BasePo basePo) {
        return null;
    }

    @Override
    public BasePo get(Integer id) {
        return null;
    }

    @Override
    public Integer update(Integer id, BasePo basePo) {
        return null;
    }

    @Override
    public Integer delete(Integer id) {
        return null;
    }
}
