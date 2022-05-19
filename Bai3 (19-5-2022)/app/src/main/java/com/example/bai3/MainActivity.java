package com.example.bai3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnChuyenDoi;
    private EditText etDuongLich;
    private TextView tvAmLich;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnChuyenDoi=(Button) findViewById(R.id.btnChuyenDoi);
        etDuongLich=(EditText) findViewById(R.id.etDuongLich);
        tvAmLich=(TextView) findViewById(R.id.tvAmLich);
        btnChuyenDoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String can[]={"Canh","Tân","Nhâm","Quý","Giáp","Ất","Bính","Đinh","Mậu","Kỷ"};
                String chi[]={"Thân","Dậu","Tuất","Hợi","Tý","Sửu","Dần","Mẹo","Thìn","Tỵ","Ngọ","Mùi"};
                String dl=etDuongLich.getText().toString();
                int n = Integer.parseInt(dl);
                String am = can[n%10] + " "+chi[n%12];
                tvAmLich.setText(am);
            }
        });
    }
}