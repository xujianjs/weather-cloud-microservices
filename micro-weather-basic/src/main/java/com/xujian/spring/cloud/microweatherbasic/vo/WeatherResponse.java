package com.xujian.spring.cloud.microweatherbasic.vo;

import java.io.Serializable;

/**
 * The type Weather response.
 * <p>
 * 封装消息的返回对象
 */
public class WeatherResponse implements Serializable {
    private static final long serialVersionUID = 5578541859620151809L;

    private Weather data; // 消息数据

    private String status; // 消息状态

    private String desc; // 消息描述

    /**
     * Gets data.
     *
     * @return the data
     */
    public Weather getData() {
        return data;
    }

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(Weather data) {
        this.data = data;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Gets desc.
     *
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets desc.
     *
     * @param desc the desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

}
