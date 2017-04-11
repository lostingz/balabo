/**
 * Chsi
 * Created on 2017年03月29日
 */
package com.bala.comment.model;

import java.io.Serializable;

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
@Table(name = "comment")
@Entity
public class Comment extends BaseData implements Serializable {
    private static final Long serialVersionUID = 1L;
    //评论人uid
    @Column
    private String uid;
    //被评论人uid
    private String to_uid;
    //帖子id
    @Column
    private String tid;
    //评论内容
    @Column
    @Basic(fetch = FetchType.LAZY)
    @Type(type="text")
    private String content;
    //设备
    @Column
    private String device;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getTo_uid() {
        return to_uid;
    }

    public void setTo_uid(String to_uid) {
        this.to_uid = to_uid;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
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
