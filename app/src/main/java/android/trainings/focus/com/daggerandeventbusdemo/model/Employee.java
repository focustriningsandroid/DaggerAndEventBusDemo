package android.trainings.focus.com.daggerandeventbusdemo.model;

import javax.inject.Inject;

public class Employee {

    private String name = "";

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
