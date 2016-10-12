package com.realaicy.lib.core.orm.plugin;

import java.io.Serializable;

/**
 * <p>实体实现该接口表示想要实现树结构
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
public interface Treeable<ID extends Serializable> {

    public void setResIcon(String resIcon);

    public String getResIconExt();

    public void setResIconExt(String resIconExt);

    public Short getResWeight();

    public void setResWeight(Short resWeight);

    public Boolean getShow();

    public void setShow(Boolean show);

    public Boolean getFolder();

    public void setFolder(Boolean folder);

    public Boolean getAutoExpand();

    public void setAutoExpand(Boolean autoExpand);

    public String getCascadeID();

    public void setCascadeID(String cascadeID);

}
