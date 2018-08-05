package com.jeetprksh.h2.boot.app;

import com.jeetprksh.h2.boot.dao.AppSettingRepository;
import com.jeetprksh.h2.boot.entity.ApplicationSetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.logging.Logger;

@SpringBootApplication(scanBasePackages = "com.jeetprksh.h2.boot")
@EnableJpaRepositories("com.jeetprksh.h2.boot")
@EntityScan("com.jeetprksh.h2.boot")
public class Application {

    private static Logger logger = Logger.getLogger(Application.class.getName());

	@Autowired
	private static AppSettingRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		repository.save(new ApplicationSetting("abc@def.ghi", true));
		repository.findAll().forEach(setting -> {
            logger.info(setting.toString());
        });
	}

	@Autowired
	public void setRepository(AppSettingRepository repository) {
		Application.repository = repository;
	}
}
