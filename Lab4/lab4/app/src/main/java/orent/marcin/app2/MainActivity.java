package orent.marcin.app2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AdapterView.OnItemClickListener item = new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> listView, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(MainActivity.this, Activity2.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent intent1 = new Intent(MainActivity.this, Activity3.class);
                    startActivity(intent1);
                }
            }
        };
        ListView listView = (ListView) findViewById(R.id.lista);
        listView.setOnItemClickListener(item);
    }


}
