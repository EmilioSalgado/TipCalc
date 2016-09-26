package com.emilio.tipcalc;

import android.app.Application;
/**
 * Created by emilio on 26/09/16.
 */
public class TipCalcApp extends Application{
    private final static String ABOUT_URL = "https://github.com/EmilioSalgado";

    public String getAboutUrl(){
        return ABOUT_URL;
    }
}
