package com.banc.main;

import com.banc.core.BancException;
import com.banc.core.CompteBancari;
import com.banc.core.Auditor;
import com.banc.especial.CompteEstalvi;
import com.banc.model.Client;
import com.banc.repository.BancRepository;

public class Main {
    public static void main(String[] args) throws BancException {
        // TODO 4.1: Instancia el 'BancRepository'.
      try {
          BancRepository bancRepository=new BancRepository();
          // TODO 4.2: Crea un Client i diversos comptes (estalvi i comú) vinculats a aquest client

          // dins d'un bloc try-catch per gestionar les excepcions de banc.
          // Recorda: Primer s'ha de crear el client, i després passar-lo al constructor dels comptes.
          Client client=new Client("Bill Gates","123456789A");

          CompteBancari cb1=new CompteBancari("ES9121000418450200051332",client,1000_000);
          CompteBancari cb=new CompteBancari("ES66 3222 5555 4354 4444 3783",client,1000);
          CompteBancari cb3=new CompteEstalvi("ES30 9456 5665 9354 4494 9454",client,100);
          client.afagirCOmpte(cb);
          client.afagirCOmpte(cb1);
          client.afagirCOmpte(cb3);
          // TODO 4.3: Registra el client i els comptes al repositori.

          // TODO 4.4: Intenta recuperar un compte del repositori i realitzar operacions.
          // Quina visibilitat han de tenir els mètodes del repositori per ser útils però segurs?
         CompteBancari compteBancari=bancRepository.cercaComptePerId("ES30 9456 5665 9354 4494 9454");



          // TODO 4.3: Intenta cridar al mètode 'calcularComissions' de l'objecte compte vàlid creat.
          // Comprova què et diu el compilador i raona per què passa això.

          // TODO 4.3: Comprova quins altres mètodes i atributs són visibles i quins donen error de compilació.
      } catch (Exception e) {
          throw new RuntimeException(e);
      }

    }
}
