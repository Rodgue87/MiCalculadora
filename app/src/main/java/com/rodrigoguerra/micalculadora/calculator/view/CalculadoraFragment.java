package com.rodrigoguerra.micalculadora.calculator.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.rodrigoguerra.micalculadora.R;
import com.rodrigoguerra.micalculadora.calculator.presenter.CalculadoraPresenterImpl;

/**
 * A simple {@link Fragment} subclass.
 */
public class CalculadoraFragment extends Fragment implements CalculadoraFragmentView {

    private EditText edtNumber1;
    private EditText edtNumber2;
    private Button addButton;
    private TextView txtresult;
    private CalculadoraPresenterImpl presenter;


    public CalculadoraFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        final View view = inflater.inflate(R.layout.fragment_calculadora, container, false);

        edtNumber1 = (EditText) view.findViewById(R.id.edtNumber1fragment);
        edtNumber2 = (EditText) view.findViewById(R.id.edtNumber2fragment);
        addButton = (Button) view.findViewById(R.id.addbutton);
        txtresult = (TextView) view.findViewById(R.id.tvResultfregment);

        presenter = new CalculadoraPresenterImpl(this);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suma(v);
            }
        });

        return view;
    }

    public void suma(View view){
        String number1 = edtNumber1.getText().toString();
        String number2 = edtNumber2.getText().toString();
        presenter.sumar(number1, number2);

    }

    @Override
    public void showResult(String result) {
        txtresult.setText(result);
    }

    @Override
    public void showError(String error) {
        txtresult.setText(error);
    }
}
