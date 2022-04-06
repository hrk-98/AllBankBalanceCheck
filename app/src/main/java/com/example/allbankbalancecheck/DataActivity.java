package com.example.allbankbalancecheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {

    TextView textview, phone1, phone2, phone3,share1,share2,share3;
    ImageView imageView,close,call1,call2,call3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        close=findViewById(R.id.c1);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        textview = findViewById(R.id.t1);
        imageView = findViewById(R.id.t2);
        phone1 = findViewById(R.id.p1);
        phone2 = findViewById(R.id.p2);
        phone3 = findViewById(R.id.p3);

        String n = getIntent().getStringExtra("name");
        int pos = getIntent().getIntExtra("pos", 0);

        imageView.setImageResource(MainActivity.imgid[pos]);
        textview.setText(MainActivity.lists[pos]);

        if (pos == 0) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l1);


            if(pos==0){

                phone1.setText("09223766666");
                phone2.setText("09223866666");
                phone3.setText("18004253800");
            }

        }


        if (pos == 1) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l2);


            if(pos==1){

                phone1.setText("09223011311");
                phone2.setText("5616150");
                phone3.setText("18001024455");
            }

        }
        if (pos == 2) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l3);


            if(pos==2){

                phone1.setText("18002703333");
                phone2.setText("18002703355");
                phone3.setText("18004254332");
            }

        }

        if (pos == 3) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l4);


            if(pos==3){

                phone1.setText("09015135135");
                phone2.setText("09810558585");
                phone3.setText("1800220229");
            }

        }

        if (pos == 4) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l5);


            if(pos==4){

                phone1.setText("09289356677");
                phone2.setText("09278656677");
                phone3.setText("18002336427");
            }

        }

        if (pos == 5) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l6);


            if(pos==5){

                phone1.setText("18002740110");
                phone2.setText("5676788");
                phone3.setText("18602662666");
            }

        }

        if (pos == 6) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l7);


            if(pos==6){

                phone1.setText("09015483483");
                phone2.setText("09015734734");
                phone3.setText("18004250018");
            }

        }

        if (pos == 7) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l8);


            if(pos==7){

                phone1.setText("09880752484");
                phone2.setText("NO");
                phone3.setText("NO");
            }

        }

        if (pos == 8) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l9);


            if(pos==8){

                phone1.setText("5607040");
                phone2.setText("56077040");
                phone3.setText("18001802222");
            }

        }

        if (pos == 9) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l10);


            if(pos==9){

                phone1.setText("09223008586");
                phone2.setText("09223008486");
                phone3.setText("18002082244");
            }

        }

        if (pos == 10) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l11);


            if(pos==10){

                phone1.setText("09278792787");
                phone2.setText("09213125125");
                phone3.setText("18001030123");
            }

        }

        if (pos == 11) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l12);


            if(pos==11){

                phone1.setText("18002665555");
                phone2.setText("18001035535");
                phone3.setText("18004255885");
            }

        }
        if (pos == 12) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l13);


            if(pos==12){

                phone1.setText("18001034722");
                phone2.setText("09611124722");
                phone3.setText("18001034722");
            }

        }

        if (pos == 13) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l14);


            if(pos==13){

                phone1.setText("09840909000");
                phone2.setText("09223921111");
                phone3.setText("18002000");
            }

        }

        if (pos == 14) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l15);


            if(pos==14){

                phone1.setText("09223008488");
                phone2.setText("09840777222");
                phone3.setText("18008431800");
            }

        }

        if (pos == 15) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l16);


            if(pos==15){

                phone1.setText("09268892688");
                phone2.setText("5667716");
                phone3.setText("18004253555");
            }

        }

        if (pos == 16) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l17);


            if(pos==16){

                phone1.setText("09224150150");
                phone2.setText("09224150150");
                phone3.setText("1800226061");
            }

        }

        if (pos == 17) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l18);


            if(pos==17){

                phone1.setText("1800446630");
                phone2.setText("NO");
                phone3.setText("1800446630");
            }

        }

        if (pos == 18) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l19);


            if(pos==18){

                phone1.setText("09223011300");
                phone2.setText("09223173924");
                phone3.setText("18004251515");
            }

        }

        if (pos == 19) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l20);


            if(pos==19){

                phone1.setText("09222250000");
                phone2.setText("09555144441");
                phone3.setText("18002001911");
            }

        }

        if (pos == 20) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l21);


            if(pos==20){

                phone1.setText("09289592895");
                phone2.setText("09444394443");
                phone3.setText("180042500000");
            }

        }

        if (pos == 21) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l22);


            if(pos==21){

                phone1.setText("561615");
                phone2.setText("561615");
                phone3.setText("18001236601");
            }

        }

        if (pos == 22) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l23);


            if(pos==22){

                phone1.setText("08067747700");
                phone2.setText("56161");
                phone3.setText("18004251747");
            }

        }

        if (pos == 23) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l24);


            if(pos==23){

                phone1.setText("56161");
                phone2.setText("56161");
                phone3.setText("18003450345");
            }

        }

        if (pos == 24) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l25);


            if(pos==24){

                phone1.setText("18004251445");
                phone2.setText("18004251446");
                phone3.setText("18004251444");
            }

        }

        if (pos == 25) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l26);


            if(pos==25){

                phone1.setText("09223866666");
                phone2.setText("09223866666");
                phone3.setText("18001806005");
            }

        }

        if (pos == 26) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l27);


            if(pos==26){

                phone1.setText("1800112224");
                phone2.setText("NO");
                phone3.setText("1800112224");
            }

        }


        if (pos == 27) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l28);


            if(pos==27){

                phone1.setText("18002000269");
                phone2.setText("NO");
                phone3.setText("18002000269");
            }

        }

        if (pos == 28) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l29);


            if(pos==28){

                phone1.setText("09212438888");
                phone2.setText("09212438888");
                phone3.setText("01147472100");
            }

        }

        if (pos == 29) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l30);


            if(pos==29){

                phone1.setText("1800225087");
                phone2.setText("NO");
                phone3.setText("1800225087");
            }

        }

        if (pos == 30) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l31);


            if(pos==30){

                phone1.setText("09211937373");
                phone2.setText("NO");
                phone3.setText("18004250426");
            }

        }

        if (pos == 31) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l32);


            if(pos==31){

                phone1.setText("02614008080");
                phone2.setText("NO");
                phone3.setText("02614008000");
            }

        }

        if (pos == 32) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l33);


            if(pos==32){

                phone1.setText("09227148472");
                phone2.setText("NO");
                phone3.setText("1800112224");
            }

        }


        if (pos == 33) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l34);


            if(pos==33){

                phone1.setText("09223766666");
                phone2.setText("NO");
                phone3.setText("18004251825");
            }

        }

        if (pos == 34) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l35);


            if(pos==34){

                phone1.setText("18004252244");
                phone2.setText("NO");
                phone3.setText("18004252244");
            }

        }

        if (pos == 35) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l36);


            if(pos==35){

                phone1.setText("18001802010");
                phone2.setText("NO");
                phone3.setText("18001802010");
            }

        }

        if (pos == 36) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l37);


            if(pos==36){

                phone1.setText("09223866666");
                phone2.setText("NO");
                phone3.setText("18004255566");
            }

        }

        if (pos == 37) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l38);


            if(pos==37){

                phone1.setText("09664552255");
                phone2.setText("09664552255");
                phone3.setText("08026639966");
            }

        }

        if (pos == 38) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l39);


            if(pos==38){

                phone1.setText("8431900900");
                phone2.setText("08431600600");
                phone3.setText("18004251199");
            }

        }

        if (pos == 39) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l40);


            if(pos==39){

                phone1.setText("7506660011");
                phone2.setText("07506660022");
                phone3.setText("18002095363");
            }

        }

        if (pos == 40) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l41);


            if(pos==40){

                phone1.setText("09222281818");
                phone2.setText("09223181818");
                phone3.setText("18002334526");
            }

        }

        if (pos == 41) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l42);


            if(pos==41){

                phone1.setText("09282441155");
                phone2.setText("09282441155");
                phone3.setText("18004252233");
            }

        }

        if (pos == 42) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l43);


            if(pos==42){

                phone1.setText("18002741000");
                phone2.setText("09212299955");
                phone3.setText("18605005004");
            }

        }

        if (pos == 43) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l44);


            if(pos==43){

                phone1.setText("18004254445");
                phone2.setText("NO");
                phone3.setText("18004254445");
            }

        }

        if (pos == 44) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l45);


            if(pos==44){

                phone1.setText("18004190610");
                phone2.setText("09223366333");
                phone3.setText("18001238040");
            }

        }

        if (pos == 45) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.l46);


            if(pos==45){

                phone1.setText("18002588181");
                phone2.setText("09223008777");
                phone3.setText("18002588181");
            }

        }


        call1=findViewById(R.id.b1);
        call2=findViewById(R.id.b2);
        call3=findViewById(R.id.b3);

        call1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phonenumber=phone1.getText().toString();
                Intent intent=new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:"+phonenumber));
                startActivity(intent);

            }
        });

        call2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phonenumber2=phone2.getText().toString();
                Intent intent=new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:"+phonenumber2));
                startActivity(intent);
            }
        });

        call3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phonenumber3=phone3.getText().toString();
                Intent intent=new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:"+phonenumber3));
                startActivity(intent);
            }
        });



    }
}