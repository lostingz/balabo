/**
 * Chsi
 * Created on 2017年04月06日
 */
package com.bala.common.response;

/**
 * @author lostingz<a href="mailto:18710833123@163.com">lostingz</a>
 * @version $Id$
 */
public class JsonResult<T> {
    private String status;
    private String msg;
    private T result;

    public JsonResult() {
    }

    public JsonResult(String status, T result) {
        this.status = status;
        this.result = result;
    }

    public JsonResult successResult(T result) {
        this.result = result;
        this.status=ResponseStatus.SUCCESS.toString();
        return this;
    }
    public JsonResult errorResult(T result) {
        this.result = result;
        this.status=ResponseStatus.FAIL.toString();
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public JsonResult msg(String msg) {
        this.msg = msg;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
