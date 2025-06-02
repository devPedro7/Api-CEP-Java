import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import com.google.gson.Gson;

public class ConsultaCep {
    

    public Endereco buscaEndereco(int cep){
        try {
            String endereco = "https://viacep.com.br/ws/" + cep + "/json/";
    
            URL url = new URL(endereco);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
    
            int status = con.getResponseCode();
            if (status != 200) {
                System.out.println("Erro na consulta: " + status);
                return null;
            }
    
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), StandardCharsets.UTF_8));
            String inputLine;
            StringBuilder content = new StringBuilder();
    
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
    
            in.close();
            con.disconnect();
    
            String json = content.toString();
            Gson gson = new Gson();
    
            Endereco enderecoObj = gson.fromJson(json, Endereco.class);
            return enderecoObj;
    
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

