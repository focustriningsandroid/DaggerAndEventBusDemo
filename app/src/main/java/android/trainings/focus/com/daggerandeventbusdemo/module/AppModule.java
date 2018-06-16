package android.trainings.focus.com.daggerandeventbusdemo.module;

import android.app.Application;
import android.trainings.focus.com.daggerandeventbusdemo.DaggerEventBusDemo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private DaggerEventBusDemo application;

    public AppModule(DaggerEventBusDemo application) {
        this.application = application;
    }

    @Provides
    @Singleton
    public DaggerEventBusDemo provideAplication() {
        return this.application;
    }
}
