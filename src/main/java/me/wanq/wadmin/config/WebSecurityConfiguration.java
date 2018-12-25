package me.wanq.wadmin.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.RegexRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatcher;

import javax.servlet.http.HttpServletRequest;
import java.util.regex.Pattern;

@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
//        http.authorizeRequests().antMatchers("/").permitAll()
//                .antMatchers("/hello").hasRole("USER").and()
//                .csrf().requireCsrfProtectionMatcher(new RequestMatcher() {
//            //放行这几种请求
//            private Pattern allowedMethods = Pattern.compile("^(GET|HEAD|TRACE|OPTIONS)$");
//            //放行rest请求，当然后面rest与web将会分开，到时这里可以删除
//            private RegexRequestMatcher unprotectedMatcher = new RegexRequestMatcher("^/api/.*", null);
//
//            @Override
//            public boolean matches(HttpServletRequest request) {
//                if (allowedMethods.matcher(request.getMethod()).matches()) {
//                    return false;
//                }
//
//                String servletPath = request.getServletPath();
//                if (servletPath.contains("/druid")) {
//                    return false;
//                }
//                return !unprotectedMatcher.matches(request);
//            }
//        });
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("user").password("password").roles("USER");
    }
}
