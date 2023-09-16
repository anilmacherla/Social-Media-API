/*package com.anilmacherla.neo4jrestapi.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

@Override
 protected void configure(HttpSecurity http) throws Exception{
     http.csrf().disable().authorizeRequests()
             .antMatchers(HttpMethod.GET,"/").permitAll()
             .antMatchers(HttpMethod.GET,"/start").permitAll()
             .antMatchers(HttpMethod.GET,"/login").permitAll()
             .antMatchers(HttpMethod.GET,"/myLogin").permitAll()
             .antMatchers(HttpMethod.GET,"/images/**").permitAll()
             .anyRequest().authenticated()
             .and()
             .formLogin()
             .loginPage("/myLogin")
             .failureUrl("/login?error")
             .permitAll()
             .and()
             .oauth2Login();
 }
}*/
