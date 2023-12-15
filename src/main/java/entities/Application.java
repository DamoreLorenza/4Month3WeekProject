package entities;

import DAO.LibriDAO;
import entities.Libri;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Id;
import javax.persistence.Persistence;

public class Application {
private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("project3");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        LibriDAO libriDAO = new LibriDAO(em);
        Libri HungerGames = new Libri("HungerGames",2010, 666,"Suzanne Collins", "fantascienza");
        libriDAO.save(HungerGames);
         Libri hungerGamesFoundByISBN = libriDAO.findById(HungerGames.getISBN());
        if (hungerGamesFoundByISBN != null){System.out.println(hungerGamesFoundByISBN);}
        else{System.out.println("cant find that aaarrrggg");};

        //libriDAO.findByIdAndDelete(numeroISBN)

        //close.em();
       // close.emf();

    }

}
