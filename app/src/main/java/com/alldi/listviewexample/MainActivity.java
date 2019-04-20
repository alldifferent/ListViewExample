package com.alldi.listviewexample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.alldi.listviewexample.com.alldi.adapters.StoreAdapter;
import com.alldi.listviewexample.com.alldi.datas.Store;
import com.alldi.listviewexample.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding act;
    List<Store> myStoreList = new ArrayList<>();
    StoreAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        act = DataBindingUtil.setContentView(this, R.layout.activity_main);
        bindViews();
        setupEvents();
        setValues();
    }

    void setValues(){
        fillStores();
        myAdapter = new StoreAdapter(MainActivity.this, myStoreList);
        act.storeListView.setAdapter(myAdapter);
        act.appNameTxt.setText("배달의 민족");
    }

    void setupEvents(){

    }

    void bindViews(){

    }

    void fillStores(){
       myStoreList.add(new Store("서향", "월계동 411", "09:00", "21:00"));
       myStoreList.add(new Store("삼호각", "마들로", "09:00", "21:00"));
       myStoreList.add(new Store("안동장", "장위1동", "09:00", "21:00"));
    }

}
