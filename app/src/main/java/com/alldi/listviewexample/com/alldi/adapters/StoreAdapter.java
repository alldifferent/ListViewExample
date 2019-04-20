package com.alldi.listviewexample.com.alldi.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.alldi.listviewexample.R;
import com.alldi.listviewexample.com.alldi.datas.Store;

import java.util.List;

public class StoreAdapter extends ArrayAdapter<Store> {

    Context mContext;
    List<Store> mList;
    LayoutInflater inf;

    public StoreAdapter(Context context, List<Store> list){
        super(context, R.layout.store_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row = convertView;

        if (row == null){
            row = inf.inflate(R.layout.store_list_item, null);
        }

        Store data = mList.get(position);

        TextView storeNameTxt = row.findViewById(R.id.storeNameTxt);

        storeNameTxt.setText(data.name);


        return row;

    }
}
