package cn.itcast.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2017年12月22日 上午11:04:39
 * @version 1.0
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		/** 创建SpringApplication */
		SpringApplication springApplication = new SpringApplication(Application.class); 
		/** 设置关闭Banner */
		springApplication.setBannerMode(Mode.OFF);
		/** 运行 */
		springApplication.run(args);
	}
}
