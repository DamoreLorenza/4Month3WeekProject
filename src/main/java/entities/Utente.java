package entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "Utente")
public class Utente {
    @Id
    @GeneratedValue
    private long Id;
    @Column (name ="nome")
    private String nome;
    @Column (name ="cognome")
    private String cognome;
    @Column (name ="data_nascita")
    private LocalDate dataNascita;
    @Column (name ="numero_tessera")
    private UUID numeroTessera;



    public Utente() {
    }

    public Utente(String nome,String cognome, LocalDate dataNascita, UUID numeroTessera) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.numeroTessera= numeroTessera;

    }


    public long getId() {
        return Id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public UUID getNumeroTessera() {
        return numeroTessera;
    }

    public void setNumeroTessera(UUID numeroTessera) {
        this.numeroTessera = numeroTessera;
    }


    @Override
    public String toString() {
        return "Utente{" +
                "ID=" + Id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", data di nascita='" + dataNascita + '\'' +
                ", numero tessera='" + numeroTessera + '\'' +
                '}';

    }


}