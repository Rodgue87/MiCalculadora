package com.rodrigoguerra.micalculadora.calculator.presenter;

public interface CalculadoraPresenter {

    void sumar(String number1, String number2);// pertenece al interactor
    void showError(String error);//vista
    void showResult(String result);//vista
}
