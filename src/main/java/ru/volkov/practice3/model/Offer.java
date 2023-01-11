package ru.volkov.practice3.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "db_offer")
public class Offer {
    @Id
    @Column(name = "ID")
    private UUID id;

    @Column(name = "serial_number")
    private String serialNumber;

    @Column(name = "sign_date")
    private LocalDate signDate;

    @Column(name = "ending_date")
    private LocalDate endingDate;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "client_id")
    private UUID client;

    @Column(name = "office_id")
    private UUID office;

    @Column(name = "stuff_id")
    private UUID stuff;

    public Offer() {
    }

    public Offer(UUID id, String serialNumber, LocalDate signDate, LocalDate endingDate,
                 LocalDate startDate, UUID client, UUID office, UUID stuff) {
        this.id = id;
        this.serialNumber = serialNumber;
        this.signDate = signDate;
        this.endingDate = endingDate;
        this.startDate = startDate;
        this.client = client;
        this.office = office;
        this.stuff = stuff;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public LocalDate getSignDate() {
        return signDate;
    }

    public void setSignDate(LocalDate signDate) {
        this.signDate = signDate;
    }

    public LocalDate getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(LocalDate endingDate) {
        this.endingDate = endingDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public UUID getClient() {
        return client;
    }

    public void setClient(UUID client) {
        this.client = client;
    }

    public UUID getOffice() {
        return office;
    }

    public void setOffice(UUID office) {
        this.office = office;
    }

    public UUID getStuff() {
        return stuff;
    }

    public void setStuff(UUID stuff) {
        this.stuff = stuff;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "id=" + id +
                ", serialNumber='" + serialNumber + '\'' +
                ", signDate=" + signDate +
                ", endingDate=" + endingDate +
                ", startDate=" + startDate +
                ", client=" + client +
                ", office=" + office +
                ", stuff=" + stuff +
                '}';
    }

    public static class Builder {
        private UUID id;
        private String serialNumber;
        private LocalDate signDate;
        private LocalDate endingDate;
        private LocalDate startDate;
        private UUID client;
        private UUID office;
        private UUID stuff;

        public Offer build() {
            Offer offer = new Offer();
            offer.setId(id);
            offer.setSerialNumber(serialNumber);
            offer.setClient(client);
            offer.setOffice(office);
            offer.setStuff(stuff);
            offer.setSignDate(signDate);
            offer.setStartDate(startDate);
            offer.setEndingDate(endingDate);
            return offer;
        }

        public Builder setId(UUID id) {
            this.id = id;
            return this;
        }

        public Builder setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        public Builder setSignDate(LocalDate signDate) {
            this.signDate = signDate;
            return this;
        }

        public Builder setEndingDate(LocalDate endingDate) {
            this.endingDate = endingDate;
            return this;
        }

        public Builder setStartDate(LocalDate startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder setClient(UUID client) {
            this.client = client;
            return this;
        }

        public Builder setOffice(UUID office) {
            this.office = office;
            return this;
        }

        public Builder setStuff(UUID stuff) {
            this.stuff = stuff;
            return this;
        }
    }
}