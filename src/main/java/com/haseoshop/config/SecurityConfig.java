package com.haseoshop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity //WebSecurityConfigurerAdapter을 상속받는 클래스에 해당 어노테이션을 선언하면 SpringFilterChain이 자동으로 포함됨
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	//오버라이딩을 통해 보안 설정을 커스터마이징 한다.
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
	}
	
	//비밀번호를 암호화 해서 저장
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder(); 
	}

}
