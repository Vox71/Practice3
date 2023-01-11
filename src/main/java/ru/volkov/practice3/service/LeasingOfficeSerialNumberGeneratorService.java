package ru.volkov.practice3.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

@Service
public class LeasingOfficeSerialNumberGeneratorService implements SerialNumberGeneratorService {

    private final Random random = new Random();

    @Override
    public String generateSerialNumber() {
        return String.format("#77%s%s",
                random.nextInt(),
                LocalDate.now()
                        .format(DateTimeFormatter.ISO_DATE)
                        .replace("-", ""));
    }
}
