package ru.volkov.practice3.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "db_client")
public class Client {
    @Id
    @JsonProperty("id")
    @Column(name = "ID")
    private UUID id;

    @JsonProperty("surname")
    @Column(name = "surname")
    private String surname;

    @Column(name = "name")
    @JsonProperty("name")
    private String name;

    @Column(name = "patronymic")
    @JsonProperty("patronymic")
    private String patronymic;

    @Column(name = "sex")
    @JsonProperty("sex")
    private Boolean sex;

    @Column(name = "birth_date")
    @JsonProperty("birth_date")
    private LocalDate birthDate;

    @Column(name = "inn")
    @JsonProperty("inn")
    private String inn;

    @Column(name = "passport_serial")
    @JsonProperty("passport_serial")
    private String passportSerial;

    @Column(name = "phone")
    @JsonProperty("phone")
    private String phone;

    public Client(final UUID id,
                  final String surname,
                  final String name,
                  final String patronymic,
                  final Boolean sex,
                  final LocalDate birthDate,
                  final String inn,
                  final String passportSerial,
                  final String phone) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.sex = sex;
        this.birthDate = birthDate;
        this.inn = inn;
        this.passportSerial = passportSerial;
        this.phone = phone;
    }

    public Client() {

    }

    @JsonProperty("id")
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @JsonProperty("surname")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("patronymic")
    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @JsonProperty("sex")
    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    @JsonProperty("birth_date")
    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @JsonProperty("inn")
    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    @JsonProperty("passport_serial")
    public String getPassportSerial() {
        return passportSerial;
    }

    public void setPassportSerial(String passportSerial) {
        this.passportSerial = passportSerial;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", inn='" + inn + '\'' +
                ", passportSerial='" + passportSerial + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static class Builder {
        private UUID id;
        private String surname;
        private String name;
        private String patronymic;
        private Boolean sex;
        private LocalDate birthDate;
        private String inn;
        private String passportSerial;
        private String phone;

        public Client build() {
            Client client = new Client();
            client.setId(id);
            client.setSurname(surname);
            client.setName(name);
            client.setPatronymic(patronymic);
            client.setPassportSerial(passportSerial);
            client.setSex(sex);
            client.setBirthDate(birthDate);
            client.setInn(inn);
            client.setPhone(phone);
            return client;
        }
        public Builder setId(UUID id) {
            this.id = id;
            return this;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPatronymic(String patronymic) {
            this.patronymic = patronymic;
            return this;
        }

        public Builder setSex(Boolean sex) {
            this.sex = sex;
            return this;
        }

        public Builder setBirthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder setInn(String inn) {
            this.inn = inn;
            return this;
        }

        public Builder setPassportSerial(String passportSerial) {
            this.passportSerial = passportSerial;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }


    }



}