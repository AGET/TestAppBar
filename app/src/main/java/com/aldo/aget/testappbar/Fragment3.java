package com.aldo.aget.testappbar;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link net.sgoliver.android.toolbartabs.Fragment1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment3 extends Fragment {

    public static Fragment3 newInstance() {
        Fragment3 fragment = new Fragment3();
        return fragment;
    }

    public Fragment3() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_3, container, false);
    }


    @Override
    public void onActivityCreated(Bundle state) {
        super.onActivityCreated(state);

        //Toolbar Tarjeta
        Toolbar tbCard = (Toolbar) getView().findViewById(R.id.TbCard);
        tbCard.setTitle("Toolbar card");

        tbCard.setOnMenuItemClickListener(
                new Toolbar.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

                        switch (item.getItemId()) {
                            case R.id.action_1:
                                Toast.makeText(getContext(), "\"Acción Tarjeta 1\"", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.action_2:
                                Toast.makeText(getContext(), "\"Acción Tarjeta 2\"", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.action_nuevo:
                                Toast.makeText(getContext(), "\"Acción Tarjeta Nuevo!\"", Toast.LENGTH_SHORT).show();
                                return true;
                            case R.id.action_buscar:
                                Toast.makeText(getContext(), "\"Acción Tarjeta Buscar!\"", Toast.LENGTH_SHORT).show();
                                return true;
                        }

                        return true;
                    }
                });

        tbCard.inflateMenu(R.menu.menu_tarjeta);

    }


}
