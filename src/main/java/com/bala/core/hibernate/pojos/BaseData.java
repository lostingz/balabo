/**
 * lostingz
 * Created on 2016年7月11日
 */
package com.bala.core.hibernate.pojos;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

import com.bala.core.hibernate.type.DataStatus;

/**
 * @author lostingz<a href="mailto:18710833123@163.com">lostingz</a>
 * @version $Id$
 */
@MappedSuperclass
public class BaseData {
    @Column
    private Integer create_time;
    @Column
    private Integer update_time;
    //0:正常 1:删除
    @Enumerated(EnumType.ORDINAL)
    @Column 
    private DataStatus status;

    public Integer getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Integer create_time) {
        this.create_time = create_time;
    }

    public Integer getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Integer update_time) {
        this.update_time = update_time;
    }

    public DataStatus getStatus() {
        return status;
    }

    public void setStatus(DataStatus status) {
        this.status = status;
    }
}
