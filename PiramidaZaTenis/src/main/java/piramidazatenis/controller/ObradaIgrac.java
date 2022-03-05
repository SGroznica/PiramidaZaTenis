/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package piramidazatenis.controller;

import piramidazatenis.model.Igrac;
import piramidazatenis.util.OibValidation;
import piramidazatenis.util.PiramidaZaTenisException;

/**
 *
 * @author stjep
 */
public abstract class ObradaIgrac<T extends Igrac> extends Obrada<T>{
    
   @Override
    protected void kontrolaCreate() throws PiramidaZaTenisException {
        kontrolaOib();
        kontrolaBrojMobitela();
    }

    @Override
    protected void kontrolaUpdate() throws PiramidaZaTenisException {

    }

    @Override
    protected void kontrolaDelete() throws PiramidaZaTenisException {

    } 

    private void kontrolaOib() throws PiramidaZaTenisException {
        if (!OibValidation.checkOIB(entitet.getOib())) {
            throw new PiramidaZaTenisException("OIB nije formalno ispravan");
        }
    }

    private void kontrolaBrojMobitela() {
        
       
    }
}
