package cn.com.nobility.spet.service;


import cn.com.nobility.po.BasePo;

/**
 * @author: spt
 * @description:
 * @date: 2019/5/15 14:48
 */
public interface BaseService<T> {


    /**
     * 新增实体
     *
     * @param basePo
     * @param <T>
     * @return 主键
     */
    <T extends BasePo> String add(T basePo);

    /**
     * 根据主键获得实体
     *
     * @param id
     * @return Entity
     */
    <T extends BasePo> T get(Integer id);

    /**
     * 修改 实体
     *
     * @param id
     * @param basePo
     * @param <T>
     * @return 受影响行数
     */
    <T extends BasePo> Integer update(Integer id, T basePo);

    /**
     * 根据ID删除
     *
     * @param id
     * @param <T>
     * @return 受影响行数
     */
    <T extends BasePo> Integer delete(Integer id);
}
