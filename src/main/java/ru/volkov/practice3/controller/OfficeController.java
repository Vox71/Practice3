package ru.volkov.practice3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.volkov.practice3.model.Office;
import ru.volkov.practice3.repository.OfficeRepository;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/office")
public class OfficeController {

    private final OfficeRepository officeRepository;

    @Autowired
    public OfficeController(OfficeRepository officeRepository) {
        this.officeRepository = officeRepository;
    }

    @GetMapping("")
    public List<Office> getOffice() {
        return officeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Office getOfficeById(@PathVariable("id") UUID id) {
        return officeRepository.findById(id).orElse(null);
    }
}
