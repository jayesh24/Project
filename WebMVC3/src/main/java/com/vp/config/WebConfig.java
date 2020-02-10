package com.vp.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@ComponentScan(basePackages = {"com.vp"})
public class WebConfig extends WebMvcConfigurerAdapter{
	@Bean
	   public InternalResourceViewResolver viewResolver(){
		   InternalResourceViewResolver InternalResourceViewResolver =
				   new InternalResourceViewResolver();
		   InternalResourceViewResolver.setViewClass(JstlView.class);
		   InternalResourceViewResolver.setPrefix("/WEB-INF/jsp/");
		   InternalResourceViewResolver.setSuffix(".jsp");
		   return InternalResourceViewResolver;
	   }

}
