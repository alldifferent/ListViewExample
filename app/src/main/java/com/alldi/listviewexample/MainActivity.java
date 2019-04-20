package com.alldi.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.alldi.listviewexample.com.alldi.datas.Store;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Store> myStoreList = new ArrayList<>();
    ListView storeListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        setupEvents();
        setValues();
    }

    void setValues(){
        fillStores();
    }

    void setupEvents(){

    }

    void bindViews(){
        storeListView = findViewById(R.id.storeListView);
    }

    void fillStores(){
       myStoreList.add(new Store("서향", "월계동 411", "09:00", "21:00"));
       myStoreList.add(new Store("삼호각", "마들로", "09:00", "21:00"));
       myStoreList.add(new Store("안동장", "장위1동", "09:00", "21:00"));
    }

}
