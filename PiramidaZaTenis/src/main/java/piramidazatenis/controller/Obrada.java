/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package piramidazatenis.controller;

import java.util.List;
import org.hibernate.Session;
import piramidazatenis.util.HibernateUtil;
import piramidazatenis.util.PiramidaZaTenisException;

/**
 *
 * @author stjep
 */
public abstract class Obrada<T> {

    protected Session session;
    protected T entitet;

    public abstract List<T> read();

    protected abstract void kontrolaCreate() throws PiramidaZaTenisException;

    protected abstract void kontrolaUpdate() throws PiramidaZaTenisException;

    protected abstract void kontrolaDelete() throws PiramidaZaTenisException;

    public Obrada() {
        session = HibernateUtil.getSession();
    }

    public T create() throws PiramidaZaTenisException {
        kontrolaCreate();
        save();
        return entitet;

    }

    public T update() throws PiramidaZaTenisException {
        kontrolaUpdate();
        save();
        return entitet;

    }

    
    public void delete() throws PiramidaZaTenisException{
        kontrolaDelete();
        session.beginTransaction();
        session.delete(entitet);
        session.getTransaction().commit();
    }
    
    
    private void save() {
        session.beginTransaction();
        session.save(entitet);
        session.getTransaction().commit();
    }

    public T getEntitet() {
        return entitet;
    }

    public void setEntitet(T entitet) {
        this.entitet = entitet;
    }
    
    

}
