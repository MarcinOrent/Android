package orent.marcin.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class piec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piec);
        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText("Twój bohater to IronMan");
        ImageView image;
        image = (ImageView) findViewById(R.id.imageView2);
        image.setImageResource(R.drawable.ironman);
    }
}
