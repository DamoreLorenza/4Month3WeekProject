package DAO;

import entities.Libri;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class LibriDAO {
    private final EntityManager em;
    public LibriDAO (EntityManager em){this.em= em;};
    public void save (Libri libri){
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(libri);
        transaction.commit();
        System.out.println("libro aggiunto correttamente");
    }
    public Libri findById(long ISBN){
        return em.find(Libri.class, ISBN);
    }
   /* public void findByIdAndDelete(long ISBN){
        Libri found = this.findById(ISBN);
        if (found != null){
            EntityTransaction transaction= em.getTransaction();
            transaction.begin();
            em.remove(found);
            transaction.commit();
            System.out.println("trovato ed eliminato");
        } else {System.out.println("dove seeeeii, non ti trovoo libroo!!");
    }

 }
  */

}
