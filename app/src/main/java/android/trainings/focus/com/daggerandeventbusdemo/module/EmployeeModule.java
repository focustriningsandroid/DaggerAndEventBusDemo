package android.trainings.focus.com.daggerandeventbusdemo.module;

import android.trainings.focus.com.daggerandeventbusdemo.model.Employee;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class EmployeeModule {


    private String name;

    public EmployeeModule(String name) {
        this.name = name;
    }

    @Provides
    public String provideEmployeeName(){
        return this.name;
    }

    @Provides
    public Employee provideEmployee() {
        return new Employee(name);
    }
}
