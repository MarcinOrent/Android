package orent.marcin.lab2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }

    public void pola(View view) {
        EditText editText3 = (EditText) findViewById(R.id.editText3);
        EditText editText2 = (EditText) findViewById(R.id.editText2); //deklaruje pola
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);

        //wyciagam wartosci
        String name = String.valueOf(editText3.getText());
        String level = String.valueOf(editText2.getText());
        String champ = String.valueOf(spinner2.getSelectedItem());

        //przechodze do 3
        Intent intent = new Intent(this, ThirdActivity.class);
        intent.putExtra("name", name);
        intent.putExtra("level", level);
        intent.putExtra("champ", champ);
        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox2);
        if (checkBox.isChecked()) {
            checkBox.setChecked(true);
            checkBox.setTextColor(Color.BLACK);
            startActivity(intent);

        } else {
            checkBox.setTextColor(Color.RED);
            Toast.makeText(SecondActivity.this,
                    "Musisz zaakceptować regulamin", Toast.LENGTH_SHORT).show();
        }




    }


}






