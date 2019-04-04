package com.example.navigationtabs;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabsContenedor extends Fragment {


    public TabsContenedor() { }

    TabLayout tabLayout;
    ViewPager viewPager;
    TabsAdaptador adaptador;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tabs_contenedor, container, false);

        tabLayout = view.findViewById(R.id.tabs);
        viewPager = view.findViewById(R.id.pager);
        adaptador = new TabsAdaptador(getFragmentManager());

        viewPager.setAdapter(adaptador);
        tabLayout.setupWithViewPager(viewPager);

        return view;
    }

    private class TabsAdaptador extends FragmentStatePagerAdapter{

        private String[] titulos = {"Akali","Ahri","Kai'Sa"};

        public TabsAdaptador(FragmentManager fm) {
            super(fm);
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return titulos[position];
        }

        @Override
        public Fragment getItem(int position) {
            Detalle detalle = new Detalle();
            Bundle bundle = new Bundle();
            bundle.putInt("posicion", position);
            detalle.setArguments(bundle);
            return detalle;
        }

        @Override
        public int getCount() {
            return 3;
        }
    }

}
