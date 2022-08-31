package com.example.stringboot2class;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class StringBoot2ClassApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringBoot2ClassApplication.class, args);
		Runtime rt = Runtime.getRuntime();
		try {
			rt.exec("cmd /c start chrome.exe http://localhost:8080");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
