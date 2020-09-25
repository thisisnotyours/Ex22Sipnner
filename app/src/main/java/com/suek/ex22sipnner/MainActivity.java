package com.suek.ex22sipnner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // 1)
    Spinner spinner;
    // 2)
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1)
        spinner= findViewById(R.id.spinner);

        // 2) 대량의 데이터를 뷰들로 만들어주는 객체 생성
        adapter= ArrayAdapter.createFromResource(this, R.array.datas, R.layout.spinner_selected);

        // 2.1) 드롭다운된 TextView 의 모양을 다르게 하고 싶다면..
        adapter.setDropDownViewResource(R.layout.spinner_dropdown);


        spinner.setAdapter(adapter);  //실행

        // 3) 스피너의 아이템을 선책햇을때 반응하는 리스너 추가
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {    //position 선택된것
                Toast.makeText(MainActivity.this, position+"", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }
}
