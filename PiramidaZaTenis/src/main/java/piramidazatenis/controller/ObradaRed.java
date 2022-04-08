/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package piramidazatenis.controller;

import java.util.List;
import piramidazatenis.model.Red;
import piramidazatenis.util.PiramidaZaTenisException;

/**
 *
 * @author stjep
 */
@Deprecated
public class ObradaRed extends Obrada<Red>{

    @Override
    public List<Red> read() {
        return session.createQuery("from Red").list();
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
