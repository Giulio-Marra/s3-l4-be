package Giulio_Marra.entities;

import Giulio_Marra.enums.TipoEvento;
import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class GaraDiAtletica extends Evento {


    public GaraDiAtletica() {
    }


    public GaraDiAtletica(String titoloEvento, LocalDate dataEevento, String descrizioneEvento, TipoEvento tipoevento) {
        super(titoloEvento, dataEevento, descrizioneEvento, tipoevento);


    }


    @Override
    public String toString() {
        return "GaraDiAtletica{" +

                ", id=" + id +
                ", titoloEvento='" + titoloEvento + '\'' +
                ", dataEevento=" + dataEevento +
                ", descrizioneEvento='" + descrizioneEvento + '\'' +
                ", tipoevento=" + tipoevento +
                ", partecipazioni=" + partecipazioni +
                ", location=" + location +
                '}';
    }
}
