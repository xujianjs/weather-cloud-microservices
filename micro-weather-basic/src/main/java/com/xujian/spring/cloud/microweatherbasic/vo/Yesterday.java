package com.xujian.spring.cloud.microweatherbasic.vo;

import java.io.Serializable;

/**
 * The type Yesterday.
 */
public class Yesterday implements Serializable {

	private static final long serialVersionUID = 1L;

	private String date;

	private String high;

	private String fx;

	private String low;

	private String fl;

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
	 * Gets fx.
	 *
	 * @return the fx
	 */
	public String getFx() {
		return fx;
	}

	/**
	 * Sets fx.
	 *
	 * @param fx the fx
	 */
	public void setFx(String fx) {
		this.fx = fx;
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
	 * Gets fl.
	 *
	 * @return the fl
	 */
	public String getFl() {
		return fl;
	}

	/**
	 * Sets fl.
	 *
	 * @param fl the fl
	 */
	public void setFl(String fl) {
		this.fl = fl;
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
