/**
 * Chsi
 * Created on 2017年03月03日
 */
package com.bala.util;

import org.apache.commons.lang3.StringUtils;

/**
 * @author zhenggm<a href="mailto:zhenggm@chsi.com.cn">zhenggm</a>
 * @version $Id$
 */
public class StringUtil {
    public static boolean equalAny(String theStr, String... other) {
        if(other == null) {
            return theStr == null;
        } else {
            String[] others = other;
            int length = other.length;
            for(int i = 0; i < length; ++i) {
                String s = others[i];
                if(StringUtils.equals(theStr, s)) {
                    return true;
                }
            }
            return false;
        }
    }
}
