package entities;

import javax.persistence.*;

@Entity
@Table(name = "Riviste")
public class Riviste extends ElementoLettura {
    @Id
    @GeneratedValue
    private long ISBN;
    @Enumerated (EnumType.STRING)
    @Column (name ="periodicità")
    protected Periodicità periodicità;

    public Riviste() {
    }

    public Riviste(String titolo, int annoPubblicazione, int numeroPagine, Periodicità periodicità) {
        super(titolo, annoPubblicazione, numeroPagine);
        this.periodicità= periodicità;

    }


    public long getISBN() {
        return ISBN;
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
                ", titolo='" + getTitolo() + '\'' +
                ", anno pubblicazione='" + getAnnoPubblicazione() + '\'' +
                ", numero pagine='" + getNumeroPagine() + '\'' +
                ", periodicità pubblicazione='" + periodicità + '\'' +
                '}';

    }


}