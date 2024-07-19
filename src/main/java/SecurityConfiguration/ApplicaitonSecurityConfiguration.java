package SecurityConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import JWT.AuthenticationEntryPoint.JWTAuthentication;
import JWT.AuthenticationEntryPoint.JwtAuthenticationFilter;

@Configuration
public class ApplicaitonSecurityConfiguration {

	@Bean
	public UserDetailsService userDetailService() {
		UserDetails userDetails = User.builder().username("Jatin").password(passwordEncoder().encode("admin"))
				.roles("ADMIN").build();
		UserDetails userDetails2 = User.builder().username("Devershi").password(passwordEncoder().encode("admin"))
				.roles("ADMIN").build();
		return new InMemoryUserDetailsManager(userDetails, userDetails2);
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
