package entities;

import javax.persistence.*;

@Entity
@Table(name = "Libri")
public class Libri {
    @Id
    @GeneratedValue
    private long ISBN;
    @Column (name ="titolo")
    private String titolo;
    @Column (name ="anno_pubblicazione")
    protected int annoPubblicazione;
    @Column (name ="numero_pagine")
    protected int numeroPagine;
    @Column (name ="autore")
    private String autore;
    @Column (name ="genere")
    private String genere;

    public Libri() {
    }

    public Libri(String titolo, int annoPubblicazione, int numeroPagine, String autore, String genere) {
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = numeroPagine;
        this.autore = autore;
        this.genere = genere;
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

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.titolo = titolo;
    }
    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }


    @Override
    public String toString() {
        return "Libri{" +
                "Codice ISBN=" + ISBN +
                ", titolo='" + titolo + '\'' +
                ", anno pubblicazione='" + annoPubblicazione + '\'' +
                ", numero pagine='" + numeroPagine + '\'' +
                ", autore='" + autore + '\'' +
                ", genere='" + genere + '\'' +
                '}';

    }
}