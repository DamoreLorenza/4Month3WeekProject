package entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "Prestito")
public class Prestito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column (name ="utente")
    private Utente utente;
    @Column (name ="Elemento prestato")
    private ElementoLettura elementoLettura;
    @Column (name ="data_inizio_prestito")
    private Date dataInizioPrestito;
    @Column (name ="data_restituzione_prevista")
    private Date dataRestituzionePrevista;
    @Column (name ="data_restituzione_effettiva")
    private Date dataRestituzioneEffettiva;



    public Prestito() {
    }

    public Prestito(Utente utente,ElementoLettura elementoLettura, Date dataInizioPrestito, Date dataRestituzionePrevista, Date dataRestituzioneEffettiva ) {
        this.utente = utente;
        this.elementoLettura = elementoLettura;
        this.dataInizioPrestito = dataInizioPrestito;
        this.dataRestituzionePrevista= dataRestituzionePrevista;
        this.dataRestituzioneEffettiva= dataRestituzioneEffettiva;

    }


    public long getId() {
        return Id;
    }

    public Utente utente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public ElementoLettura elementoLettura() {
        return elementoLettura;
    }

    public void setElementoLettura(ElementoLettura elementoLettura) {
        this.elementoLettura = elementoLettura;
    }

    public Date getDataInizioPrestito() {
        return dataInizioPrestito;
    }

    public void setDataInizioPrestito(Date dataInizioPrestito) {
        this.dataInizioPrestito = dataInizioPrestito;
    }

    public Date getDataRestituzionePrevista() {
        return dataRestituzionePrevista;
    }

    public void setDataRestituzionePrevista(Date dataRestituzionePrevista) {
        this.dataRestituzionePrevista = dataRestituzionePrevista;
    }

    public Date getDataRestituzioneEffettiva() {
        return dataRestituzioneEffettiva;
    }

    public void setDataRestituzioneEffettiva(Date dataRestituzioneEffettiva) {
        this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
    }


    @Override
    public String toString() {
        return "Prestito{" +
                "ID=" + Id +
                ", Utente='" + utente + '\'' +
                ", elemento ='" + elementoLettura + '\'' +
                ", data di inizio prestito='" + dataInizioPrestito + '\'' +
                ", data di restituzione prevista='" + dataRestituzionePrevista + '\'' +
                ", data di restituzione effettiva='" + dataRestituzioneEffettiva + '\'' +
                '}';

    }


}