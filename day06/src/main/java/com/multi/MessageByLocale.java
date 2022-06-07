package com.multi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.i18n.LocaleContext;
import org.springframework.web.server.ServerWebExchange;

@Configuration
public class MessageByLocale {

    @Autowired
    private MessageSource messageSource;

    @Autowired
    private LocaleResolve localeResolver;	// LocaleResolve로 지역 감지

    public String getMessage(String code, ServerWebExchange exchange) {
        LocaleContext localeContext = localeResolver.resolveLocaleContext(exchange);	// 해당 지역의 언어로 exchange해준다
        return messageSource.getMessage(code, null, localeContext.getLocale());
    }
}