/**
 * Chsi
 * Created on 2017年04月13日
 */
package com.bala.topic.dao;

import com.bala.common.page.Page;
import com.bala.topic.model.Topic;

/**
 * @author zhenggm<a href="mailto:zhenggm@chsi.com.cn">zhenggm</a>
 * @version $Id$
 */
public interface TopicDAO {
    Page<Topic> getTopic(String uid);
}
