package Giulio_Marra.entities;


import Giulio_Marra.enums.TipoEvento;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "eventi")
public class Evento {
    @Id
    @GeneratedValue
    private long id;


    private String titoloEvento;
    private LocalDate dataEevento;
    private String descrizioneEvento;
    @Enumerated(EnumType.STRING)
    private TipoEvento tipoevento;

    @OneToMany(mappedBy = "evento")
    private List<Partecipazione> partecipazioni;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    public Evento() {

    }

    public Evento(String titoloEvento, LocalDate dataEevento, String descrizioneEvento, TipoEvento tipoevento) {
        this.titoloEvento = titoloEvento;
        this.dataEevento = dataEevento;
        this.descrizioneEvento = descrizioneEvento;
        this.tipoevento = tipoevento;
    }

    public long getId() {
        return id;
    }

    public String getTitoloEvento() {
        return titoloEvento;
    }

    public void setTitoloEvento(String titoloEvento) {
        this.titoloEvento = titoloEvento;
    }

    public LocalDate getDataEevento() {
        return dataEevento;
    }

    public void setDataEevento(LocalDate dataEevento) {
        this.dataEevento = dataEevento;
    }

    public String getDescrizioneEvento() {
        return descrizioneEvento;
    }

    public void setDescrizioneEvento(String descrizioneEvento) {
        this.descrizioneEvento = descrizioneEvento;
    }

    public TipoEvento getTipoevento() {
        return tipoevento;
    }

    public void setTipoevento(TipoEvento tipoevento) {
        this.tipoevento = tipoevento;
    }

    public List<Partecipazione> getPartecipazioni() {
        return partecipazioni;
    }

    public void setPartecipazioni(List<Partecipazione> partecipazioni) {
        this.partecipazioni = partecipazioni;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titoloEvento='" + titoloEvento + '\'' +
                ", dataEevento=" + dataEevento +
                ", descrizioneEvento='" + descrizioneEvento + '\'' +
                ", tipoevento=" + tipoevento +
                ", location=" + location +
                '}';
    }
}
