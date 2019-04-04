package com.example.navigationtabs;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    NavigationView navigationView;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigationView = findViewById(R.id.navigation_view);
        drawerLayout = findViewById(R.id.drawer_layout);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                drawerLayout.closeDrawers();

                switch (menuItem.getItemId()) {
                    case R.id.navigation_informacion:
                        Informacion informacion = new Informacion();
                        getSupportFragmentManager().beginTransaction().replace(R.id.layout_contenido, informacion).commit();
                        break;

                    case R.id.navigation_cerrar:
                        finish();
                        break;

                    case R.id.navigation_tabs:
                        TabsContenedor contenedor = new TabsContenedor();
                        getSupportFragmentManager().beginTransaction().replace(R.id.layout_contenido, contenedor).commit();
                }

                return true;
            }
        });

        TabsContenedor tabsContenedor = new TabsContenedor();
        getSupportFragmentManager().beginTransaction().replace(R.id.layout_contenido, tabsContenedor).commit();

    }
}
