package orent.marcin.app2;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Activity3 extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        ArrayAdapter<Hero> listAdapter = new ArrayAdapter<Hero>(this, android.R.layout.simple_list_item_1, Hero.HEROES);
        ListView listVillain = getListView();
        listVillain.setAdapter(listAdapter);

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = new Intent(Activity3.this, Activity5.class);
        intent.putExtra(Activity5.EXTRA_HERO0, (int) id);
        startActivity(intent);
    }
}
