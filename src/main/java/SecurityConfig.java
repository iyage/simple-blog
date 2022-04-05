

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
   @Bean
   public DataSource dataSource(){
       SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
       dataSource.setDriverClass(com.mysql.cj.jdbc.Driver.class);
       dataSource.setUrl("jdbc:mysql://localhost:3306/blogdb");
       dataSource.setUsername("root");
       dataSource.setPassword("adunni0404");
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
                .usersByUsernameQuery("SELECT email,password enabled from user WHERE email=?")
                .authoritiesByUsernameQuery("SELECT * FROM user WHERE email=?");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
       http.authorizeHttpRequests()
               .antMatchers("/").permitAll()
               .and().formLogin();
    }
}
