package DAO;
import entities.ElementoLettura;
import entities.Libri;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
public class ArchivioDAO {

    private final EntityManager em;
    public ArchivioDAO (EntityManager em){this.em= em;};

        public List<ElementoLettura> AnnoPubblicazione(int anno) {
            Query query = em.createQuery("SELECT e FROM ElementoLettura e WHERE e.annoPubblicazione = :anno");
            query.setParameter("anno", anno);
            return query.getResultList();
        }

        public List<Libri> RicercaAutore(String autore) {
            Query query = em.createQuery("SELECT l FROM Libro l WHERE l.autore = :autore");
            query.setParameter("autore", autore);
            return query.getResultList();
        }

        public List<ElementoLettura> RicercaTitolo(String titolo) {
            Query query = em.createQuery("SELECT e FROM ElementoLettura e WHERE LOWER(e.titolo) LIKE :titolo");
            query.setParameter("titolo", "%" + titolo + "%");
            return query.getResultList();
        }



}
