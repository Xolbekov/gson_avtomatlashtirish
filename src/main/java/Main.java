import com.google.gson.Gson;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File f=new File("src\\main\\resources\\komp");
        try {
            BufferedReader oqish=new BufferedReader(new FileReader(f));
            String s="";
//            while ((s=reader.readLine())!=null)
//            {
//                System.out.println(s);
//            }
            Gson g=new Gson();
            kompyuter k=g.fromJson(oqish,kompyuter.class);
            System.out.println(k.getNomi());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}