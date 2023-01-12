package ru.volkov.practice3.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "db_stuff")
public class Stuff {
    @Id
    @JsonProperty("id")
    @Column(name = "ID")
    private UUID id;

    @Column(name = "surname")
    @JsonProperty("surname")
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

    @Column(name = "salary_multiplier")
    @JsonProperty("salary_multiplier")
    private Double salaryMultiplier;

    @ManyToOne(targetEntity = Position.class, optional = false)
    @JsonProperty("position")
    @JoinColumn(name = "position_id")
    private Position position;

    public Stuff() {
    }

    public Stuff(UUID id, String surname, String name, String patronymic, Boolean sex,
                 LocalDate birthDate, Double salaryMultiplier, Position position) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.sex = sex;
        this.birthDate = birthDate;
        this.salaryMultiplier = salaryMultiplier;
        this.position = position;
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

    @JsonProperty("salary_multiplier")
    public Double getSalaryMultiplier() {
        return salaryMultiplier;
    }

    public void setSalaryMultiplier(Double salaryMultiplier) {
        this.salaryMultiplier = salaryMultiplier;
    }

    @JsonProperty("position")
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public static class Builder {
        private UUID id;
        private String surname;
        private String name;
        private String patronymic;
        private Boolean sex;
        private LocalDate birthDate;
        private Double salaryMultiplier;
        private Position position;

        public Stuff build() {
            Stuff stuff = new Stuff();
            stuff.setId(id);
            stuff.setSurname(surname);
            stuff.setName(name);
            stuff.setPatronymic(patronymic);
            stuff.setSex(sex);
            stuff.setBirthDate(birthDate);
            stuff.setSalaryMultiplier(salaryMultiplier);
            stuff.setPosition(position);
            return stuff;
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

        public Builder setSalaryMultiplier(Double salaryMultiplier) {
            this.salaryMultiplier = salaryMultiplier;
            return this;
        }

        public Builder setPosition(Position position) {
            this.position = position;
            return this;
        }
    }
}
