package com.softsolutions.theo.paymentssoft_as.login.presenter;

import android.app.Activity;

/**
 * Created by theo on 01/11/17.
 */

public interface ILoginPresenter {
    void signIn(String username, String password, Activity activity);// Interactor

    void loginSuccess();

    void loginError(String error);
}
