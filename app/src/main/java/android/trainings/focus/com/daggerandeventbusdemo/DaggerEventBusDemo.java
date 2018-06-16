package android.trainings.focus.com.daggerandeventbusdemo;

import android.app.Application;
import android.trainings.focus.com.daggerandeventbusdemo.component.ApiComponent;
import android.trainings.focus.com.daggerandeventbusdemo.component.DaggerApiComponent;
import android.trainings.focus.com.daggerandeventbusdemo.module.AppModule;
import android.trainings.focus.com.daggerandeventbusdemo.module.EmployeeModule;

public class DaggerEventBusDemo extends Application {
    ApiComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = createcomponent();
    }

    private ApiComponent createcomponent() {

        return DaggerApiComponent.builder().appModule(new AppModule(this)).employeeModule(new EmployeeModule()).build();
    }

    public ApiComponent getComponent() {
        return component;
    }
}
