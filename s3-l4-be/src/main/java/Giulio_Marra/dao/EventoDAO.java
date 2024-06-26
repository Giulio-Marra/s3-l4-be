package Giulio_Marra.dao;

import Giulio_Marra.entities.Evento;
import Giulio_Marra.enums.Genere;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class EventoDAO {
    private final EntityManager em;

    public EventoDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Evento evento) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(evento);
        transaction.commit();
        System.out.println("L'evento" + evento.getTitoloEvento() + "è stato aggiunto");
    }

    public Evento findById(long id) {
        return em.find(Evento.class, id);
    }

    public List<Evento> getConcertiInStreaming(boolean valore) {
        TypedQuery<Evento> query = em.createQuery("SELECT e FROM Evento e JOIN Concerto c ON e.id = c.id WHERE c.in_streaming = :valore", Evento.class);
        query.setParameter("valore", valore);
        return query.getResultList();
    }

    public List<Evento> getConcertiPerGenere(Genere genere) {
        TypedQuery<Evento> query = em.createQuery("SELECT e FROM Evento e JOIN Concerto c on e.id = c.id WHERE c.genere = :genere", Evento.class);
        query.setParameter("genere", genere);
        return query.getResultList();
    }

    public List<Evento> getPartiteVinteInCasa(String squadra) {
        TypedQuery<Evento> query = em.createNamedQuery("getPartiteVinteInCasa", Evento.class);
        query.setParameter("squadra", squadra);
        return query.getResultList();
    }


}
