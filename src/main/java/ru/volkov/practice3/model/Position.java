package ru.volkov.practice3.model;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "db_position")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "salary")
    private Integer salary;

    public Position() {
    }

    public Position(UUID id, String name, Integer salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public static class Builder {
        private UUID id;
        private String name;
        private Integer salary;

        public Position build() {
            Position position = new Position();
            position.setId(id);
            position.setName(name);
            position.setSalary(salary);
            return position;
        }

        public Builder setId(UUID id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSalary(Integer salary) {
            this.salary = salary;
            return this;
        }
    }
}