package orent.marcin.app2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity5 extends AppCompatActivity {

    public static final String EXTRA_HERO0 = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
        int herro0 = (Integer) getIntent().getExtras().get(EXTRA_HERO0);
        Hero hero = Hero.HEROES[herro0];

        TextView name = (TextView) findViewById(R.id.textView);
        name.setText(hero.getName());


        ImageView photo = (ImageView) findViewById(R.id.photo1);
        photo.setImageResource(hero.getImgRes());
        photo.setContentDescription(hero.getName());


    }
}
