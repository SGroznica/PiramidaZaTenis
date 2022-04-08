/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package piramidazatenis.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author stjep
 */

@Deprecated
@Entity
public class Red {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sifra;
    private String brojreda;
    @ManyToOne
    private Igrac igraci;

    public Long getSifra() {
        return sifra;
    }

    public void setSifra(Long sifra) {
        this.sifra = sifra;
    }

    public String getBrojreda() {
        return brojreda;
    }

    public void setBrojreda(String brojreda) {
        this.brojreda = brojreda;
    }

    public Igrac getIgraci() {
        return igraci;
    }

    public void setIgraci(Igrac igraci) {
        this.igraci = igraci;
    }

}
