package com.raywenderlich.android.deezfoodz.dagger;

import com.raywenderlich.android.deezfoodz.ui.foodz.FoodzActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ctelescu on 6/28/2017.
 */

@Singleton
@Component(modules = {AppModule.class, PresenterModule.class})
public interface AppComponent {
    void inject(FoodzActivity target);
}
