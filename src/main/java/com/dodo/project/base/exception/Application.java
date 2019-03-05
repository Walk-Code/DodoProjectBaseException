package com.dodo.project.base.exception;

import com.dodo.project.base.exception.utils.AssertHelper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <b>Application</b></br>
 *
 * <pre>
 * 启动类
 * </pre>
 *
 * @Author xqyjjq walk_code@163.com
 * @Date 2018/10/6 13:42
 * @Since JDK 1.8
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
