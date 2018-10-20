package com.rodrigoguerra.micalculadora.calculator.presenter;

import com.rodrigoguerra.micalculadora.calculator.interactor.CalculadoraInteractor;
import com.rodrigoguerra.micalculadora.calculator.interactor.CalculadoraInteractorImpl;
import com.rodrigoguerra.micalculadora.calculator.view.CalculadoraFragment;

public class CalculadoraPresenterImpl implements CalculadoraPresenter {

    private CalculadoraFragment calculadoraFragment;
    private CalculadoraInteractor interactor;

    public CalculadoraPresenterImpl(CalculadoraFragment calculadoraFragment) {
        this.calculadoraFragment = calculadoraFragment;
        interactor = new CalculadoraInteractorImpl(this);
    }

    @Override
    public void sumar(String number1, String number2) {
        interactor.sumar(number1, number2);

    }

    @Override
    public void showError(String error) {
        calculadoraFragment.showError(error);

    }

    @Override
    public void showResult(String result) {
        calculadoraFragment.showResult(result);

    }
}
