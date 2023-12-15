package entities;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "ElementoLettura")
public class ElementoLettura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ISBN;
    @Column (name ="titolo")
    private String titolo;
    @Column (name ="anno_pubblicazione")
    protected int annoPubblicazione;
    @Column (name ="numero_pagine")
    protected int numeroPagine;

    public ElementoLettura() {
    }

    public ElementoLettura(String titolo, int annoPubblicazione, int numeroPagine) {
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = numeroPagine;
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



    @Override
    public String toString() {
        return "ElementoLettura{" +
                "Codice ISBN=" + ISBN +
                ", titolo='" + titolo + '\'' +
                ", anno pubblicazione='" + annoPubblicazione + '\'' +
                ", numero pagine='" + numeroPagine + '\'' +
                '}';

    }
}