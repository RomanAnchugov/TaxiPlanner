package ru.taxiplanner.romananchugov.taxiplanner;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by romananchugov on 15.01.2018.
 */

public class CreateNewOrderFragment extends DialogFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.create_new_order_fragment, container, false);
        return v;
    }

}