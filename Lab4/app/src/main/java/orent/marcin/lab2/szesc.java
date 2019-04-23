package orent.marcin.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class szesc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_szesc);
        TextView textView = (TextView) findViewById(R.id.textView3);
        textView.setText("Twój villain to Thanos");
        ImageView image;
        image = (ImageView) findViewById(R.id.imageView3);
        image.setImageResource(R.drawable.thanos);
    }
}
