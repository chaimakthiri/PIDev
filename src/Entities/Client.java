/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entities;

/**
 *
 * @author chaima
 */
public class Client {
    int id_client;
    String nom;
    String prenom;
    String adresse;
    int cin;
    String email;
    String mot_de_passe;
    String login;

    public Client() {
    }

    public Client(int id_client, String nom, String prenom, String adresse, int cin, String email, String mot_de_passe, String login) {
        this.id_client = id_client;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.cin = cin;
        this.email = email;
        this.mot_de_passe = mot_de_passe;
        this.login = login;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getCin() {
        return cin;
    }

    public String getEmail() {
        return email;
    }

    public int getId_client() {
        return id_client;
    }

    public String getLogin() {
        return login;
    }

    public String getMot_de_passe() {
        return mot_de_passe;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setMot_de_passe(String mot_de_passe) {
        this.mot_de_passe = mot_de_passe;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
     
    
    
}
