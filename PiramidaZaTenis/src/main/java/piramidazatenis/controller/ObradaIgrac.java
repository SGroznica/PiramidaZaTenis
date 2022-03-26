/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package piramidazatenis.controller;

import java.util.List;
import piramidazatenis.model.Igrac;
import piramidazatenis.util.PiramidaZaTenisException;

/**
 *
 * @author stjep
 */
public class ObradaIgrac extends Obrada<Igrac> {

    @Override
    public List<Igrac> read() {
       return session.createQuery("from Igrac").list();
    }

     public List<Igrac> read(String uvjet) {
        return session.createQuery("from Igrac p "
                + " where concat(p.ime,' ',p.prezime,' ',ifnull(p.oib,'')) "
                + " like :uvjet order by p.prezime, p.ime")
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
        
    }

    @Override
    protected void kontrolaUpdate() throws PiramidaZaTenisException {
       
    }

    @Override
    protected void kontrolaDelete() throws PiramidaZaTenisException {
       
    }

    

   

  
}
