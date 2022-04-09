/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package piramidazatenis.controller;

import java.util.List;
import piramidazatenis.model.Igrac;
import piramidazatenis.model.TennisMatch;
import piramidazatenis.util.PiramidaZaTenisException;

/**
 *
 * @author stjep
 */
public class ObradaTennisMatch extends Obrada<TennisMatch> {

    @Override
    public List<TennisMatch> read() {
        return session.createQuery("from TennisMatch").list();
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
