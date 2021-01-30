package com.domain.Nebula.utils;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import com.domain.Nebula.Configs;



public class UIUtils {

    public static Context getAppContext() {
        return Configs.getInstance().getApplicationContext();
    }

    public static int getDimension(@DimenRes int resId) {
        return (int) getAppContext().getResources().getDimension(resId);
    }

    public static int getColor(@ColorRes int resId) {
        return ContextCompat.getColor(getAppContext(), resId);
    }

    public static String getString(@StringRes int resId) {
        return getAppContext().getString(resId);
    }

    public static void hideKeyboard(View view) {
        InputMethodManager imm = (InputMethodManager) getAppContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        assert imm != null;
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void hideKeyboard(Activity activity) {
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            return;
        }
        hideKeyboard(currentFocus);
    }
}
