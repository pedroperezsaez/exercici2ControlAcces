package com.banc.repository;

import com.banc.core.CompteBancari;
import com.banc.model.Client;
import java.util.ArrayList;
import java.util.List;

// TODO 8.1: Aquesta classe hauria de ser accessible des de qualsevol paquet? 
// O només des del paquet 'main' i 'core'? Pensa en la seguretat del magatzem.
public class BancRepository {
    
    // TODO 8.2: Crea llistes privades per emmagatzemar tots els clients i tots els comptes del banc.
        private List<CompteBancari> compte;
        private List<Client> clients;
        public BancRepository(){
            this.compte=new ArrayList<>();
            this.clients= new ArrayList<>();
        }
    // TODO 8.3: Crea mètodes per:
    // - Afegir un nou client.
    public void afagirCLient(Client c){
        this.clients.add(c);
    }
    // - Buscar un compte pel seu ID.
    public CompteBancari cercaComptePerId(String id){
            for (CompteBancari cb: this.compte){
                if (cb.getIdCompte().equals(id)){
                    return cb;
                }
            }
            return null;
    }
    // - Llistar tots els comptes d'un client concret.
    public List<CompteBancari> comptesDeCLient(String dni){
            for (Client c: this.clients){

            }
            return null;
    }
    // Reflexiona: Si un mètode retorna una Llista, com podem evitar que algú 
    // modifiqui la llista interna del repositori des de fora?
}
