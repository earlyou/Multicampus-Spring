package com.multi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class WebConfig implements ApplicationContextAware {

    ApplicationContext context;

  
    
    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasenames("messages/message");		// messages/message 디렉토리에 언어를 집어넣음
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }



    @Override
    public void setApplicationContext(ApplicationContext context) {
        this.context = context;
    }
}