package ru.volkov.practice3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.volkov.practice3.dto.NewOfferParameters;
import ru.volkov.practice3.dto.OfferStatistic;
import ru.volkov.practice3.model.Offer;
import ru.volkov.practice3.repository.OfferRepository;
import ru.volkov.practice3.service.OfferControlService;
import ru.volkov.practice3.service.OfferStatisticService;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/offer")
public class OfferController {

    private final OfferRepository offerRepository;

    private final OfferControlService.OfferControllerService offerService;

    private final OfferStatisticService offerStatisticService;

    @Autowired
    public OfferController(final OfferRepository offerRepository,
                           final OfferControlService.OfferControllerService offerService,
                           final OfferStatisticService offerStatisticService) {
        this.offerRepository = offerRepository;
        this.offerService = offerService;
        this.offerStatisticService = offerStatisticService;
    }

    @GetMapping("")
    public List<Offer> getOffer() {
        return offerRepository.findAll();
    }

    @GetMapping("/{id}")
    public Offer getOfferById(@PathVariable("id") UUID id) {
        return offerRepository.findById(id).orElse(null);
    }

    @PutMapping("")
    public Offer signNewOffer(@RequestBody NewOfferParameters offerParameters) {
        Objects.requireNonNull(offerParameters);
        Objects.requireNonNull(offerParameters.getClientId());
        Objects.requireNonNull(offerParameters.getStuffId());
        Objects.requireNonNull(offerParameters.getStartDate());
        Objects.requireNonNull(offerParameters.getEndingDate());

        return offerService.signNewOffer(
                offerParameters.getStartDate(),
                offerParameters.getEndingDate(),
                offerParameters.getClientId(),
                offerParameters.getStuffId());
    }

    @GetMapping("/statistic")
    public OfferStatistic getOfferStatistic() {
        return offerStatisticService.getOfferStatistic();
    }
}