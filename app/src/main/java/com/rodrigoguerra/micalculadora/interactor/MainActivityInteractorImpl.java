package com.rodrigoguerra.micalculadora.interactor;

import com.rodrigoguerra.micalculadora.presenter.MainActivityPresenter;

public class MainActivityInteractorImpl implements MainActivityInteractor{

    private MainActivityPresenter presenter;

    public MainActivityInteractorImpl(MainActivityPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void sumar(String number1, String number2) {
        //Double resultado = Double.valueOf(number1) + Double.valueOf(number2);
        //presenter.showResult(String.valueOf(resultado));
        //presenter.showError(e);
        try{
            Double resultado = Double.valueOf(number1) + Double.valueOf(number2);
            presenter.showResult(String.valueOf(resultado));
        }catch (Exception e){
            presenter.showError("Error en formato de numero: " + e.toString());//.showResult("Error en formato de numero: " + e.toString());
        }
    }
}
