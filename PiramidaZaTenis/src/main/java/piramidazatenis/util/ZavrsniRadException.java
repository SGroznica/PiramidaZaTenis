/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package piramidazatenis.util;

/**
 *
 * @author stjep
 */
public class ZavrsniRadException extends Exception {

    private String poruka;

    public ZavrsniRadException(String poruka) {
        super();
        this.poruka = poruka;
    }

    public String getPoruka() {
        return poruka;
    }

}
