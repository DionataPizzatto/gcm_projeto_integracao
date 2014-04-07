/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gcm_projeto_integracao;

/**
 *
 * @author dionata.cintra
 */

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

public class GCM {

    final String uRL = "https://android.googleapis.com/gcm/send";
    final String chave = "AIzaSyA1dWaucskolpmntOeQ18Wyt2s8Ngrmhnw";

    public void SendMSG(String registrationID, String mensagem) throws UnsupportedEncodingException {
        CloseableHttpClient client = HttpClients.createDefault();

        List<NameValuePair> list = new ArrayList<NameValuePair>();
        list.add(new BasicNameValuePair("registration_id", registrationID));
        list.add(new BasicNameValuePair("data.price", mensagem));

        HttpPost httpPost = new HttpPost(uRL);
        httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
        httpPost.setHeader("Authorization", "key=" + chave);

        httpPost.setEntity(new UrlEncodedFormEntity(list));
        try {
            client.execute(httpPost);
        } catch (IOException ex) {
            Logger.getLogger(GCM.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

