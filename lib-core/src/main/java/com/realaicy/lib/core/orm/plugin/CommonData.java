package com.realaicy.lib.core.orm.plugin;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>实体实现该接口表示想要逻辑删除
 * 为了简化开发 约定删除标识列名为deleted，<br/>
 * 如果想自定义删除的标识列名：
 * 1、使用注解元数据
 * 2、写一个 getColumn() 方法 返回列名
 * <p/>
 *
 * @author realaicy
 * @version 1.1
 * @email realaicy@gmail.com
 * @qq 8042646
 * @date 14-2-1 上午9:18
 * @description TODO
 * @since 1.1
 */
public interface CommonData<ID extends Serializable> {
    Date getCreateTime();

    void setCreateTime(Date createTime);

    ID getCreaterID();

    void setCreaterID(ID createrID);

    Date getUpdateTime();

    void setUpdateTime(Date updateTime);

    ID getUpdaterID();

    void setUpdaterID(ID updaterID);

    String getCustomCode();

    void setCustomCode(String customCode);

    short getStatus();

    void setStatus(short status);
}
