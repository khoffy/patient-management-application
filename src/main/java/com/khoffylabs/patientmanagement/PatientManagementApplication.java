package com.khoffylabs.patientmanagement;

import com.khoffylabs.patientmanagement.dao.PatientRepository;
import com.khoffylabs.patientmanagement.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class PatientManagementApplication implements CommandLineRunner {
	@Autowired
	private PatientRepository patientRepository;

	public static void main(String[] args) {
		SpringApplication.run(PatientManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		patientRepository.save(new Patient(null, "Amuzuga Wisdom", new Date(), false, 5));
		patientRepository.save(new Patient(null, "Amuzuga Ezekiel", new Date(), false, 8));
		patientRepository.save(new Patient(null, "Amuzuga Josue", new Date(), true, 5));
		patientRepository.save(new Patient(null, "Luffy D. Monkey", new Date(), false, 5));
		patientRepository.save(new Patient(null, "azerty qwerty", new Date(), true, 4));

		patientRepository.findAll().forEach(patient -> {
			System.out.println(patient);
		} );
	}
}
