package com.example.contaccs;

import static android.app.PendingIntent.getActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.contaccs.Contact;

public class MainActivity extends AppCompatActivity {
    Contact o1 = new Contact(1, "Kshitij", "9871210026");
    Contact o2 = new Contact(2, "Diksha", "3919374203");
    Contact o3 = new Contact(3, "Siddharth", "876203875");
    Contact o4 = new Contact(4, "Tanush", "6534522556");
    Contact o5 = new Contact(5, "Kunwar", "43634611446");
    Contact o6 = new Contact(6, "Manav", "4252423235");
    Contact o7 = new Contact(7, "Manan", "238875138");
    Contact o8 = new Contact(8, "Prashmit", "48492429889");

    Contact[] contacts = {o1, o2, o3, o4, o5, o6, o7, o8};
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter ad = new CustomAdapter(contacts);
        recyclerView.setAdapter(ad);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

    }


}