package com.example.demovenom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle bundle = getIntent().getExtras();
        if(bundle == null){
            return;
        }
        Member member = (Member) bundle.get("object_member");
        TextView  tvMatv = findViewById(R.id.tv_matv) ;
        TextView  tvName = findViewById(R.id.tv_hoten) ;
        TextView  tvNamsinh = findViewById(R.id.tv_namsinh) ;

        tvMatv.setText(member.getMatv());
        tvName.setText(member.getTen());
        tvNamsinh.setText(member.getNamsinh());
    }
}