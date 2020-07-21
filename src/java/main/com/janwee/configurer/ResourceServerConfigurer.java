package com.janwee.configurer;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class ResourceServerConfigurer extends ResourceServerConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry urlRegistry = http
                .authorizeRequests();
        urlRegistry.antMatchers("/**").permitAll();
        urlRegistry.antMatchers("/**/api/login").permitAll();
        urlRegistry.antMatchers("/api/clients/current").permitAll();

        urlRegistry.antMatchers("/swagger-ui.html").permitAll();
        urlRegistry.antMatchers("/webjars/**").permitAll();
        urlRegistry.antMatchers("/swagger-resources/**").permitAll();
        urlRegistry.antMatchers("/v2/api-docs").permitAll();

        urlRegistry.antMatchers("/index.html").permitAll();
        urlRegistry.antMatchers("/login.html").permitAll();
        urlRegistry.antMatchers("/bizaudits/test.json").permitAll();
        urlRegistry.antMatchers("/actuator/health").permitAll();
        urlRegistry.anyRequest().authenticated();
    }
}
