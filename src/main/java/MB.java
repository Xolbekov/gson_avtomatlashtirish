import javax.annotation.Generated;
import javax.swing.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import lombok.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class MB {

    @SerializedName("Ccy")
    private String mCcy;
    @SerializedName("CcyNm_EN")
    private String mCcyNmEN;
    @SerializedName("CcyNm_RU")
    private String mCcyNmRU;
    @SerializedName("CcyNm_UZ")
    private String mCcyNmUZ;
    @SerializedName("CcyNm_UZC")
    private String mCcyNmUZC;
    @SerializedName("Code")
    private String mCode;
    @SerializedName("Date")
    private String mDate;
    @SerializedName("Diff")
    private String mDiff;
    @SerializedName("id")
    private Long mId;
    @SerializedName("Nominal")
    private String mNominal;
    @SerializedName("Rate")
    private String mRate;

    public String getCcy() {
        return mCcy;
    }

    public void setCcy(String ccy) {
        mCcy = ccy;
    }

    public String getCcyNmEN() {
        return mCcyNmEN;
    }

    public void setCcyNmEN(String ccyNmEN) {
        mCcyNmEN = ccyNmEN;
    }

    public String getCcyNmRU() {
        return mCcyNmRU;
    }

    public void setCcyNmRU(String ccyNmRU) {
        mCcyNmRU = ccyNmRU;
    }

    public String getCcyNmUZ() {
        return mCcyNmUZ;
    }

    public void setCcyNmUZ(String ccyNmUZ) {
        mCcyNmUZ = ccyNmUZ;
    }

    public String getCcyNmUZC() {
        return mCcyNmUZC;
    }

    public void setCcyNmUZC(String ccyNmUZC) {
        mCcyNmUZC = ccyNmUZC;
    }

    public String getCode() {
        return mCode;
    }

    public void setCode(String code) {
        mCode = code;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public String getDiff() {
        return mDiff;
    }

    public void setDiff(String diff) {
        mDiff = diff;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public String getNominal() {
        return mNominal;
    }

    public void setNominal(String nominal) {
        mNominal = nominal;
    }

    public String getRate() {
        return mRate;
    }

    public void setRate(String rate) {
        mRate = rate;
    }

    public static void main(String[] args) {

      JFrame ramka=new JFrame();
      ramka.setVisible(true);
      ramka.setLayout(null);
      ramka.setSize(ramka.getMaximumSize());
      ramka.setTitle("Convertor");

      JLabel text=new JLabel();
      JTextField a1=new JTextField();
      JTextField a2=new JTextField();
      JLabel a1_text=new JLabel();
      JLabel a2_text=new JLabel();
      JButton tozalash=new JButton();

      ramka.add(text);
      ramka.add(a1);
      ramka.add(a1_text);
      ramka.add(a2);
      ramka.add(a2_text);
      ramka.add(tozalash);

      text.setText("C O N V E N T O R");
      text.setBounds(310,50,500,50);
      text.setFont(new Font("sans serif",Font.BOLD,35));
      text.setForeground(Color.BLUE);

      a1_text.setText("So'm");
      a1_text.setBounds(310,165,220,40);
      a1_text.setFont(new Font("sans serif",Font.BOLD,25));
      a1_text.setForeground(Color.BLACK);

        a2_text.setText("USD");
        a2_text.setBounds(310,230,220,40);
        a2_text.setFont(new Font("sans serif",Font.BOLD,25));
        a2_text.setForeground(Color.BLACK);

        JButton tasdiqlash=new JButton();
        ramka.add(tasdiqlash);



        tozalash.setText("Tozalash");
        tozalash.setBounds(400,330,200,40);
        tozalash.setFont(new Font("sans serif",Font.BOLD,18));
        tozalash.setBackground(Color.BLUE);
        tozalash.setForeground(Color.white);
        tozalash.setFocusable(false);
        tozalash.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a1.setText("");
                a2.setText("");
            }
        });
         //
        a2.setBounds(400,230,200,40);
        a2.setFont(new Font("sans serif",Font.BOLD,20));

        a1.setBounds(400,170,200,40);
        a1.setFont(new Font("sans serif",Font.BOLD,20));
        ///
        tasdiqlash.setText("Almashtirish");
        tasdiqlash.setBounds(400,285,200,40);
        tasdiqlash.setFont(new Font("sans serif",Font.BOLD,18));
        tasdiqlash.setBackground(Color.BLUE);
        tasdiqlash.setForeground(Color.white);
        tasdiqlash.setFocusable(false);
        tasdiqlash.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        Gson gson=new GsonBuilder().setPrettyPrinting().create();
        try {

            URL url=new URL("https://cbu.uz/oz/arkhiv-kursov-valyut/json/USD/2022-09-01/");
            URLConnection urlcon=url.openConnection();
            BufferedReader reader=new BufferedReader(new InputStreamReader(urlcon.getInputStream()));
            Type type=new TypeToken<ArrayList<MB>>(){}.getType();
            ArrayList<MB> mbs=gson.fromJson(reader,type);
            mbs.forEach(mb ->{
//              if (!mb.getDiff().contains("-")){
//                System.out.println(mb);
//                }
                if(!a1.getText().equals("")){
                    a2.setText( String.valueOf(Double.parseDouble(a1.getText())/Double.parseDouble(mb.getMRate())));

                }
                else if (!a2.getText().equals("")){
                    a1.setText( String.valueOf(Double.parseDouble(mb.getMRate())*Integer.parseInt(a2.getText())));
                }
//              a1.setText( String.valueOf(Double.parseDouble(mb.getMRate())*Integer.parseInt(a2.getText())));
//              a2.setText(mb.getMRate());
            });
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (IOException ey) {
            ey.printStackTrace();
        }
            }
        });
        ///

    }
}
