package com.wellcolleague.inhouseculture.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration // 빈 설정을 담당하는 클래스 -> @Bean 정의된 메소드를 통해 빈을 정의하고 생명주기를 설정함.
@EnableWebSecurity //SpringSecurityFilterChain이 자동으로 포함됨. 스프링 시큐리티
@EnableGlobalMethodSecurity(
        prePostEnabled = true,
        securedEnabled = true,
        jsr250Enabled = true
        /* PrePostEnabled 속성은 Spring Security Pre/Post에 대한 어노테이션을 활성화한다.
        securedEnabled 속성은 @Secured을 활성화해야 하는지 여부를 결정한다.
        jsr250Enabled 속성은 @RoleAllowed을 사용할 수 있게 해준다. */
)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .formLogin().disable()
                .authorizeRequests()
                .antMatchers("/")
                .permitAll();
    }
}
