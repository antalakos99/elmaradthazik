package com.example.hazi4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Integer[] zaszlok={R.drawable.euro,R.drawable.usa,R.drawable.australia,R.drawable.canada,R.drawable.switzerland,R.drawable.hungary};
    String[] rovidNev = {"EUR", "USD", "AUD", "CAD", "CHF", "HUF"};
    String[] teljesNev = {"Euro", "Dollar (USA)", "Dollar (AU)", "Dollar (CA)", "Franc", "Forint"};
    String[] eladasiAr= {"4,7", "4,3", "3,4", "3,3", "3,7", "0,017"};
    String[] vasarlasiAr = {"4,5", "4,2", "3,2", "3", "3,5", "0,015"};

    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.customlist);
        CustomListAdapter adapter=new CustomListAdapter(this,rovidNev,teljesNev,zaszlok,eladasiAr,vasarlasiAr);
        lv.setAdapter(adapter);
    }
}