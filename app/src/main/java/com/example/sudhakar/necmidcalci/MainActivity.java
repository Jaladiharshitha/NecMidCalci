package com.example.sudhakar.necmidcalci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   TextView res;
   EditText mid_one,mid_two;
   Button cal;
   float n,m,r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mid_one=findViewById(R.id.mid1);
        mid_two=findViewById(R.id.mid2);
        res=findViewById(R.id.result);
        cal=findViewById(R.id.btn);


        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (TextUtils.isEmpty(mid_one.getText().toString())&&TextUtils.isEmpty(mid_two.getText().toString())){
                    Toast.makeText(MainActivity.this, "Enter All Fields", Toast.LENGTH_SHORT).show();
                }
                else {

                    n=Float.valueOf(mid_one.getText().toString());
                    m=Float.valueOf(mid_two.getText().toString());
                    if (n > 40 || m > 40) {
                        Toast.makeText(MainActivity.this, "Enter Valid Marks", Toast.LENGTH_SHORT).show();
                    } else if (n > m) {
                        r = ((n * 0.75f) + (m * 0.25f));
                        res.setText(String.valueOf(r));
                    } else {
                        r = ((n * 0.25f) + (m * 0.75f));
                        res.setText(String.valueOf(r));
                    }
                }
            }
        });
    }


}
