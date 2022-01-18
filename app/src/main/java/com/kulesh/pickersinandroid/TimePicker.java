package com.kulesh.pickersinandroid;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimePicker extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        TimePickerDialog.OnTimeSetListener listener=new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(android.widget.TimePicker timePicker, int hour, int minute) {
                Calendar calendar=Calendar.getInstance();
                calendar.set(Calendar.HOUR_OF_DAY,hour);
                calendar.set(Calendar.MINUTE,minute);
                SimpleDateFormat simpleDateFormat=new SimpleDateFormat("hh:mm a");
                String time=simpleDateFormat.format(calendar.getTime());
                Toast.makeText(getActivity(), time, Toast.LENGTH_SHORT).show();
            }
        };TimePickerDialog dialog=new TimePickerDialog(getActivity(),listener,12,58,false);
    return dialog;
    }
}
