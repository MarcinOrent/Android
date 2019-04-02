package orent.marcin.lab2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
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
        startActivity(intent);



       /*  Switch switch2 = (Switch) findViewById(R.id.switch2);
        switch2.setTextOn("On");
        switch2.setTextOff("Off");


       boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.checkBox2:
                if (checked)
                    Toast.makeText(SecondActivity.this,
                            "Czy to dziala?", Toast.LENGTH_LONG).show();


        } */


    }
}
/*   final CheckB
            });ox checkbox = (CheckBox) findViewById(R.id.box);
            checkbox.setOnClickListener(new OnClickListener() {
                public void onClick(View v) {
                    // Perform action on clicks, depending on whether it's now checked
                    if (((CheckBox) v).isChecked()) {
                       ?????????????
                    } else {
                       ???????????
                    }
                }


In your layout xml file add

android:visibility="gone"
to the View that have to be hidden at startup.

Then in your code:

myHiddenView.setVisibility(View.VISIBLE);
to make it visible.*/

