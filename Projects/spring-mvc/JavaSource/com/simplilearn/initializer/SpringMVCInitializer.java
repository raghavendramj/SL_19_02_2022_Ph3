package com.simplilearn.initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.simplilearn.config.AppConfig;

public class SpringMVCInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
		applicationContext.register(AppConfig.class);
		applicationContext.setServletContext(servletContext);

		ServletRegistration.Dynamic dispatcherServlet = servletContext.addServlet("springDispatcherServlet",
				new DispatcherServlet(applicationContext));
		dispatcherServlet.setLoadOnStartup(1);
		dispatcherServlet.addMapping("/");
		dispatcherServlet.addMapping("/start");

	}
}
