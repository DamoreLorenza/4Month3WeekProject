package entities;

import javax.persistence.*;

@Entity
@Table(name = "Riviste")
public class Riviste {
    @Id
    @GeneratedValue
    private long ISBN;
    @Column (name ="titolo")
    private String titolo;
    @Column (name ="anno_pubblicazione")
    protected int annoPubblicazione;
    @Column (name ="numero_pagine")
    protected int numeroPagine;

    @Enumerated (EnumType.STRING)
    @Column (name ="periodicità")
    protected Periodicità periodicità;

    public Riviste() {
    }

    public Riviste(String titolo, int annoPubblicazione, int numeroPagine, Periodicità periodicità) {
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = numeroPagine;
        this.periodicità= periodicità;

    }


    public long getISBN() {
        return ISBN;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    public Periodicità getPeriodicità() {
        return periodicità;
    }

    public void setPeriodicità(Periodicità periodicità) {
        this.periodicità = periodicità;
    }


    @Override
    public String toString() {
        return "Riviste{" +
                "Codice ISBN=" + ISBN +
                ", titolo='" + titolo + '\'' +
                ", anno pubblicazione='" + annoPubblicazione + '\'' +
                ", numero pagine='" + numeroPagine + '\'' +
                ", periodicità pubblicazione='" + periodicità + '\'' +
                '}';

    }


}