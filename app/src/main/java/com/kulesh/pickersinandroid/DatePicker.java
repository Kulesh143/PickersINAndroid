package com.kulesh.pickersinandroid;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DatePicker extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        DatePickerDialog.OnDateSetListener listener=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(android.widget.DatePicker datePicker, int year, int month, int day) {
                Calendar calendar=Calendar.getInstance();
                calendar.set(Calendar.YEAR,year);
                calendar.set(Calendar.MONTH,month);
                calendar.set(Calendar.DAY_OF_MONTH,day);
                SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
                String date=simpleDateFormat.format(calendar.getTime());
                Toast.makeText(getActivity(), date, Toast.LENGTH_SHORT).show();
            }
        };DatePickerDialog dialog=new DatePickerDialog(getActivity(),listener,2000,12,8);
        return  dialog;

    }
}
