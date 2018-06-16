package android.trainings.focus.com.daggerandeventbusdemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.trainings.focus.com.daggerandeventbusdemo.DaggerEventBusDemo;
import android.trainings.focus.com.daggerandeventbusdemo.R;
import android.trainings.focus.com.daggerandeventbusdemo.model.Employee;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {
    private static final String CLASS_NAME = MainActivity.class.getName();

    @Inject
    EventBus mBus;
    public Employee getEmployee() {
        return employee;
    }

    @Inject
    Employee employee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(CLASS_NAME, "inside onCreate ");
        setContentView(R.layout.activity_main);
        ((DaggerEventBusDemo) getApplication()).getComponent().inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(CLASS_NAME, "inside onStart ");
        if(null != mBus && !mBus.isRegistered(this)){
            mBus.register(this);
        }

    }


    @Subscribe
    public void getMessage(String name){

    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(CLASS_NAME, "inside onResume "+employee.getName());
        if(null != mBus) {
            mBus.post(employee);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(CLASS_NAME, "inside onPause ");
        if(null != mBus){
            mBus.unregister(this);
        }

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(CLASS_NAME, "inside onStop ");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(CLASS_NAME, "inside onDestroy ");

    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.d(CLASS_NAME, "inside onSaveInstanceState ");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(CLASS_NAME, "inside onRestart ");

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(CLASS_NAME, "inside onRestoreInstanceState ");

    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.d(CLASS_NAME, "inside onPostCreate ");

    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(CLASS_NAME, "inside onPostResume ");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.d(CLASS_NAME, "inside onCreateOptionsMenu ");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        Log.d(CLASS_NAME, "inside onPrepareOptionsMenu ");
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.d(CLASS_NAME, "inside onOptionsItemSelected ");
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        Log.d(CLASS_NAME, "inside onBackPressed ");
        super.onBackPressed();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Log.d(CLASS_NAME, "inside onActivityResult ");
        super.onActivityResult(requestCode, resultCode, data);
    }
}



