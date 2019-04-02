package orent.marcin.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Intent i = getIntent();

        String level = i.getStringExtra("level");
        String name = i.getStringExtra("name");
        String champ = i.getStringExtra("champ");

        String enterKey = System.getProperty("line.separator");
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(level + enterKey + name + enterKey + champ);
        
    }
}
