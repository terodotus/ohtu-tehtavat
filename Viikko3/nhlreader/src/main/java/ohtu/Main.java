
package ohtu;

import java.io.IOException;
import org.apache.http.client.fluent.Request;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        String url = "https://nhlstatisticsforohtu.herokuapp.com/players";
        
        String bodyText = Request.Get(url).execute().returnContent().asString();
                
        System.out.println("json-muotoinen data:");
        System.out.println( bodyText );

        Gson mapper = new Gson();
        Player[] players = mapper.fromJson(bodyText, Player[].class);
        for (Player player : players) {
            player.laskePisteet();
        }
        
        System.out.println("Oliot:");
        ArrayList<Player>tulostettavat = new ArrayList();
        for (Player player : players) {
            if(player.getNationality().equals("FIN")){
                tulostettavat.add(player);
            }  
        }
        Collections.sort(tulostettavat);
        for (int i=(tulostettavat.size()-1);i>=0;i--) {
            System.out.println(tulostettavat.get(i));
        }
    }
  
}