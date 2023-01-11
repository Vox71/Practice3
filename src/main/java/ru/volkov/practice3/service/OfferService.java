package ru.volkov.practice3.service;

import ru.volkov.practice3.model.Client;
import ru.volkov.practice3.model.Offer;
import ru.volkov.practice3.model.Stuff;

import java.time.LocalDate;

public interface OfferService {
    Offer signNewOffer(LocalDate startDate, LocalDate endingDate, Client client, Stuff stuff);
}
