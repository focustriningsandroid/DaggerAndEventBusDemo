package android.trainings.focus.com.daggerandeventbusdemo.component;

import android.trainings.focus.com.daggerandeventbusdemo.activity.MainActivity;
import android.trainings.focus.com.daggerandeventbusdemo.model.Employee;
import android.trainings.focus.com.daggerandeventbusdemo.module.AppModule;
import android.trainings.focus.com.daggerandeventbusdemo.module.EmployeeModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, EmployeeModule.class})
public interface ApiComponent {

    public void inject(MainActivity mainActivity);
}
