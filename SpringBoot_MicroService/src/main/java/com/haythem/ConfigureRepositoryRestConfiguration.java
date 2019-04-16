package com.haythem;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import com.haythem.entitie.Etudiant;
import com.haythem.entitie.Formation;
@Configuration
public class ConfigureRepositoryRestConfiguration extends RepositoryRestConfigurerAdapter {
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.setReturnBodyOnCreate(true);
		config.setReturnBodyOnUpdate(true);
		config.exposeIdsFor(Formation.class,Etudiant.class);

		config.getCorsRegistry().addMapping("/**").allowedOrigins("http://localhost:4200")
		.allowedHeaders("*")
		.allowedMethods("OPTIONS","HEAD","GET","PUT","POST","DELETE","PATCH");
	}

}
