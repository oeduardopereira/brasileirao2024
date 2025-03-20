package com.api.brasilerao.brasileirao2024;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_teams")
public class TeamModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String name;
    private String state;

    public TeamModel() {}

    public TeamModel (String name, String state) {
        this.name = name;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
