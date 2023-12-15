package entities;

import javax.persistence.*;

@Entity
@Table(name = "Libri")
public class Libri extends ElementoLettura {
    @Id
    @GeneratedValue
    private long ISBN;
    @Column (name ="autore")
    private String autore;
    @Column (name ="genere")
    private String genere;

    public Libri() {
    }

    public Libri(String titolo, int annoPubblicazione, int numeroPagine, String autore, String genere) {
        super( titolo, annoPubblicazione, numeroPagine);
        this.autore = autore;
        this.genere = genere;
    }



    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
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
                ", titolo='" + getTitolo() + '\'' +
                ", anno pubblicazione='" + getAnnoPubblicazione() + '\'' +
                ", numero pagine='" + getNumeroPagine() + '\'' +
                ", autore='" + autore + '\'' +
                ", genere='" + genere + '\'' +
                '}';

    }
}