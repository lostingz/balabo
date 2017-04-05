/**
 * Chsi
 * Created on 2017年03月29日
 */
package com.bala.love.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.bala.core.hibernate.pojos.BaseData;

/**
 * @author lostingz<a href="mailto:18710833123@163.com">lostingz</a>
 * @version $Id$
 */
@Table(name = "love")
@Entity
public class Love extends BaseData implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column
    private Integer tid;
    @Column
    private Integer uid;

    public Love(){}

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

}