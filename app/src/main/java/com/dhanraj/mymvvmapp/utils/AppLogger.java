package com.dhanraj.mymvvmapp.utils;

import java.util.Objects;

import timber.log.Timber;

import static com.dhanraj.mymvvmapp.utils.AppConstants.DEBUG_APP;

public class AppLogger {

    private AppLogger() {
    }

    public static void init() {
        if (DEBUG_APP) {
            Timber.plant(new Timber.DebugTree());
        }
    }

    public static void d(String s, Objects... objects) {
        Timber.d(s, objects);
    }

    public static void e(String s, Objects... objects) {
        Timber.e(s, objects);
    }

    public static void e(Throwable t, String s, Objects... objects) {
        Timber.e(t, s, objects);
    }

    public static void i(String s, Objects... objects) {
        Timber.i(s, objects);
    }

    public static void i(Throwable t, String s, Objects... objects) {
        Timber.i(t, s, objects);
    }

    public static void w(String s, Objects... objects) {
        Timber.w(s, objects);
    }

    public static void w(Throwable t, String s, Objects... objects) {
        Timber.w(t, s, objects);
    }
}
