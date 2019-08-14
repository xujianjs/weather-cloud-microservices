package com.xujian.spring.cloud.microweatherbasic.vo;

import java.io.Serializable;

/**
 * The type Forecast.
 */
public class Forecast implements Serializable {

	private static final long serialVersionUID = 1L;

	private String date;

	private String high;

	private String fengxiang;

	private String low;

	private String fengli;

	private String type;

	/**
	 * Gets date.
	 *
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * Sets date.
	 *
	 * @param date the date
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * Gets high.
	 *
	 * @return the high
	 */
	public String getHigh() {
		return high;
	}

	/**
	 * Sets high.
	 *
	 * @param high the high
	 */
	public void setHigh(String high) {
		this.high = high;
	}

	/**
	 * Gets fengxiang.
	 *
	 * @return the fengxiang
	 */
	public String getFengxiang() {
		return fengxiang;
	}

	/**
	 * Sets fengxiang.
	 *
	 * @param fengxiang the fengxiang
	 */
	public void setFengxiang(String fengxiang) {
		this.fengxiang = fengxiang;
	}

	/**
	 * Gets low.
	 *
	 * @return the low
	 */
	public String getLow() {
		return low;
	}

	/**
	 * Sets low.
	 *
	 * @param low the low
	 */
	public void setLow(String low) {
		this.low = low;
	}

	/**
	 * Gets fengli.
	 *
	 * @return the fengli
	 */
	public String getFengli() {
		return fengli;
	}

	/**
	 * Sets fengli.
	 *
	 * @param fengli the fengli
	 */
	public void setFengli(String fengli) {
		this.fengli = fengli;
	}

	/**
	 * Gets type.
	 *
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets type.
	 *
	 * @param type the type
	 */
	public void setType(String type) {
		this.type = type;
	}
}
