package com.xujian.spring.cloud.weather.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import com.xujian.spring.cloud.weather.util.XmlBuilder;
import com.xujian.spring.cloud.weather.vo.City;
import com.xujian.spring.cloud.weather.vo.CityList;

/**
 * 城市数据服务.
 * 
 * @since 1.0.0 2017年10月23日
 * @author <a href="xujianjian.top">Way Lau</a>
 */
@Service
public class CityDataServiceImpl implements CityDataService {

	@Override
	public List<City> listCity() throws Exception {
		// 读取XML文件
		Resource resource = new ClassPathResource("citylist.xml");
		BufferedReader br = new BufferedReader(new InputStreamReader(resource.getInputStream(), "utf-8"));
		StringBuffer buffer = new StringBuffer();
		String line = "";

		//通过缓冲读取器一行一行的把包装后的数据 读取到新的字符串缓冲区中
		while ((line = br.readLine()) != null) {
			buffer.append(line);
		}

		br.close();

		// XML转为Java对象
		CityList cityList = (CityList) XmlBuilder.xmlStrToObject(CityList.class, buffer.toString());

		return cityList.getCityList();
	}

}
