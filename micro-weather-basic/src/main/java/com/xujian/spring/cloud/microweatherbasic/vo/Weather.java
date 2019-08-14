/**
 * 
 */
package com.xujian.spring.cloud.microweatherbasic.vo;

import java.io.Serializable;
import java.util.List;

/**
 * The type Weather.
 */
public class Weather implements Serializable {

	private static final long serialVersionUID = 1L;

	private String city;

	private String aqi;

	private String wendu;

	private String ganmao;

	private Yesterday yesterday;

	private List<Forecast> forecast;

	/**
	 * Gets city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets city.
	 *
	 * @param city the city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Gets aqi.
	 *
	 * @return the aqi
	 */
	public String getAqi() {
		return aqi;
	}

	/**
	 * Sets aqi.
	 *
	 * @param aqi the aqi
	 */
	public void setAqi(String aqi) {
		this.aqi = aqi;
	}

	/**
	 * Gets wendu.
	 *
	 * @return the wendu
	 */
	public String getWendu() {
		return wendu;
	}

	/**
	 * Sets wendu.
	 *
	 * @param wendu the wendu
	 */
	public void setWendu(String wendu) {
		this.wendu = wendu;
	}

	/**
	 * Gets ganmao.
	 *
	 * @return the ganmao
	 */
	public String getGanmao() {
		return ganmao;
	}

	/**
	 * Sets ganmao.
	 *
	 * @param ganmao the ganmao
	 */
	public void setGanmao(String ganmao) {
		this.ganmao = ganmao;
	}

	/**
	 * Gets yesterday.
	 *
	 * @return the yesterday
	 */
	public Yesterday getYesterday() {
		return yesterday;
	}

	/**
	 * Sets yesterday.
	 *
	 * @param yesterday the yesterday
	 */
	public void setYesterday(Yesterday yesterday) {
		this.yesterday = yesterday;
	}

	/**
	 * Gets forecast.
	 *
	 * @return the forecast
	 */
	public List<Forecast> getForecast() {
		return forecast;
	}

	/**
	 * Sets forecast.
	 *
	 * @param forecast the forecast
	 */
	public void setForecast(List<Forecast> forecast) {
		this.forecast = forecast;
	}
}
