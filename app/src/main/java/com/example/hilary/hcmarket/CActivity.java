package com.example.hilary.hcmarket;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class CActivity extends AppCompatActivity {

    String[] items={"bags","clothes","fruits","vegetables"};

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = CActivity.this;


        int configuration=getResources().getConfiguration().orientation;
        if(configuration== Configuration.ORIENTATION_PORTRAIT){
            setContentView(R.layout.potrait);
            ListView listView= (ListView) findViewById(R.id.listv);

            ListAdapter adapter=new ArrayAdapter<String>(context,android.R.layout.simple_list_item_1,items);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                RelativeLayout rel1= (RelativeLayout) findViewById(R.id.bags);
                RelativeLayout rel2= (RelativeLayout) findViewById(R.id.clothes);
                RelativeLayout rel3 = (RelativeLayout) findViewById(R.id.fruits);
                RelativeLayout rel4 = (RelativeLayout) findViewById(R.id.vegitables);


                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String user_chose=String.valueOf(parent.getItemAtPosition(position));
                    switch (user_chose){
                        case "bags":

                            rel1.setVisibility(View.VISIBLE);
                            rel2.setVisibility(View.INVISIBLE);
                            rel3.setVisibility(view.INVISIBLE);
                            rel4.setVisibility(view.INVISIBLE);

                            break;
                        case "clothes":

                            rel1.setVisibility(View.INVISIBLE);
                            rel2.setVisibility(View.VISIBLE);
                            rel3.setVisibility(view.INVISIBLE);
                            rel4.setVisibility(view.INVISIBLE);
                            break;
                        case "fruits":

                            rel1.setVisibility(View.INVISIBLE);
                            rel2.setVisibility(View.INVISIBLE);
                            rel3.setVisibility(view.VISIBLE);
                            rel4.setVisibility(view.INVISIBLE);
                            break;
                        case "vegetable":

                            rel1.setVisibility(View.INVISIBLE);
                            rel2.setVisibility(View.INVISIBLE);
                            rel3.setVisibility(view.INVISIBLE);
                            rel4.setVisibility(view.VISIBLE);
                            break;

                    }
                }
            });

        }
        else if(configuration== Configuration.ORIENTATION_LANDSCAPE){
            setContentView(R.layout.landscape);
            ListView listView= (ListView) findViewById(R.id.listv);

            ListAdapter adapter=new ArrayAdapter<String>(context,android.R.layout.simple_list_item_1,items);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                RelativeLayout rel1= (RelativeLayout) findViewById(R.id.bags);
                RelativeLayout rel2= (RelativeLayout) findViewById(R.id.clothes);
                RelativeLayout rel3 = (RelativeLayout) findViewById(R.id.fruits);
                RelativeLayout rel4 = (RelativeLayout) findViewById(R.id.vegitables);


                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String user_chose=String.valueOf(parent.getItemAtPosition(position));
                    switch (user_chose){
                        case "bags":

                            rel1.setVisibility(View.VISIBLE);
                            rel2.setVisibility(View.INVISIBLE);
                            rel3.setVisibility(view.INVISIBLE);
                            rel4.setVisibility(view.INVISIBLE);

                            break;
                        case "clothes":

                            rel1.setVisibility(View.INVISIBLE);
                            rel2.setVisibility(View.VISIBLE);
                            rel3.setVisibility(view.INVISIBLE);
                            rel4.setVisibility(view.INVISIBLE);
                            break;
                        case "fruits":

                            rel1.setVisibility(View.INVISIBLE);
                            rel2.setVisibility(View.INVISIBLE);
                            rel3.setVisibility(view.VISIBLE);
                            rel4.setVisibility(view.INVISIBLE);
                            break;
                        case "vegetables":

                            rel1.setVisibility(View.INVISIBLE);
                            rel2.setVisibility(View.INVISIBLE);
                            rel3.setVisibility(view.INVISIBLE);
                            rel4.setVisibility(view.VISIBLE);
                            break;

                    }
                }
            });
        }
    }
}
