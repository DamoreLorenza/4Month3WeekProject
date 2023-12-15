package entities;

import DAO.*;
import entities.Libri;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Id;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public class Application {
private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("project3");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();

        ArchivioDAO archivioDAO = new ArchivioDAO(em);
        PrestitoDAO prestitoDAO = new PrestitoDAO(em);
        UtenteDAO utenteDAO = new UtenteDAO(em);
        LibriDAO libriDAO = new LibriDAO(em);
        RivisteDAO rivisteDAO = new RivisteDAO(em);

        Utente userOne = new Utente("Leone","Il cane fifone", LocalDate.of(2000, 1, 1), UUID.randomUUID());
        Riviste rivistaOne = new Riviste("Benedetta Parodi cucina",2023, 999,Periodicità.MENSILE);
        Libri libroOne = new Libri("HungerGames",2010, 666,"Suzanne Collins", "fantascienza");
        Prestito prestitoOne = new Prestito(userOne, rivistaOne, new Date(), new Date(),new Date() );

        utenteDAO.save(userOne);
        libriDAO.save(libroOne);
        rivisteDAO.save(rivistaOne);
        prestitoDAO.save(prestitoOne);

         Libri hungerGamesFoundByISBN = libriDAO.findById(libroOne.getISBN());
        if (hungerGamesFoundByISBN != null){System.out.println(hungerGamesFoundByISBN);}
        else{System.out.println("cant find that aaarrrggg");};

        //libriDAO.findByIdAndDelete(numeroISBN)

       // archivioDAO.AnnoPubblicazione(1999);
       // archivioDAO.RicercaAutore("Pablo Escobar");
       // archivioDAO.RicercaTitolo("Che confusione");


        em.close();
        emf.close();

    }

}
