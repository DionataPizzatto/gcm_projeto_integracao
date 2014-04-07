/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gcm_projeto_integracao;

import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dionata.cintra
 */
public class GCM_PROJETO_INTEGRACAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GCM gcm;
        gcm = new GCM();
        try {
            gcm.SendMSG("APA91bHn2NKIToOqNYMomoiauixom0O3mrhF6a95G2jIDx1UI8iNWGt1qyisJaltJPezk50zE5LRj7wxa31lt-cyjTe3VXcCDo1CVm0jTNuwVfUOBBaRdgdnwJ62g02gSlZf7UGUEYKoxbcO1JtwPs5UR8Xkmq8ES6zeb9Siff2rh5_ZZhAM3Y8", "MENSAGEM!");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(GCM_PROJETO_INTEGRACAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
