package Giulio_Marra.entities;

import Giulio_Marra.enums.Genere;
import Giulio_Marra.enums.TipoEvento;
import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Concerto extends Evento {
    private Genere genere;
    private boolean in_streaming;

    public Concerto() {

    }

    public Concerto(String titoloEvento, LocalDate dataEevento, String descrizioneEvento, TipoEvento tipoevento, Genere genere, boolean in_streaming) {
        super(titoloEvento, dataEevento, descrizioneEvento, tipoevento);
        this.genere = genere;
        this.in_streaming = in_streaming;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public boolean isIn_streaming() {
        return in_streaming;
    }

    public void setIn_streaming(boolean in_streaming) {
        this.in_streaming = in_streaming;
    }

    @Override
    public String toString() {
        return "Concerto{" +
                "genere=" + genere +
                ", in_streaming=" + in_streaming +
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
