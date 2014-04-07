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
            gcm.SendMSG("fdgadgas-ae8ssafsjekjri4522345234423q-4wetayu43n25q4wa0se985r132qp4jtwaesd583we-cyjT2rh5_ZZhAM3Y8", "MENSAGEM!");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(GCM_PROJETO_INTEGRACAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
