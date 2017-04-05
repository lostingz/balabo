/**
 * Chsi
 * Created on 2017年03月29日
 */
package com.bala.comment.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.bala.core.hibernate.pojos.BaseData;

/**
 * @author lostingz<a href="mailto:18710833123@163.com">lostingz</a>
 * @version $Id$
 */
@Table(name = "comment")
@Entity
public class Comment extends BaseData implements Serializable {
    private static final Long serialVersionUID = 1L;
    //评论人uid
    @Column
    private Integer uid;
    //被评论人uid
    private Integer to_uid;
    //帖子id
    @Column
    private Integer tid;
    //评论内容
    @Column
    private String content;
    //设备
    @Column
    private String device;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getTo_uid() {
        return to_uid;
    }

    public void setTo_uid(Integer to_uid) {
        this.to_uid = to_uid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }
}
