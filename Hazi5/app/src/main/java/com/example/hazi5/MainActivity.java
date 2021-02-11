package com.example.hazi5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] elemek={"asd","fgbasdasd","xcasdasdasd","ddasdasdasd","hasdasdasd","jasdasdasd","qasdasdasd","casdasdasd",};
    List<String> list = new ArrayList<String>(Arrays.asList(elemek));
    ArrayAdapter adapter;

    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter= new ArrayAdapter(this,android.R.layout.simple_list_item_1,list);
        lv=findViewById(R.id.lista);
        lv.setAdapter(adapter);
        registerForContextMenu(lv);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.rendez:
                Collections.sort(list, new Comparator<String>() {
                    @Override
                    public int compare(String s1, String s2) {
                        return s1.compareToIgnoreCase(s2);
                    }
                });
                adapter.notifyDataSetChanged();
                return true;
            case R.id.torol:
                list.clear();
                adapter.notifyDataSetChanged();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.context_menu,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        AdapterView.AdapterContextMenuInfo info=(AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        View view = info.targetView;
        TextView txt1 = (TextView) view.findViewById(android.R.id.text1);
        switch (item.getItemId()) {
            case R.id.piros:
                txt1.setTextColor(Color.RED);
                return true;
            case R.id.sarga:
                txt1.setTextColor(Color.YELLOW);
                return true;
            case R.id.zold:
                txt1.setTextColor(Color.GREEN);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}