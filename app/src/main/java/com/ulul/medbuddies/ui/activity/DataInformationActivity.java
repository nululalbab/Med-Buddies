package com.ulul.medbuddies.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ulul.medbuddies.R;
import com.ulul.medbuddies.contract.DataInformationContract;
import com.ulul.medbuddies.presenter.DataInformationPresenter;

public class DataInformationActivity extends AppCompatActivity implements DataInformationContract.View {
    DataInformationPresenter presenter;
    Button btn_submit;

    EditText nama, no_telp, alamat, ttl, jenis_kelamin, sumber_biaya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_information);

        presenter = new DataInformationPresenter(this);
        presenter.setContext(this);

        btn_submit = (Button) findViewById(R.id.btn_submit);

        nama = (EditText) findViewById(R.id.nama);
        no_telp = (EditText) findViewById(R.id.no_telp);
        alamat = (EditText) findViewById(R.id.alamat);
        ttl = (EditText) findViewById(R.id.ttl);
        jenis_kelamin = (EditText) findViewById(R.id.jenis_kelamin);
        sumber_biaya = (EditText) findViewById(R.id.sumber_biaya);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.setData(nama.getText().toString(), alamat.getText().toString(), no_telp.getText().toString(),
                        ttl.getText().toString(), jenis_kelamin.getText().toString(), sumber_biaya.getText().toString());
                presenter.submitData();
            }
        });
    }

    @Override
    public void setPresenter(DataInformationContract.Presenter presenter) {

    }

    @Override
    public void onLoad() {

    }

    @Override
    public void onError() {

    }

    @Override
    public void onSuccess() {

    }

    @Override
    public void message(String msg) {

    }
}
