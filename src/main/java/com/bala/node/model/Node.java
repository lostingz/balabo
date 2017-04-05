/**
 * Chsi
 * Created on 2017年03月29日
 */
package com.bala.node.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Table;

import com.bala.core.hibernate.pojos.BaseData;

/**
 * @author lostingz<a href="mailto:18710833123@163.com">lostingz</a>
 * @version $Id$
 */
@Table(name = "node")
public class Node extends BaseData implements Serializable {

    private static final long serialVersionUID = 1L;
    //父节点id
    @Column
    private Integer pid;
    //节点名称
    @Column
    private String title;
    //节点描述
    @Column
    private String description;
    //节点英文简写
    @Column
    private String slug;
    // 节点图片
    @Column
    private String pic;
    //帖子数
    @Column
    private Integer topics;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Integer getTopics() {
        return topics;
    }

    public void setTopics(Integer topics) {
        this.topics = topics;
    }
}
