package com.example.skiddportal.deliverydate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*dom();
        mom();
        yom();*/
        result();
    }
    /*public void dom() {
        EditText edt1 = (EditText) findViewById(R.id.editText1);
        edt1.setSelection(edt1.getText().length());
        int date;
        String datum = edt1.getText().toString();
        date = Integer.parseInt(datum);
    }
    public void mom(){
        EditText edt2 = (EditText) findViewById(R.id.editText2);
        edt2.setSelection(edt2.getText().length());
        int month;
        String monat = edt2.getText().toString();
        month = Integer.parseInt(monat);
    }
    public void yom(){
        EditText edt3 = (EditText) findViewById(R.id.editText3);
        edt3.setSelection(edt3.getText().length());
        int year;
        String jahr = edt3.getText().toString();
        year = Integer.parseInt(jahr);
    }*/
    public void result(){
        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edt1 = (EditText) findViewById(R.id.editText1);
                int date;
                String datum = edt1.getText().toString();
                date = Integer.parseInt(datum);
                TextView tv4 = (TextView) findViewById(R.id.textView4);

                EditText edt2 = (EditText) findViewById(R.id.editText2);
                int month;
                String monat = edt2.getText().toString();
                month = Integer.parseInt(monat);
                EditText edt3 = (EditText) findViewById(R.id.editText3);
                int year;
                String jahr = edt3.getText().toString();
                year = Integer.parseInt(jahr);
                int wk_cnt,wk=7,dlv_mnth,lmp_mnth;
                int yod;
                wk_cnt = date + wk;
                dlv_mnth = (month + 9) - 12;
                if(dlv_mnth < 0){
                    dlv_mnth = dlv_mnth * (-1);
                    dlv_mnth = 12 - dlv_mnth;
                }
                else{
                    dlv_mnth = (month + 9) - 12;
                }
                yod = year + 1;
                tv4.setText("Your pregnancy duration starts from "+wk_cnt+"."+month+"."+""+year+"\n"+" Your month of delivery is month "+dlv_mnth+"."
                        +"\n"+" Your date of delivery is "+wk_cnt+"."+dlv_mnth+"."+yod+".");

            }
        });
    }
}
