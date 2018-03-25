package com.example.demo;

import com.example.demo.service.CRUDService;
import com.example.demo.service.file.FileCRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@ContextConfiguration(locations = "classpath:com/dataload/applicationcontext.xml")
@SpringBootApplication
public class DemoApplication {
	static DemoCRUD demoCRUD = new DemoCRUD();

	@Autowired
	FileCRUD crudService;

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
		System.out.println(demoCRUD.getService().read().toString());

	}
}
