package myApp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins(StringUtils.delimitedListToStringArray("https://Java.VesselsSchedule/", ",", " "))
                .allowCredentials(true)
                .allowedMethods("GET, POST, PUT, PATCH, DELETE, OPTIONS");
    }
}
