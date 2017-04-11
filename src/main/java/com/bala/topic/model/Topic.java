/**
 * Chsi
 * Created on 2017年03月29日
 */
package com.bala.topic.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.bala.common.hibernate.pojos.BaseData;

/**
 * @author lostingz<a href="mailto:18710833123@163.com">lostingz</a>
 * @version $Id$
 */
@Table(name = "topic")
@Entity
public class Topic extends BaseData implements Serializable{
    private static final long serialVersionUID = 1L;
    //发布人
    @Column
    private String uid;
    //所属节点
    @Column
    private String nid;
    //帖子标题
    @Column
    private String title;
    //帖子内容
    @Column
    @Basic(fetch = FetchType.LAZY)
    @Type(type="text")
    private String content;
    //是否置顶
    @Column
    private Integer is_top;
    //是否是精华贴
    @Column
    private Integer is_essence;
    // 帖子权重
    @Column
    private Double weight;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getIs_top() {
        return is_top;
    }

    public void setIs_top(Integer is_top) {
        this.is_top = is_top;
    }

    public Integer getIs_essence() {
        return is_essence;
    }

    public void setIs_essence(Integer is_essence) {
        this.is_essence = is_essence;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public static void main(String[] args) {
        System.out.println((new Date().getTime()));
    }
}
