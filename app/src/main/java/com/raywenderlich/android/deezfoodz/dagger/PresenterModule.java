package com.raywenderlich.android.deezfoodz.dagger;

import com.raywenderlich.android.deezfoodz.ui.foodz.FoodzPresenter;
import com.raywenderlich.android.deezfoodz.ui.foodz.FoodzPresenterImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ctelescu on 6/28/2017.
 */

@Module
public class PresenterModule {
    @Provides
    @Singleton
    FoodzPresenter provideFoodzPresenter() {
        return new FoodzPresenterImpl();
    }
}
