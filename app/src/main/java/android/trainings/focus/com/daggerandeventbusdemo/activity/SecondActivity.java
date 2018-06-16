package android.trainings.focus.com.daggerandeventbusdemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.trainings.focus.com.daggerandeventbusdemo.R;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class SecondActivity extends BaseActivity {
        private static final String CLASS_NAME = android.trainings.focus.com.daggerandeventbusdemo.activity.SecondActivity.class.getName();

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            Log.d(CLASS_NAME, "inside onCreate ");
            setContentView(R.layout.activity_second);
        }

        @Override
        protected void onStart() {
            super.onStart();
            Log.d(CLASS_NAME, "inside onStart ");

        }

        @Override
        protected void onResume() {
            super.onResume();
            Log.d(CLASS_NAME, "inside onResume ");

        }

        @Override
        protected void onPause() {
            super.onPause();
            Log.d(CLASS_NAME, "inside onPause ");

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




