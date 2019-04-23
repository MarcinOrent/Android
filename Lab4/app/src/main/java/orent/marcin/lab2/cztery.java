package orent.marcin.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class cztery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cztery);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Twój bohater to Thor");
        ImageView image;

        image = (ImageView) findViewById(R.id.imageView);
        image.setImageResource(R.drawable.thor);

    }

}
