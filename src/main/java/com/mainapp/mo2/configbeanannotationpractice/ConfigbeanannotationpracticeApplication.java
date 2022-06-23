package com.mainapp.mo2.configbeanannotationpractice;

import com.mainapp.anotherdeveloper.OuterBean;
import com.mainapp.mo2.configbeanannotationpractice.beans.FirstBean;
import com.mainapp.mo2.configbeanannotationpractice.beans.SecondBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.mainapp.mo2.configbeanannotationpractice.config","com.mainapp.anotherdeveloper"})
public class ConfigbeanannotationpracticeApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(ConfigbeanannotationpracticeApplication.class, args);
		FirstBean firstBean = (FirstBean) context.getBean("firstBean");
		SecondBean secondBean = (SecondBean) context.getBean("secondBean");
		OuterBean outerBean = (OuterBean) context.getBean("outerBean");
		System.out.println(firstBean.print());
		System.out.println(secondBean.print());
		System.out.println(outerBean.print());


	}

}
