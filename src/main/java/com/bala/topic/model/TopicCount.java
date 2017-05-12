/**
 * Chsi
 * Created on 2017年03月29日
 */
package com.bala.topic.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.bala.common.hibernate.pojos.BaseData;

/**
 * @author lostingz<a href="mailto:18710833123@163.com">lostingz</a>
 * @version $Id$
 */
@Table(name = "topic_count")
@Entity
public class TopicCount extends BaseData implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column
    private Integer views;
    @Column
    private Integer loves;
    @Column
    private Integer favorites;
    @Column
    private Integer sinks;
    @Column
    private Integer comments;

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getLoves() {
        return loves;
    }

    public void setLoves(Integer loves) {
        this.loves = loves;
    }

    public Integer getFavorites() {
        return favorites;
    }

    public void setFavorites(Integer favorites) {
        this.favorites = favorites;
    }

    public Integer getSinks() {
        return sinks;
    }

    public void setSinks(Integer sinks) {
        this.sinks = sinks;
    }

    public Integer getComments() {
        return comments;
    }

    public void setComments(Integer comments) {
        this.comments = comments;
    }
}
