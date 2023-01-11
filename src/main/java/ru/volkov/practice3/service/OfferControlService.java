package ru.volkov.practice3.service;

import ru.volkov.practice3.model.Offer;

import java.time.LocalDate;
import java.util.UUID;

public interface OfferControlService {
    public interface OfferControllerService {
        Offer signNewOffer(LocalDate startDate, LocalDate endingDate, UUID clientId, UUID stuffId);
    }
}
