package android.trainings.focus.com.daggerandeventbusdemo.fargment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class BaseFragment extends Fragment {

    private static final String CLASS_NAME = BaseFragment.class.getName();

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(CLASS_NAME, "inside onAttach ");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(CLASS_NAME, "inside onCreate ");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Log.d(CLASS_NAME, "inside onCreateView ");
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(CLASS_NAME, "inside onActivityCreated ");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(CLASS_NAME, "inside onStart ");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(CLASS_NAME, "inside onResume ");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(CLASS_NAME, "inside onPause ");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(CLASS_NAME, "inside onStop ");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(CLASS_NAME, "inside onDestroyView ");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(CLASS_NAME, "inside onDestroy ");
    }

}
