package com.example.administrator.lab3;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListViewActivity extends AppCompatActivity {

    private List<Map<String, Object>> list;
    private int[] imageDate={R.drawable.cat_prc,R.drawable.dog,R.drawable.elephant,R.drawable.lion_prc,R.drawable.monkey,R.drawable.tiger};
    private String[] name = { "cat", "dog", "elephant", "lion" ,"monkey","tiger"};
    private SimpleAdapter adapter;
    private ListView listView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        initView();
        setListViewStyle();
    }

    private void setListViewStyle() {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText (ListViewActivity.this,"i am a"+name[i],Toast.LENGTH_SHORT).show ();
            }
        });

    }

    private void initView() {
        listView= (ListView) findViewById(R.id.lv_test);
        initDate();
        adapter=new SimpleAdapter(this,list,R.layout.activity_list_view,new String[]{"head","name"},new int[]{R.id.iv_icon,R.id.tv_name});
        listView.setAdapter(adapter);
    }

    private void initDate() {
        list =new ArrayList<> ();
        for (int i = 0; i < name.length; i++) {
            Map<String, Object> listem = new HashMap<String, Object> ();
            listem.put("head", imageDate[i]);
            listem.put("name", name[i]);
            list.add(listem);
        }
    }



}