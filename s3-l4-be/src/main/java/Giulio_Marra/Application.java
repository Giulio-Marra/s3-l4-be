package Giulio_Marra;

import Giulio_Marra.dao.EventoDAO;
import Giulio_Marra.dao.LocationDAO;
import Giulio_Marra.dao.PartecipazioneDAO;
import Giulio_Marra.dao.PersonaDAO;
import Giulio_Marra.entities.Concerto;
import Giulio_Marra.entities.PartitaDiCalcio;
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
        Concerto iocheneso = new Concerto("Io che ne so", LocalDate.of(2024, 02, 11), "non ne ho propio idea", TipoEvento.PUBBLICO, Genere.POP, false);
        Concerto nonsocosascrivere = new Concerto("Non so cosa scrivere", LocalDate.of(2024, 05, 22), "Non so cosa scrivere", TipoEvento.PRIVATO, Genere.CLASSICO, true);

        PartitaDiCalcio finale = new PartitaDiCalcio("finale mozzarella league", LocalDate.of(2024, 12, 01), "finale della mozzarellone", TipoEvento.PUBBLICO, "Battipaglia", "Pergocrema", "Battipaglia", 4, 2);
        PartitaDiCalcio semifinale = new PartitaDiCalcio("semifinale mozzarella league", LocalDate.of(2024, 12, 01), "semifinale della mozzarellone", TipoEvento.PUBBLICO, "Miami fc", "Battipaglia", "Battipaglia", 1, 2);
        PartitaDiCalcio quartidifinale = new PartitaDiCalcio("quarti mozzarella league", LocalDate.of(2024, 12, 01), "quarti della mozzarellone", TipoEvento.PUBBLICO, "Battipaglia", "Torino", "Battipaglia", 2, 0);

        ed.getConcertiInStreaming(true).forEach(System.out::println);
        System.out.println("_______________________________________________________________________________________________________________________________________________");
        ed.getConcertiPerGenere(Genere.ROCK).forEach(System.out::println);
        System.out.println("_______________________________________________________________________________________________________________________________________________");
        ed.getPartiteVinteInCasa("Battipaglia").forEach(System.out::println);

        System.out.println("tutto alla grande");
    }
}
