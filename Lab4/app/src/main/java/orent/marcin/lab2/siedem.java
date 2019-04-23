package orent.marcin.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class siedem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siedem);
        TextView textView = (TextView) findViewById(R.id.textView4);
        textView.setText("Twój villain to Loki");
        ImageView image;
        image = (ImageView) findViewById(R.id.imageView4);
        image.setImageResource(R.drawable.loki);
    }
}
