/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package piramidazatenis.controller;

import java.util.List;
import piramidazatenis.model.Igrac;
import piramidazatenis.util.OibValidation;
import piramidazatenis.util.PiramidaZaTenisException;

/**
 *
 * @author stjep
 */
public class ObradaIgrac extends Obrada<Igrac> {

    @Override
    public List<Igrac> read() {
       return session.createQuery("from Igrac a order by a.Ime").list();
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
