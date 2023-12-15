package DAO;


import entities.Utente;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class UtenteDAO {
    private final EntityManager em;
    public UtenteDAO (EntityManager em){this.em= em;};
    public void save (Utente utente){
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(utente);
        transaction.commit();
        System.out.println("rivista aggiunta correttamente");
    }
    public Utente findById(int Id){
        return em.find(Utente.class, Id);
    }
   /* public void findByIdAndDelete(int Id){
        Utente found = this.findById(Id);
        if (found != null){
            EntityTransaction transaction= em.getTransaction();
            transaction.begin();
            em.remove(found);
            transaction.commit();
            System.out.println("trovato ed eliminato");
        } else {System.out.println("dove seeeeii, non ti trovoo utenteee!!");
    }

 }
  */
}
