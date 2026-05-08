package com.banc.model;

import com.banc.core.CompteBancari;
import com.banc.especial.CompteEstalvi;

import java.util.ArrayList;
import java.util.List;

public class Client {
    // TODO 7.1: Defineix els atributs 'nom' i 'dni'. Tria la visibilitat adient.
    private String nom;
    private String dni;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public List<CompteBancari> getComptes() {
        return comptes;
    }

    // TODO 7.2: Un client pot tenir diversos comptes bancaris.
    // Crea una llista per emmagatzemar-los, però assegura't que ningú des de fora
    // pugui substituir la llista sencera (encapsulament de col·leccions).
        final List<CompteBancari> comptes;
    public Client(String nom, String dni) {
        // Constructor
        this.nom=nom;
        this.dni=dni;
        this.comptes=new ArrayList<>();

    }

    // TODO 7.3: Crea un mètode per afegir un compte al client.
    public void afagirCOmpte(CompteBancari compte){
     /*   this.comptes.add(compte);
        for (CompteBancari cb: compte.){


        }

      */
    }
}
