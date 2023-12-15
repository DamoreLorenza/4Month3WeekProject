package entities;

import DAO.LibriDAO;
import DAO.RivisteDAO;
import DAO.UtenteDAO;
import entities.Libri;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Id;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.UUID;

public class Application {
private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("project3");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        UtenteDAO utenteDAO = new UtenteDAO(em);
        LibriDAO libriDAO = new LibriDAO(em);
        RivisteDAO rivisteDAO = new RivisteDAO(em);
        Utente UserOne = new Utente("Leone","Il cane fifone", LocalDate.of(2000, 1, 1), UUID.randomUUID());
        Riviste cucinaConBenedettaParodi = new Riviste("Benedetta Parodi cucina",2023, 999,Periodicità.MENSILE);
        Libri HungerGames = new Libri("HungerGames",2010, 666,"Suzanne Collins", "fantascienza");
        libriDAO.save(HungerGames);
        rivisteDAO.save(cucinaConBenedettaParodi);
         Libri hungerGamesFoundByISBN = libriDAO.findById(HungerGames.getISBN());
        if (hungerGamesFoundByISBN != null){System.out.println(hungerGamesFoundByISBN);}
        else{System.out.println("cant find that aaarrrggg");};

        //libriDAO.findByIdAndDelete(numeroISBN)

        //close.em();
       // close.emf();

    }

}
