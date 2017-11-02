package com.softsolutions.theo.paymentssoft_as.login.repository;

import android.app.Activity;

/**
 * Created by theo on 01/11/17.
 */

public interface ILoginRepository {
    void signIn(String username, String password, Activity activity);
}
