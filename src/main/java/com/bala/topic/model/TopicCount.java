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
}
