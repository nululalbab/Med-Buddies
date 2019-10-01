package com.ulul.medbuddies.presenter;

import android.content.Context;

import com.ulul.medbuddies.contract.ScheduleContract;

public class SchedulePresenter implements ScheduleContract.Presenter {
    private ScheduleContract.View view;
    private Context context;

    public  SchedulePresenter(ScheduleContract.View view){
        this.view = view;
    }

    @Override
    public void setContext(Context context) {
        this.context = context;
    }
}
