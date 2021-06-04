package com.ztj.schedule.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

    @Bean
    public FilterRegistrationBean corsFilter() {
        //构造CorsWebFilter需要传入一个CotsConfigurationSorcery接口
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        //跨域文件配置
        CorsConfiguration config = new CorsConfiguration();
        //配置跨域请求，
        config.setAllowCredentials(true);
        //允许哪些源进行请求跨域
        config.addAllowedOrigin("*");
        //允许哪些头进行请求跨域
        config.addAllowedHeader("*");
        //允许哪些方法进行请求跨域
        config.addAllowedMethod("*");
        config.setMaxAge(3600L);
        //注册跨域信息
        source.registerCorsConfiguration("/**", config);
        //构造source信息
        FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
        bean.setOrder(0);
        return bean;
    }
}
