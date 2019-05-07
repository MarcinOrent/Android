package orent.marcin.app2;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Activity2 extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        ArrayAdapter<Villain> listAdapter = new ArrayAdapter<Villain>(this, android.R.layout.simple_list_item_1, Villain.VILLAINS);
        ListView listVillain = getListView();
        listVillain.setAdapter(listAdapter);


    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = new Intent(Activity2.this, Activity4.class);
        intent.putExtra(Activity4.EXTRA_VILLAINS0, (int) id);
        startActivity(intent);
    }

}
