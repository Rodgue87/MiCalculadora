package com.rodrigoguerra.micalculadora.calculator.interactor;

import com.rodrigoguerra.micalculadora.calculator.presenter.CalculadoraPresenter;

public class CalculadoraInteractorImpl implements CalculadoraInteractor {

    private CalculadoraPresenter presenter;

    public CalculadoraInteractorImpl(CalculadoraPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void sumar(String number1, String number2) {
        try{
            Double resultado = Double.valueOf(number1) + Double.valueOf(number2);
            presenter.showResult(String.valueOf(resultado));
        }catch (Exception e){
            presenter.showError("Error en formato de numero: " + e.toString());//.showResult("Error en formato de numero: " + e.toString());
        }
    }
}
