package android.trainings.focus.com.daggerandeventbusdemo.module;

import android.trainings.focus.com.daggerandeventbusdemo.model.Employee;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class EmployeeModule {

    @Provides
    public Employee provideEmployee(String name) {
        return new Employee(name);
    }
}
