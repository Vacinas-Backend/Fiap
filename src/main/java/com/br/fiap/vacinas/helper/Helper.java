package com.br.fiap.vacinas.helper;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

public class Helper {
    public static String executePost(String targetURL, JSONObject urlBody) {
        HttpURLConnection connection = null;
        try {

            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            HttpEntity<String> request =
                    new HttpEntity<String>(urlBody.toString(), headers);

            String personResultAsJsonStr =
                    restTemplate.postForObject(targetURL, request, String.class);
            System.out.println("OLOCO" + personResultAsJsonStr);

            return personResultAsJsonStr;

//            URL url = new URL(targetURL);
//            connection = (HttpURLConnection) url.openConnection();
//            connection.setRequestMethod("POST");
//            connection.setRequestProperty("Content-Type",
//                    "application/json; utf-8");
//
//            connection.setRequestProperty("Accept", "application/json");
//
//            connection.setUseCaches(false);
//            connection.setDoOutput(true);
//            System.out.println("CONECTO");
//
////            String jsonInputString = urlBody;
//
//            //Send request
//            DataOutputStream wr = new DataOutputStream (
//                    connection.getOutputStream());
//            wr.close();
//
//            InputStream is = connection.getInputStream();
//            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
//            StringBuilder response = new StringBuilder();
//            String line;
//            while ((line = rd.readLine()) != null) {
//                response.append(line);
//                response.append('\r');
//            }
//            rd.close();
//
//            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
}
