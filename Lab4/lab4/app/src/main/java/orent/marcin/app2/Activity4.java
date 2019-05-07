package orent.marcin.app2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {


    public static final String EXTRA_VILLAINS0 = " ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);


        int villains0 = (Integer) getIntent().getExtras().get(EXTRA_VILLAINS0);
        Villain villain = Villain.VILLAINS[villains0];
        TextView name = (TextView) findViewById(R.id.textView2);
        name.setText(villain.getName());

        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(villain.getImgRes());
        photo.setContentDescription(villain.getName());


    }


}
