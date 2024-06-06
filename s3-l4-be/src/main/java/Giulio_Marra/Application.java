package Giulio_Marra;

import Giulio_Marra.dao.EventoDAO;
import Giulio_Marra.dao.LocationDAO;
import Giulio_Marra.dao.PartecipazioneDAO;
import Giulio_Marra.dao.PersonaDAO;
import Giulio_Marra.entities.Evento;
import Giulio_Marra.entities.Location;
import Giulio_Marra.entities.Partecipazione;
import Giulio_Marra.entities.Persona;
import Giulio_Marra.enums.Sesso;
import Giulio_Marra.enums.Stato;
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

        Location cocoloco = new Location("cocoloco", "newyork");
        Persona giulio = new Persona("giulio", "marra", "giulioemail@email", LocalDate.of(1995, 01, 21), Sesso.MASCHIO);
        Evento newave = new Evento("newave", LocalDate.of(2024, 12, 12), "Welcome to new wave schhol", TipoEvento.PUBBLICO);

        /*ld.save(cocoloco);
        ed.save(newave);
        ped.save(giulio);*/

        Persona persona = ped.findById(1);
        Evento evento1 = ed.findById(1);

        Partecipazione partecipazione = new Partecipazione(persona, evento1, Stato.CONFERMATA);

        pad.save(partecipazione);

        System.out.println("tutto alla grande");
    }
}
