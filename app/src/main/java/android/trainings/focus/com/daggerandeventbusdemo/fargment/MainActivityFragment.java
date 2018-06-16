package android.trainings.focus.com.daggerandeventbusdemo.fargment;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.trainings.focus.com.daggerandeventbusdemo.R;
import android.trainings.focus.com.daggerandeventbusdemo.activity.SecondActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends BaseFragment {
    private static final String CLASS_NAME = MainActivityFragment.class.getName();

    private TextView textView;
    private View view;

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
        view = inflater.inflate(R.layout.fragment_main, container, false);
        textView = (TextView) getActivity().findViewById(R.id.text);
        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(CLASS_NAME, "inside onActivityCreated ");
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), SecondActivity.class));
            }
        });
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
