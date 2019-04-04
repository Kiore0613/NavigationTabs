package com.example.navigationtabs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class Detalle extends Fragment {

    private int posicion;
    TextView nombre, descripcion;
    ImageView imagen;

    public Detalle() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detalle, container, false);

        nombre = view.findViewById(R.id.detalle_nombre);
        descripcion = view.findViewById(R.id.detalle_descripcion);
        imagen = view.findViewById(R.id.detalle_imagen);


        posicion = getArguments().getInt("posicion");

        switch (posicion){
            case 0:
                nombre.setText("Akali");
                descripcion.setText("tras renunciar a la Orden Kinkou y a su título como el Puño de la Sombra, Akali pelea sola, lista para ser el arma letal que su pueblo necesita. Aunque conserva todo lo que aprendió de su maestro Shen, juró defender a Jonia de sus enemigos, una muerte a la vez.");
                imagen.setImageResource(R.drawable.akali);
                break;
            case 1:
                nombre.setText("Ahri");
                descripcion.setText("Conectada de forma innata con el poder latente de Runaterra, es una vastaya que puede moldear la magia en forma de orbes de energía pura. Se divierte manipulando las emociones de su presa antes de devorar su esencia vital.");
                imagen.setImageResource(R.drawable.ahri);
                break;
            case 2:
                nombre.setText("Kai'Sa");
                descripcion.setText("Reclamada por el Vacío cuando era tan solo una niña, Kai'Sa ha logrado sobrevivir únicamente gracias a su tenacidad y fuerza de voluntad. Sus experiencias la han convertido en una cazadora letal y, para algunos, en la precursora de un futuro que preferirían no llegar a ver.");
                imagen.setImageResource(R.drawable.kaisa);
                break;
        }

        return view;
    }

}
