package com.example.ics45jlab;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

//public class Login_screen extends AppCompatActivity {
//
//    private EditText name, email, phonenumber;
//    private Button signin, waitlist;
//
//    private DatabaseReference myref = FirebaseDatabase.getInstance().getReference("users");
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login_screen);
//
//        name = (EditText) findViewById(R.id.etname);
//        email = (EditText) findViewById(R.id.etEmail);
//        phonenumber = (EditText) findViewById(R.id.etPhone);
//
//        signin = (Button) findViewById(R.id.btsignin);
//        waitlist = (Button) findViewById(R.id.btwaitlist);
//
//    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//
////        myref.addValueEventListener(new ValueEventListener() {
////            @Override
////            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
////                Info userdata = dataSnapshot.getValue(Info.class);
////            }
////
////            @Override
////            public void onCancelled(@NonNull DatabaseError databaseError) {
////
////            }
////        });
//
//        signin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                addtowaitlist();
//                }
//
//        });
//
//        waitlist.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//
//    }
//
//    private void addtowaitlist()
//    {
//        String n = name.getText().toString();
//        String em = email.getText().toString();
//        String pn = phonenumber.getText().toString();
//
//        if(!TextUtils.isEmpty(n) && !TextUtils.isEmpty(em) && !TextUtils.isEmpty(pn)){
//            String id = myref.push().getKey();
//
//            Info info = new Info (n,em, pn);
//            myref.child(id).setValue(info);
//
//            Toast.makeText(this, "You are signed in!", Toast.LENGTH_LONG).show();
//        }
//        else{
//            Toast.makeText(this, "Plase enter full infomation!", Toast.LENGTH_LONG).show();
//        }
//
//    }
//
//
//
//}
