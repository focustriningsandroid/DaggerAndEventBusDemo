package android.trainings.focus.com.daggerandeventbusdemo.component;

import android.trainings.focus.com.daggerandeventbusdemo.activity.MainActivity;
import android.trainings.focus.com.daggerandeventbusdemo.module.AppModule;
import android.trainings.focus.com.daggerandeventbusdemo.module.EmployeeModule;

import dagger.Component;

@Component(modules = {AppModule.class, EmployeeModule.class})
public interface ApiComponent {

    public void inject(MainActivity mainActivity);
}
