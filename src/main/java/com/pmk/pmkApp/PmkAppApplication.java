package com.pmk.pmkApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;


@SpringBootApplication
public class PmkAppApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(PmkAppApplication.class, args);

	}

}
