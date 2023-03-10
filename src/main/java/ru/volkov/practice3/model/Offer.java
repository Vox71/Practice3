package ru.volkov.practice3.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "db_offer")
public class Offer {
    @Id
    @JsonProperty("id")
    @Column(name = "ID")
    private UUID id;

    @JsonProperty("serial_number")
    @Column(name = "serial_number")
    private String serialNumber;

    @JsonProperty("sign_date")
    @Column(name = "sign_date")
    private LocalDate signDate;

    @JsonProperty("ending_date")
    @Column(name = "ending_date")
    private LocalDate endingDate;

    @JsonProperty("start_date")
    @Column(name = "start_date")
    private LocalDate startDate;

    @JsonProperty("client")
    @ManyToOne(targetEntity = Client.class, optional = false)
    @JoinColumn(name = "client_id")
    private Client client;

    @JsonProperty("office")
    @ManyToOne(targetEntity = Office.class, optional = false)
    @JoinColumn(name = "office_id")
    private Office office;

    @JsonProperty("stuff")
    @ManyToOne(targetEntity = Stuff.class, optional = false)
    @JoinColumn(name = "stuff_id")
    private Stuff stuff;

    public Offer() {
    }

    public Offer(UUID id, String serialNumber, LocalDate signDate, LocalDate endingDate,
                 LocalDate startDate, Client client, Office office, Stuff stuff) {
        this.id = id;
        this.serialNumber = serialNumber;
        this.signDate = signDate;
        this.endingDate = endingDate;
        this.startDate = startDate;
        this.client = client;
        this.office = office;
        this.stuff = stuff;
    }

    @JsonProperty("id")
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @JsonProperty("serial_number")
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @JsonProperty("sign_date")
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

    @JsonProperty("start_date")
    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("client")
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @JsonProperty("office")
    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    @JsonProperty("stuff")
    public Stuff getStuff() {
        return stuff;
    }

    public void setStuff(Stuff stuff) {
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
        private Client client;
        private Office office;
        private Stuff stuff;

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

        public Builder setClient(Client client) {
            this.client = client;
            return this;
        }

        public Builder setOffice(Office office) {
            this.office = office;
            return this;
        }

        public Builder setStuff(Stuff stuff) {
            this.stuff = stuff;
            return this;
        }
    }
}