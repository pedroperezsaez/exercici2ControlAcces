package com.banc.core;

import com.banc.model.Client;

public class CompteBancari {
    // TODO 1.1: Atribut 'saldo' (double). Restringit només a aquesta classe.
    private double saldo;
    
    // TODO 1.2: Atribut 'idCompte' (String). Accessible per aquest paquet i per subclasses d'altres paquets.
    protected  String idCompte;
    // TODO 1.3: Atribut 'titular' de tipus Client. Accessible universalment.
    public Client titular;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getIdCompte() {
        return idCompte;
    }

    public void setIdCompte(String idCompte) {
        this.idCompte = idCompte;
    }

    public Client getTitular() {
        return titular;
    }

    public void setTitular(Client titular) {
        this.titular = titular;
    }

    public CompteBancari(String id, Client titular, double saldoInicial) throws BancException {
        // TODO 1.4: Abans d'assignar els valors, crida al mètode 'validarID'. 
        // Aquest mètode ara pot llançar diferents tipus d'excepcions segons l'error detectat.
       validarId(id);
        id=id.trim();
        id=id.replaceAll(" ","");
        this.titular=titular;
        this.idCompte=id;
        this.saldo=saldoInicial;


    }

    // TODO 1.9: Crea un mètode PRIVAT anomenat 'validarID' que rebi un String i retorni un boolean.
    // Implementa la validació real llançant l'excepció específica en cada cas:
    // 1. Si la longitud no és 24 -> llança LongitudInvalidaException.
    // 2. Si no comença per "ES" o conté lletres on haurien d'haver-hi números -> llança FormatInvalidException.
    // 3. Si l'algorisme de càlcul dels DC no coincideix -> llança DigitsControlInvalidsException.
    private void validarId(String id) throws  LongitudInvalidaException,FormatInvalidException,DigitsControlInvalidsException{
        if (id.length()!=24){
            throw new LongitudInvalidaException("la id del compte te longitud invalida");
        }
        if (!id.startsWith("ES")){
            throw new FormatInvalidException("la id del compte no comença per ES");
        }
        String iban = id.substring(0,4);
        String entitat= id.substring(4,8);
        String oficina = id.substring(8,12);
        String control= id.substring(12,14);
        String ncompte=id.substring(14);

        int[] pesos_entitat={4,8,5,10};
        int[] pesos_oficina={9,7,3,6};
        int dc1 = 0;

        for (int i = 0; i < 4; i++) {
            dc1=dc1+(pesos_entitat[i]* (entitat.charAt(i)-'0'));
            dc1=dc1+ (pesos_oficina[i]*(oficina.charAt(i)-'0'));
        }
        dc1=11-(dc1%11);
        if (dc1==10){
            dc1=1;
        }

        int[] pesos_compte= {1,2,4,8,5,10,9,7,3,6};
        int dc2=0;
        for (int i = 0; i < 10; i++) {
            dc2=dc2+(pesos_compte[i]* (ncompte.charAt(i)-'0'));
        }
        dc2=11-(dc2%11);
        if (dc2== 10){
            dc2=1;
        }
        if (control.charAt(0)-'0' != dc1 || (control.charAt(1)-'0'!=dc2)){
            throw new DigitsControlInvalidsException("Control erroni");
        }

    }

    public static void main(String[] args) throws BancException {
        CompteBancari cb= new CompteBancari("ES190010432286123456789",null,0);
    }


    // TODO 1.5: Crea el mètode 'actualitzarSaldo(double nouSaldo)'. 
    // Ha de ser visible només per a les classes d'aquest paquet.
    void actualitzarSaldo (double nouSaldo){
        this.saldo=nouSaldo;
    }

    // TODO 1.6: Crea un mètode per permetre que qualsevol classe pugui consultar el saldo (només lectura).

    public double getSaldo() {
        return saldo;
    }

    // TODO 1.7: Crea un mètode 'tancarCompte()'. Ha de ser accessible des de qualsevol lloc,
    // però prohibeix explícitament que cap subclasse pugui modificar-lo (sobreescriure / override).
    final public void tancarCompte(){

    }
    // TODO 1.8: Crea un mètode anomenat 'calcularComissions' que retorni un double (ex: 5.0).
    // Aquest mètode NO ha de ser accessible des del 'Main', però SÍ ha de permetre que
    // qualsevol subclasse (en aquest paquet o en un altre) el pugui utilitzar i sobreescriure.
    protected double calculaComissions(){
        return 5.0;
    }
}
