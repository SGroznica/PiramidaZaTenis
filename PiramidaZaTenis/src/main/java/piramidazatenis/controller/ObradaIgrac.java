/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package piramidazatenis.controller;

import java.util.Arrays;
import java.util.List;
import piramidazatenis.model.Igrac;
import piramidazatenis.model.TennisMatch;
import piramidazatenis.util.OibValidation;
import piramidazatenis.util.PiramidaZaTenisException;

/**
 *
 * @author stjep
 */
public class ObradaIgrac extends Obrada<Igrac> {

   public List<TennisMatch> getMecevi(){
       return session.createQuery("from TennisMatch t where t.igrac1=:igrac or t.igrac2=:igrac "
               + " order by t.datumigranja desc")
               .setParameter("igrac", entitet)
               .setMaxResults(12)
               .list();
   }

    @Override
    public List<Igrac> read() {
       return session.createQuery("from Igrac").list();
    }

     public List<Igrac> read(String uvjet) {
        return session.createQuery("from Igrac p "
                + " where concat(p.ime,' ',p.prezime,' ',ifnull(p.oib,'')) "
                + " like :uvjet order by p.red")
                .setParameter("uvjet","%" + uvjet + "%")
                .setMaxResults(50)
                .list();
    }
     
     public List<Igrac> readPocetakPrezimena(String uvjet) {
      return session.createQuery("from Igrac p "
                + " where p.prezime "
                + " like :uvjet order by p.prezime, p.ime")
                .setParameter("uvjet", uvjet + "%")
                .setMaxResults(50)
                .list();
    }
    @Override
    protected void kontrolaCreate() throws PiramidaZaTenisException {
        kontrolaIme();
        kontrolaPrezime();
        kontrolaBrojMobitela();
        kontrolaOib();
    }

    @Override
    protected void kontrolaUpdate() throws PiramidaZaTenisException {
       kontrolaIme();
       kontrolaPrezime();
       kontrolaBrojMobitela();
       kontrolaOib();
    }

    @Override
    protected void kontrolaDelete() throws PiramidaZaTenisException {
       
    }
     
    private void kontrolaIme() throws PiramidaZaTenisException {
        if (!entitet.getIme().matches("\\p{L}+")) {
            throw new PiramidaZaTenisException("Ime ne smije sadržavati znakove!");
        }
    }

    private void kontrolaPrezime() throws PiramidaZaTenisException {
        if (!entitet.getPrezime().matches("\\p{L}+")) {
            throw new PiramidaZaTenisException("Prezime ne smije sadržavati znakove!");
        }
    }
    
    private void kontrolaBrojMobitela() throws PiramidaZaTenisException {
        if (!entitet.getBrojmobitela().matches("[0-9]{10}")) {
            throw new PiramidaZaTenisException("Broj mobitela smije sadržavati samo brojeve");
        }
    }
    
    private void kontrolaOib() throws PiramidaZaTenisException {
        //https://github.com/domagojpa/oib-validation
        if (!OibValidation.checkOIB(entitet.getOib())) {
            throw new PiramidaZaTenisException("OIB nije formalno ispravan");
        }
    }


  
}
