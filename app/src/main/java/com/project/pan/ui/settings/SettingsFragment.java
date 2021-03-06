package com.project.pan.ui.settings;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.project.pan.R;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class SettingsFragment extends Fragment {

    private EditText mSettingTemperature;
    private int mTemperature = 0;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_settings, container, false);
        ImageButton settingTemperature = root.findViewById(R.id.setButton);
        mSettingTemperature = root.findViewById(R.id.targetTemperature);
        try {
            mTemperature = getArguments().getInt("set_temperature");
            Log.d("===Setting===", "get temperature bundle: "+ mTemperature);
        } catch (Exception e){
            e.printStackTrace();
        }
        mSettingTemperature.setText(String.valueOf(mTemperature));

        settingTemperature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), mSettingTemperature.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        return root;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

}
