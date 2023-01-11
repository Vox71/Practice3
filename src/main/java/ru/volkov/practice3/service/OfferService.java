package ru.volkov.practice3.service;

import ru.volkov.practice3.model.Client;
import ru.volkov.practice3.model.Offer;
import ru.volkov.practice3.model.Stuff;

import java.time.LocalDate;
import java.util.UUID;

public interface OfferService {
    Offer signNewOffer(LocalDate startDate, LocalDate endingDate, Client client, Stuff stuff);

    Offer signNewOffer(LocalDate startDate, LocalDate endingDate, UUID client, UUID stuff);
}
