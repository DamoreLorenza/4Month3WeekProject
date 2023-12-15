package entities;

import javax.persistence.*;

@Entity
@Table(name = "Libri")
public class Libri {
    @Id
    @GeneratedValue
    private long ISBN;
    private String titolo;
    protected int annoPubblicazione;
    protected int numeroPagine;
    private String autore;
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
    public long setISBN(Long ISBN) {
        this.ISBN = ISBN;
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