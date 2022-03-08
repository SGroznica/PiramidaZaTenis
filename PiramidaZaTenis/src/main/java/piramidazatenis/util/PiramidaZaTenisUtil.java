/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package piramidazatenis.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import us.codecraft.xsoup.Xsoup;

/**
 *
 * @author stjep
 */
public class PiramidaZaTenisUtil {
    
    public static String operater="admin";
    public static final String NAZIV_APP="Piramida za tenis";
    
    public static String getNaslov(String naslov){
        if(operater==null){
            return PiramidaZaTenisUtil.NAZIV_APP + " " + naslov;
        }
        return PiramidaZaTenisUtil.NAZIV_APP + " " + naslov + " " + operater;
    }
    
    public static String generirajOib(){
        try {
            URL url = new URL("http://oib.itcentrala.com/oib-generator/");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            url.openStream()));
            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                sb.append(inputLine);
            }
            in.close();
            Document d = Jsoup.parse(sb.toString());
            return Xsoup.compile("/html/body/div[1]/div[1]/text()").evaluate(d).get();
        } catch (Exception e) {
        }
        return "";
        
    }
    
}
