package Objetos;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Tweet {

    private String autor;
    private String tweet;
    private String fecha;

    Tweet(String autor, String tweet){
        this.autor = autor;
        this.tweet = tweet;
    }

    public void publicarTweet(){
        String fecha_actual = new SimpleDateFormat("dd-MM- yyyy", Locale.getDefault()).format(new Date());
        this.fecha = fecha_actual;
    }

}
