package Giulio_Marra;

import Giulio_Marra.dao.EventoDAO;
import Giulio_Marra.dao.LocationDAO;
import Giulio_Marra.dao.PartecipazioneDAO;
import Giulio_Marra.dao.PersonaDAO;
import Giulio_Marra.entities.Concerto;
import Giulio_Marra.enums.Genere;
import Giulio_Marra.enums.TipoEvento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("s3-l4-be");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();

        EventoDAO ed = new EventoDAO(em);
        LocationDAO ld = new LocationDAO(em);
        PersonaDAO ped = new PersonaDAO(em);
        PartecipazioneDAO pad = new PartecipazioneDAO(em);

        Concerto rocksound = new Concerto("Rock Sound", LocalDate.of(2024, 07, 10), "14 esima edizione del rock sound", TipoEvento.PUBBLICO, Genere.ROCK, true);
        //ed.save(rocksound);

        System.out.println("tutto alla grande");

        ed.getConcertiInStreaming(true).forEach(System.out::println);
    }
}
