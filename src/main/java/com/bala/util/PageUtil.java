/**
 * Chsi
 * Created on 2017年04月13日
 */
package com.bala.util;

import java.util.Collections;
import java.util.List;

import com.bala.common.page.Page;

/**
 * @author zhenggm<a href="mailto:zhenggm@chsi.com.cn">zhenggm</a>
 * @version $Id$
 */
public class PageUtil{
    public static <T> Page<T> getPage(int pageNumber,int pageSize,int totalCount,List<T> list){
        if(list!=null&&!list.isEmpty()){
            return new Page(pageNumber,pageSize,totalCount,list);
        }
        return new Page(0,0,0, Collections.emptyList());
    }
}
