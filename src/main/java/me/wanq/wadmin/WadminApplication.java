package me.wanq.wadmin;

import me.wanq.wadmin.common.audit.AppAutitorAware;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaAuditing
@EnableTransactionManagement
public class WadminApplication {

    public static void main(String[] args) {
        SpringApplication.run(WadminApplication.class, args);
    }


    @Bean
    public AuditorAware<Integer> auditorProvider() {
        return new AppAutitorAware();
    }
}
