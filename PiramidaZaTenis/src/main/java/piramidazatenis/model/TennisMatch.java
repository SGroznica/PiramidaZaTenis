/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package piramidazatenis.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author stjep
 */
@Entity
public class TennisMatch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sifra;
    
    @OneToOne
    private Igrac igrac1;
    @OneToOne
    private Igrac igrac2;
    private Date datumigranja;
    private String teren;
    private String rezultat;
    private String pobjednik;

    public Long getSifra() {
        return sifra;
    }

    public void setSifra(Long sifra) {
        this.sifra = sifra;
    }

    public Igrac getIgrac1() {
        return igrac1;
    }

    public void setIgrac1(Igrac igrac1) {
        this.igrac1 = igrac1;
    }

    public Igrac getIgrac2() {
        return igrac2;
    }

    public void setIgrac2(Igrac igrac2) {
        this.igrac2 = igrac2;
    }

    
    
    public Date getDatumigranja() {
        return datumigranja;
    }

    public void setDatumigranja(Date datumigranja) {
        this.datumigranja = datumigranja;
    }

    public String getTeren() {
        return teren;
    }

    public void setTeren(String teren) {
        this.teren = teren;
    }

    public String getRezultat() {
        return rezultat;
    }

    public void setRezultat(String rezultat) {
        this.rezultat = rezultat;
    }

    public String getPobjednik() {
        return pobjednik;
    }

    public void setPobjednik(String pobjednik) {
        this.pobjednik = pobjednik;
    }

    

  

}
