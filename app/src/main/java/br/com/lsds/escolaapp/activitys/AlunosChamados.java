package br.com.lsds.escolaapp.activitys;

import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

import br.com.lsds.escolaapp.R;
import br.com.lsds.escolaapp.adapters.AlunosAdapter;
import br.com.lsds.escolaapp.adapters.AlunosChamadosAdapter;
import br.com.lsds.escolaapp.models.Alunos;

public class AlunosChamados extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private RecyclerView          recyclerView;
    private AlunosChamadosAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alunos_chamados);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        FloatingActionButton btnAdd = (FloatingActionButton) findViewById(R.id.fab_inc_local);
        btnAdd.setVisibility(View.INVISIBLE);

        //Lista de alunos
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        ArrayList<Alunos> alunos = new ArrayList<>();
        alunos.add(new Alunos("Luiz Felipe"));
        alunos.add(new Alunos("Laura Monique"));
        alunos.add(new Alunos("Marta Cristina"));
        alunos.add(new Alunos("Matheus Luiz"));
        alunos.add(new Alunos("João da Silva"));

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new AlunosChamadosAdapter(this, alunos);
        recyclerView.setAdapter(adapter);

    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
