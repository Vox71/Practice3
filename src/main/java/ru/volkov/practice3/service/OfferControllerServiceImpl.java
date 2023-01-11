package ru.volkov.practice3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.volkov.practice3.model.Client;
import ru.volkov.practice3.model.Offer;
import ru.volkov.practice3.model.Stuff;
import ru.volkov.practice3.repository.ClientRepository;
import ru.volkov.practice3.repository.StuffRepository;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

@Service
public class OfferControllerServiceImpl implements OfferControlService.OfferControllerService {

    private final ClientRepository clientRepository;

    private final StuffRepository stuffRepository;

    private final OfferService offerService;

    @Autowired
    public OfferControllerServiceImpl(final ClientRepository clientRepository,
                                      final StuffRepository stuffRepository,
                                      final OfferService offerService) {
        this.clientRepository = clientRepository;
        this.stuffRepository = stuffRepository;
        this.offerService = offerService;
    }

    @Override
    public Offer signNewOffer(LocalDate startDate, LocalDate endingDate, UUID clientId, UUID stuffId) {
        Objects.requireNonNull(startDate);
        Objects.requireNonNull(endingDate);
        Objects.requireNonNull(clientId);
        Objects.requireNonNull(stuffId);

        final Client client = clientRepository.findById(clientId).orElseThrow();
        final Stuff stuff = stuffRepository.findById(stuffId).orElseThrow();
        return offerService.signNewOffer(startDate, endingDate, client, stuff);
    }

}
