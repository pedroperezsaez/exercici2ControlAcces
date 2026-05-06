package com.banc.core;

import com.banc.model.Client;

public class CompteBancari {
    // TODO 1.1: Atribut 'saldo' (double). Restringit només a aquesta classe.
    private double saldo;
    
    // TODO 1.2: Atribut 'idCompte' (String). Accessible per aquest paquet i per subclasses d'altres paquets.
    protected  String idCompte;
    // TODO 1.3: Atribut 'titular' de tipus Client. Accessible universalment.
        public Client titular;
    public CompteBancari(String id, Client titular, double saldoInicial) throws BancException {
        // TODO 1.4: Abans d'assignar els valors, crida al mètode 'validarID'. 
        // Aquest mètode ara pot llançar diferents tipus d'excepcions segons l'error detectat.

    }
    private boolean validarId(String s) throws  LongitudInvalidaException{
        if (s.length()!=24){
            throw  new LongitudInvalidaException("no es 24") ;
        }

        for (int i = 0; i < s.length()-2; i++) {

        }
        if ((s.charAt(0) != 'E' && s.charAt(1) !='S') ||)

    }
    // TODO 1.9: Crea un mètode PRIVAT anomenat 'validarID' que rebi un String i retorni un boolean.
    // Implementa la validació real llançant l'excepció específica en cada cas:
    // 1. Si la longitud no és 24 -> llança LongitudInvalidaException.
    // 2. Si no comença per "ES" o conté lletres on haurien d'haver-hi números -> llança FormatInvalidException.
    // 3. Si l'algorisme de càlcul dels DC no coincideix -> llança DigitsControlInvalidsException.



    // TODO 1.5: Crea el mètode 'actualitzarSaldo(double nouSaldo)'. 
    // Ha de ser visible només per a les classes d'aquest paquet.

    // TODO 1.6: Crea un mètode per permetre que qualsevol classe pugui consultar el saldo (només lectura).

    // TODO 1.7: Crea un mètode 'tancarCompte()'. Ha de ser accessible des de qualsevol lloc,
    // però prohibeix explícitament que cap subclasse pugui modificar-lo (sobreescriure / override).

    // TODO 1.8: Crea un mètode anomenat 'calcularComissions' que retorni un double (ex: 5.0).
    // Aquest mètode NO ha de ser accessible des del 'Main', però SÍ ha de permetre que
    // qualsevol subclasse (en aquest paquet o en un altre) el pugui utilitzar i sobreescriure.
}
