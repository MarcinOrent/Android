package orent.marcin.lab2;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }
        public void vill(View view) {

            Intent intent = new Intent(this, szesc.class);
            startActivity(intent);
        }
        public void vills(View view) {

            Intent intent  = new Intent(this, siedem.class);
            startActivity(intent);
/*
        String level = i.getStringExtra("level");
        String name = i.getStringExtra("name");
        String champ = i.getStringExtra("champ");

        String enterKey = System.getProperty("line.separator");
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Twój poziom: " + level + enterKey + "Twoja nazwa użytkownika: " + name + enterKey + "Twój ulubiony bohater: " + champ);

    }
    public void zmianaKoloru(View view) {
        Switch switchh = (Switch) findViewById(R.id.switch3);

        TextView kolor = (TextView) findViewById(R.id.textView);
        boolean on = switchh.isChecked();
        if (on) {
            kolor.setTextColor(Color.RED);
        } else {
            kolor.setTextColor(Color.BLACK);
        }
    }
*/}
    //public void powrot(View view) {
       // finish();
    }

