package android.trainings.focus.com.daggerandeventbusdemo.fargment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.trainings.focus.com.daggerandeventbusdemo.R;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SecondFragment extends BaseFragment {
    private static final String CLASS_NAME = SecondFragment.class.getName();

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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        Log.d(CLASS_NAME, "inside onCreateView ");
        return inflater.inflate(R.layout.fragment_second, container, false);
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
