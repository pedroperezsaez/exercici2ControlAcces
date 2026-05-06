package com.banc.especial;

import com.banc.core.CompteBancari;
// TODO 3.4: Intenta importar 'com.banc.core.ValidadorSeguretat'. Et deixa?

public class CompteEstalvi extends CompteBancari {
    private double interès = 0.02;

    public CompteEstalvi(String id, Client titular, double saldo) throws com.banc.core.BancException {
        // TODO 3.1: Constructor
        super(id, titular, saldo);
    }

    public void aplicarInterès() {
        // TODO 3.2: Intenta accedir a 'idCompte' per mostrar-lo. 
        
        // TODO 3.3: Intenta cridar a 'actualitzarSaldo'. Què passa?
        
        // TODO 3.5: Intenta instanciar 'ValidadorSeguretat' i cridar el seu mètode públic.
        // Entén per què la visibilitat de la classe mana per sobre de la visibilitat del mètode.
    }

    // TODO 3.6: Intenta fer un @Override del mètode 'tancarCompte()' de la mare.
    // Analitza l'error del compilador: quina diferència hi ha entre "no tenir accés" i "no poder sobreescriure"?

    // TODO 3.7: Fes un @Override del mètode 'calcularComissions' de la classe mare.
    // Com que els comptes d'estalvi no tenen comissions, fes que aquest mètode retorni 0.0.
    // Reflexiona: per què podem sobreescriure aquest mètode estant en un paquet diferent?
}
