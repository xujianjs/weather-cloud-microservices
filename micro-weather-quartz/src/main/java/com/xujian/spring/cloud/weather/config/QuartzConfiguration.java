package com.xujian.spring.cloud.weather.config;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xujian.spring.cloud.weather.job.WeatherDataSyncJob;

/**
 * Quartz 配置类.
 * 
 * @since 1.0.0 2017年10月23日
 * @author <a href="xujianjian.top">xujianjian</a>
 */
@Configuration
public class QuartzConfiguration {
	
	private final int TIME = 1800; // 更新频率

	//初始化一个天气数据同步的定时任务(设置定时任务持久化  即使宕机了，下次重启还能找到定时任务)
	@Bean
	public JobDetail weatherDataSyncJobJobDetail() {
		return JobBuilder.newJob(WeatherDataSyncJob.class).withIdentity("weatherDataSyncJob")
				.storeDurably().build();
	}

	@Bean
	public Trigger sampleJobTrigger() {
		//声明调度构建器 每30分钟调度一次
		SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule()
				.withIntervalInSeconds(TIME).repeatForever();

		//针对声明的名为“weatherDataSyncJob”的定时任务  绑定一个触发器  每30分钟触发一次调度
		return TriggerBuilder.newTrigger().forJob(weatherDataSyncJobJobDetail())
				.withIdentity("weatherDataSyncTrigger").withSchedule(scheduleBuilder).build();
	}
}
