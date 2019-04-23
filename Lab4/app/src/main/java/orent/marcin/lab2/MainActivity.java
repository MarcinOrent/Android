package orent.marcin.lab2;

import android.content.Intent;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.Toolbar;


public class MainActivity extends AppCompatActivity {


    public String name;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView image;
        image = (ImageView) findViewById(R.id.imageView5);
        image.setImageResource(R.drawable.marvel);

    }

        public void secondActivity(View view){
            Intent i = new Intent(this, SecondActivity.class);
                       startActivity(i);


        }
    public void trzecia(View view){
        Intent i = new Intent(this, ThirdActivity.class);
        startActivity(i);


    }
    }

