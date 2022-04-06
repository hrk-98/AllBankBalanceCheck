package com.example.allbankbalancecheck;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static String lists[]={"State Bank of India","Bank of Baroda","HDFC Bank","Bank of India","Dena Bank","Kotak Mahindra Bank","Canara Bank","Citi Bank","Punjab National Bank","Union Bank of India","UCO Bank","Vijaya Bank","HSBC Bank","Yes Bank","South Indian Bank","Corporation Bank","Allahabad Bank","American Express","Andhra Bank","Central Bank of Inadia","Indian Bank","Deutsche Bank","Dhanlaxmi Bank","United Bank of India","Karnataka Bank","State Bank of Bikaner & Jaipur","ABN Amro Bank","ANZ Bank","Bharatiya Mahila Bank","Casehnet Bank-Member Bank","Tamilnad Mercantile Bank","Varachha Cooperative Bank Limited","Royal Bank of Scotland","State Bank of Hyderabad","State Bank of Mysore","State Bank of Patiala","State Bank of Travancore","Syndicate Bank","Federal Bank","DCB Bank","Bank of Maharashtra","Lakshmi Vilas Bank","Induslnd Bank","Indian Overseas Bank","RBL Bank","Bandhan Bank"};
    public static Integer[] imgid={R.drawable.l1,R.drawable.l2,R.drawable.l3,R.drawable.l4,R.drawable.l5,R.drawable.l6,R.drawable.l7,R.drawable.l8,R.drawable.l9,R.drawable.l10,R.drawable.l11,R.drawable.l12,R.drawable.l13,R.drawable.l14,R.drawable.l15,R.drawable.l16,R.drawable.l17,R.drawable.l18,R.drawable.l19,R.drawable.l20,R.drawable.l21,R.drawable.l22,R.drawable.l23,R.drawable.l24,R.drawable.l25,R.drawable.l26,R.drawable.l27,R.drawable.l28,R.drawable.l29,R.drawable.l30,R.drawable.l31,R.drawable.l32,R.drawable.l33,R.drawable.l34,R.drawable.l35,R.drawable.l36,R.drawable.l37,R.drawable.l38,R.drawable.l39,R.drawable.l40,R.drawable.l41,R.drawable.l42,R.drawable.l43,R.drawable.l44,R.drawable.l45,R.drawable.l46};
    ListView l1,close;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l1=findViewById(R.id.bank);
        NameAdapter1 adapter=new NameAdapter1();
        l1.setAdapter(adapter);
        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(MainActivity.this,DataActivity.class);
                intent.putExtra("name",lists[position]);
                intent.putExtra("pos",position);
                startActivity(intent);
            }
        });
        close=findViewById(R.id.c1);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }


    private class NameAdapter1 extends BaseAdapter {
        @Override
        public int getCount() {
            return imgid.length;
        }

        @Override
        public Object getItem(int position) {

            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view1=getLayoutInflater().inflate(R.layout.option,null);
            ImageView imageView=view1.findViewById(R.id.l6);
            TextView textView=view1.findViewById(R.id.k1);

            imageView.setImageResource(imgid[position]);
            textView.setText(lists[position]);
            return view1;
        }
    }
}

