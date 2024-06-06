package Giulio_Marra.entities;

import Giulio_Marra.enums.TipoEvento;
import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class PartitaDiCalcio extends Evento {

    private String squadra_di_casa;
    private String squadra_ospite;
    private String squadra_vincente;
    private int gol_casa;
    private int gol_ospite;

    public PartitaDiCalcio() {
    }

    public PartitaDiCalcio(String titoloEvento, LocalDate dataEevento, String descrizioneEvento, TipoEvento tipoevento, String squadra_di_casa, String squadra_ospite, String squadra_vincente, int gol_casa, int gol_ospite) {
        super(titoloEvento, dataEevento, descrizioneEvento, tipoevento);
        this.squadra_di_casa = squadra_di_casa;
        this.squadra_ospite = squadra_ospite;
        this.squadra_vincente = squadra_vincente;
        this.gol_casa = gol_casa;
        this.gol_ospite = gol_ospite;
    }

    public String getSquadra_di_casa() {
        return squadra_di_casa;
    }

    public void setSquadra_di_casa(String squadra_di_casa) {
        this.squadra_di_casa = squadra_di_casa;
    }

    public String getSquadra_ospite() {
        return squadra_ospite;
    }

    public void setSquadra_ospite(String squadra_ospite) {
        this.squadra_ospite = squadra_ospite;
    }

    public String getSquadra_vincente() {
        return squadra_vincente;
    }

    public void setSquadra_vincente(String squadra_vincente) {
        this.squadra_vincente = squadra_vincente;
    }

    public int getGol_casa() {
        return gol_casa;
    }

    public void setGol_casa(int gol_casa) {
        this.gol_casa = gol_casa;
    }

    public int getGol_ospite() {
        return gol_ospite;
    }

    public void setGol_ospite(int gol_ospite) {
        this.gol_ospite = gol_ospite;
    }

    @Override
    public String toString() {
        return "PartitaDiCalcio{" +
                "squadra_di_casa='" + squadra_di_casa + '\'' +
                ", squadra_ospite='" + squadra_ospite + '\'' +
                ", squadra_vincente='" + squadra_vincente + '\'' +
                ", gol_casa=" + gol_casa +
                ", gol_ospite=" + gol_ospite +
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
