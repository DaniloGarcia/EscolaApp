package br.com.lsds.escolaapp.activitys;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.Arrays;

import br.com.lsds.escolaapp.R;
import br.com.lsds.escolaapp.util.ActivityHomeAsUpEnabled;

public class PesqLocalActivity extends ActivityHomeAsUpEnabled {

    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesq_local);
        ListView lv_locais = (ListView) findViewById(R.id.lv_locais);
        ArrayList<String> arrayLocais = new ArrayList<>();
        arrayLocais.addAll(Arrays.asList(getResources().getStringArray(R.array.array_locais)));

        adapter = new ArrayAdapter<String>(PesqLocalActivity.this,android.R.layout.simple_list_item_1,arrayLocais);
        lv_locais.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_search,menu);
        MenuItem item = menu.findItem(R.id.menuSearch);
        SearchView searchView = (SearchView)item.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });



        return super.onCreateOptionsMenu(menu);
    }
}
