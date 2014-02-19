/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Entities.Client;
import Util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author chaima
 */
public class ClientDAO {

    /**
     *
     * @param c
     */
    public void insertClient(Client c){

        String requete = "insert into client (nom,prenoma,email) values (?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, c.getNom());
            ps.setString(2, c.getPrenom());
            ps.setString(3, c.getEmail());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }


   /* public void updateClient(Client d){
        String requete = "update client set adresse_client=? where id_client=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, c.getAdresse_client());
            ps.setInt(2, c.getId_dep());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }

    public void deleteClient(int id){
        String requete = "delete from pays where id=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Pays supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


    public Client findClientById(int id){
    Client client = new Client();
     String requete = "select * from client where id_client=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                client.setId_dep(resultat.getInt(1));
                client.setAdresse_client(resultat.getString(2));
            }
            return client;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du client "+ex.getMessage());
            return null;
        }
    }

    public Client findClientByAdresse(String adr){
    Client client = new Client();
     String requete = "select * from client where adresse_client = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, adr);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                client.setId_dep(resultat.getInt(1));
                System.out.println("testttttttt"+client.getId_dep());
                client.setAdresse_client(resultat.getString(2));
                System.out.println(resultat.getString(2));
            }
            return client;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du client "+ex.getMessage());
            return null;
        }
    }*/

    public List<Client> DisplayAllClients (){


        List<Client> listeclients = new ArrayList<Client>();

        String requete = "select * from client";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Client client =new Client();
                client.setId_client(resultat.getInt(1));
                client.setNom(resultat.getString(2));
                client.setPrenom(resultat.getString(3));
                client.setEmail(resultat.getString(4));

                listeclients.add(client);
            }
            return listeclients;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des clients "+ex.getMessage());
            return null;
        }
    }

    
}
