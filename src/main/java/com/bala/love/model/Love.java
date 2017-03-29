/**
 * Chsi
 * Created on 2017年03月29日
 */
package com.bala.love.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author lostingz<a href="mailto:18710833123@163.com">lostingz</a>
 * @version $Id$
 */
@Table(name = "love")
@Entity
public class Love implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column
    private Integer id;
    @Column
    private Integer tid;
    @Column
    private Integer uid;

    public Love(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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