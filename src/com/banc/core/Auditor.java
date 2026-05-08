package com.banc.core;

public class Auditor {
    public void auditar(CompteBancari compte) {
        // TODO 2.1: Intenta accedir a 'nomTitular', 'idCompte' i 'saldo'. 
        // Imprimeix per pantalla només aquells que el control d'accés et permeti.
        System.out.println(compte.titular);
        System.out.println(compte.idCompte);
        System.out.println(compte.getSaldo());
        
        // TODO 2.2: Intenta cridar al mètode 'actualitzarSaldo'. És possible?
        compte.actualitzarSaldo(1000);
    }
}
