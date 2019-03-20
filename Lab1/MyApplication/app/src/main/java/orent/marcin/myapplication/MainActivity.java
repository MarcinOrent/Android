package orent.marcin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Oblicz (View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);
        String value1 = String.valueOf(spinner3.getSelectedItem());
        String value2 = String.valueOf(spinner2.getSelectedItem());
        String operator = String.valueOf( spinner.getSelectedItem());
        Kalkulator kalkulator = new Kalkulator(value1, value2);
        String wynik = kalkulator.takeAction(operator);
        textView.setText(wynik);
    }

}

