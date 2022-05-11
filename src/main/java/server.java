import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class server {
    public static void main(String[] args) {
        GsonBuilder builder=new GsonBuilder();
        Gson gson=builder.setPrettyPrinting().create();
        File file = new File("src/main/resources/postt");
        URL url;
            try (Writer writer=new FileWriter(file.getPath())){
                url = new URL("https://jsonplaceholder.typicode.com/posts?userId=2");
                URLConnection urlcon = url.openConnection();
                BufferedReader reader = new BufferedReader(new InputStreamReader(urlcon.getInputStream()));
//                String s = "";
//                while ((s = reader.readLine()) != null) {
//                    writer.write(s+"\n");
//                    System.out.println(s);
//                }
                post[] post_array=gson.fromJson(reader,post[].class);
                writer.write(gson.toJson(post_array));

               } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

