package DAO;


import entities.Prestito;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class PrestitoDAO {
    private final EntityManager em;
    public PrestitoDAO (EntityManager em){this.em= em;};
    public void save (Prestito prestito){
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(prestito);
        transaction.commit();
        System.out.println("prestito segnato");
    }
    public Prestito findById(int Id){
        return em.find(Prestito.class, Id);
    }
   /* public void findByIdAndDelete(int Id){
        Prestito found = this.findById(Id);
        if (found != null){
            EntityTransaction transaction= em.getTransaction();
            transaction.begin();
            em.remove(found);
            transaction.commit();
            System.out.println("trovato ed eliminato");
        } else {System.out.println("dove seeeeii, non ti trovoo prestitoo!!");
    }

 }
  */
}
