package DAO;

import entities.Libri;
import entities.Riviste;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class RivisteDAO {
    private final EntityManager em;
    public RivisteDAO (EntityManager em){this.em= em;};
    public void save (Riviste riviste){
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(riviste);
        transaction.commit();
        System.out.println("rivista aggiunta correttamente");
    }
    public Riviste findById(long ISBN){
        return em.find(Riviste.class, ISBN);
    }
   /* public void findByIdAndDelete(long ISBN){
        Riviste found = this.findById(ISBN);
        if (found != null){
            EntityTransaction transaction= em.getTransaction();
            transaction.begin();
            em.remove(found);
            transaction.commit();
            System.out.println("trovata ed eliminato");
        } else {System.out.println("dove seeeeii, non ti trovoo rivistaa!!");
    }

 }
  */
}
