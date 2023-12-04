package com.example.ddplayers.model;

public class Players {

    private  int id ;
    private String name;
    private String type;
    private int leveLife;
    private int position;
    private int attack_force;

    public Players (int id, String name, String type, int leveLife, int position, int attack_force) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.leveLife = leveLife;
        this.position = position;
        this.attack_force= attack_force;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLeveLife() {
        return leveLife;
    }

    public void setLeveLife(int leveLife) {
        this.leveLife = leveLife;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getAttack_force() {
        return attack_force;
    }

    public void setAttack_force(int attack_force) {
        this.attack_force = attack_force;
    }
    @Override
    public String toString(){
        return
                " Id = " + id +
                        " Nom = " + name +  '\'' +
                        " Type = " + type +  '\'' +
                        " Point de vie = " + leveLife +  '\'' +
                        " Position du joueur = " + position +  '\'' +
                        " Force d'attaque du joueur = " + attack_force +  '\'' ;
    }
}
