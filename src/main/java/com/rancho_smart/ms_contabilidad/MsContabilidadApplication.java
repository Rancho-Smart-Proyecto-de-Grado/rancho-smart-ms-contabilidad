package com.rancho_smart.ms_contabilidad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsContabilidadApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsContabilidadApplication.class, args);
	}

}
