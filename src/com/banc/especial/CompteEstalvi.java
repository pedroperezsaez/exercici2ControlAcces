package com.banc.especial;

import com.banc.core.CompteBancari;
import com.banc.model.Client;
// TODO 3.4: Intenta importar 'com.banc.core.ValidadorSeguretat'. Et deixa?
// no puc importar la class porque no esta declarada como public import com.banc.core.ValidadorSeguretat;

public class CompteEstalvi extends CompteBancari {
    private double interès = 0.02;

    public double getInterès() {
        return interès;
    }

    public void setInterès(double interès) {
        this.interès = interès;
    }

    public CompteEstalvi(String id, Client titular, double saldo) throws com.banc.core.BancException {
        // TODO 3.1: Constructor
        super(id, titular, saldo);

    }

    public void aplicarInterès() {
        // TODO 3.2: Intenta accedir a 'idCompte' per mostrar-lo. 
        String id= this.idCompte;
        // TODO 3.3: Intenta cridar a 'actualitzarSaldo'. Què passa?
        // no hi puc accedir perque la funcio esta
        // marcada com accesde paquet this.actualitzarSaldo(1000);

        // TODO 3.5: Intenta instanciar 'ValidadorSeguretat' i cridar el seu mètode públic.
        // Entén per què la visibilitat de la classe mana per sobre de la visibilitat del mètode.
        // la clase no es public por tanto no podemos instanciar i tampoc cridar el seaus metodes publics ValidadorSeguretat vd = new...;
    }

    // TODO 3.6: Intenta fer un @Override del mètode 'tancarCompte()' de la mare.
    // Analitza l'error del compilador: quina diferència hi ha entre "no tenir accés" i "no poder sobreescriure"?
     //@Override
    // no se puede hacer override porque es final public void tancarCompte()
    // TODO 3.7: Fes un @Override del mètode 'calcularComissions' de la classe mare.
    // Com que els comptes d'estalvi no tenen comissions, fes que aquest mètode retorni 0.0.
    // Reflexiona: per què podem sobreescriure aquest mètode estant en un paquet diferent?
    @Override
    protected  double calculaComissions(){
        return 0;
    }
}
