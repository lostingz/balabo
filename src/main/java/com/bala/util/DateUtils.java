/**
 * Chsi
 * Created on 2017年04月11日
 */
package com.bala.util;

import java.util.Calendar;

/**
 * @author lostingz<a href="mailto:18710833123@163.com">lostingz</a>
 * @version $Id$
 */
public class DateUtils {
    public static int getCurrentUnixTime() {
        return (int)(Calendar.getInstance().getTimeInMillis()/1000L);
    }
}
