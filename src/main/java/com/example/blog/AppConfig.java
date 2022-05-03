package com.example.blog;

import com.example.blog.service.serviceimpl.LoadSecreteService;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.sql.DataSource;
import java.util.Map;

@Configuration
@EnableWebSecurity
public class AppConfig extends WebSecurityConfigurerAdapter {
    Dotenv dotenv = Dotenv.configure().load();
   @Bean
   public DataSource dataSource(){
       LoadSecreteService loadSecreteService = new LoadSecreteService();
       Map<String, String> secret= loadSecreteService.loadSecret();
       SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
       dataSource.setDriverClass(com.mysql.cj.jdbc.Driver.class);
       dataSource.setUrl("jdbc:mysql://"+secret.get("DB_HOST")+":3306/"+secret.get("DB_NAME"));
       dataSource.setUsername(secret.get("DB_USER"));
       dataSource.setPassword(secret.get("DB_PASSWORD"));
       return  dataSource;
   }
   @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
       return  new BCryptPasswordEncoder();
   }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
                 auth.jdbcAuthentication()
                .dataSource(dataSource())
                .passwordEncoder(bCryptPasswordEncoder())
                         .usersByUsernameQuery("SELECT email,password,enabled FROM user WHERE email=?")
                .authoritiesByUsernameQuery("SELECT * FROM user WHERE email=?");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.authorizeRequests().antMatchers(
                "/",
                "/register",
                "/post",
                "/login"
        ).permitAll().and()
                .authorizeRequests()
                .antMatchers("/home","/upload_cover")
                .authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .failureUrl("/login.jsp?error=true").and()
                .logout()
                .clearAuthentication(true)
                .deleteCookies()
                .logoutSuccessUrl("/");
//        http.authorizeRequests().antMatchers("/up").hasRole("admin");

    }
}
