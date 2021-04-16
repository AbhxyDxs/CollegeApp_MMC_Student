package com.example.marymathauser.ui.faculty;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.marymathauser.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class FacultyFragment extends Fragment {


    private RecyclerView csDept, phyDept, matDept, cheDept, zoDept, cDept, eDept, jDept, ptDept, pDept, sDept, mlDept, hDept, btDept,prDept;;
    private LinearLayout CsnoData, chenoData, matnoData, phynoData, zonoData, cnoData, enoData, jnoData, ptnoData, pnoData, snoData, mlnoData, hnoData, btnoData,prnoData;;
    private List<TeacherData> list1, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11, list12, list13, list14,list15;
    private DatabaseReference reference,dbref;
    private TeacherAdapter adapter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_faculty, container, false);

        cheDept = view.findViewById(R.id.cheDept);
        chenoData=view.findViewById(R.id.chenoData);
        prDept = view.findViewById(R.id.prDept);
        prnoData = view.findViewById(R.id.prnoData);
        matDept=view.findViewById(R.id.matDept);
        matnoData=view.findViewById(R.id.matnoData);
        phyDept=view.findViewById(R.id.phyDept);
        phynoData=view.findViewById(R.id.phynoData);
        csDept=view.findViewById(R.id.csDept);
        CsnoData=view.findViewById(R.id.CsnoData);
        zoDept = view.findViewById(R.id.zoDept);
        zonoData = view.findViewById(R.id.zonoData);
        cDept = view.findViewById(R.id.cDept);
        cnoData = view.findViewById(R.id.cnoData);
        eDept = view.findViewById(R.id.eDept);
        enoData = view.findViewById(R.id.enoData);
        jDept = view.findViewById(R.id.jDept);
        jnoData = view.findViewById(R.id.jnoData);
        ptDept = view.findViewById(R.id.ptDept);
        ptnoData = view.findViewById(R.id.ptnoData);
        pDept = view.findViewById(R.id.peDept);
        pnoData = view.findViewById(R.id.penoData);
        sDept = view.findViewById(R.id.sDept);
        snoData = view.findViewById(R.id.snoData);
        mlDept = view.findViewById(R.id.mlDept);
        mlnoData = view.findViewById(R.id.mlnoData);
        hDept = view.findViewById(R.id.hDept);
        hnoData = view.findViewById(R.id.hnoData);
        btDept = view.findViewById(R.id.btDept);
        btnoData = view.findViewById(R.id.btnoData);


        reference= FirebaseDatabase.getInstance().getReference().child("teacher");
        csDept();
        matDept();
        phyDept();
        cheDept();
        zoDept();
        cDept();
        eDept();
        jDept();
        ptDept();
        pDept();
        sDept();
        mlDept();
        hDept();
        btDept();
        prDept();
        return view;
    }
    private void prDept() {
        dbref = reference.child("Principal");
        dbref.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                list15 = new ArrayList<>();
                if (!dataSnapshot.exists()) {
                    prnoData.setVisibility(View.VISIBLE);
                    prDept.setVisibility(View.GONE);
                } else {

                    prnoData.setVisibility(View.GONE);
                    prDept.setVisibility(View.VISIBLE);
                    for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                        TeacherData data = snapshot.getValue(TeacherData.class);
                        list15.add(data);
                    }
                    prDept.setHasFixedSize(true);
                    prDept.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapter = new TeacherAdapter(list15, getContext());
                    prDept.setAdapter(adapter);
                }

            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(getContext(), error.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void csDept() {
        dbref = reference.child("Computer Science");
        dbref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                list1 = new ArrayList<>();
                if(!dataSnapshot.exists()){
                    CsnoData.setVisibility(View.VISIBLE);
                    csDept.setVisibility(View.GONE);
                }else {

                    CsnoData.setVisibility(View.GONE);
                    csDept.setVisibility(View.VISIBLE);
                    for(DataSnapshot snapshot: dataSnapshot.getChildren()){
                        TeacherData data= snapshot.getValue(TeacherData.class);
                        list1.add(data);
                    }
                    csDept.setHasFixedSize(true);
                    csDept.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapter= new TeacherAdapter(list1, getContext());
                    csDept.setAdapter(adapter);
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(getContext(), error.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void cheDept() {
        dbref = reference.child("Chemistry");
        dbref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list2 = new ArrayList<>();
                if(!snapshot.exists()){
                    chenoData.setVisibility(View.VISIBLE);
                    cheDept.setVisibility(View.GONE);
                }else {

                    chenoData.setVisibility(View.GONE);
                    cheDept.setVisibility(View.VISIBLE);
                    for(DataSnapshot snapshot1: snapshot.getChildren()){
                        TeacherData data= snapshot1.getValue(TeacherData.class);
                        list2.add(data);
                    }
                    cheDept.setHasFixedSize(true);
                    cheDept.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapter= new TeacherAdapter(list2, getContext());
                    cheDept.setAdapter(adapter);
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(getContext(), error.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void phyDept() {
        dbref = reference.child("Physics");
        dbref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list3 = new ArrayList<>();
                if(!snapshot.exists()){
                    phynoData.setVisibility(View.VISIBLE);
                    phyDept.setVisibility(View.GONE);
                }else {

                    phynoData.setVisibility(View.GONE);
                    phyDept.setVisibility(View.VISIBLE);
                    for(DataSnapshot snapshot1: snapshot.getChildren()){
                        TeacherData data= snapshot1.getValue(TeacherData.class);
                        list3.add(data);
                    }
                    phyDept.setHasFixedSize(true);
                    phyDept.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapter= new TeacherAdapter(list3, getContext());
                    phyDept.setAdapter(adapter);
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(getContext(), error.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }
    private void btDept() {
        dbref = reference.child("Biological Techniques");
        dbref.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list14 = new ArrayList<>();
                if (!snapshot.exists()) {
                    btnoData.setVisibility(View.VISIBLE);
                    btDept.setVisibility(View.GONE);
                } else {

                    btnoData.setVisibility(View.GONE);
                    btDept.setVisibility(View.VISIBLE);
                    for (DataSnapshot snapshot1 : snapshot.getChildren()) {
                        TeacherData data = snapshot1.getValue(TeacherData.class);
                        list14.add(data);
                    }
                    btDept.setHasFixedSize(true);
                    btDept.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapter = new TeacherAdapter(list14, getContext());
                    btDept.setAdapter(adapter);
                }

            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(getContext(), error.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void hDept() {
        dbref = reference.child("Hindi");
        dbref.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list13 = new ArrayList<>();
                if (!snapshot.exists()) {
                    hnoData.setVisibility(View.VISIBLE);
                    hDept.setVisibility(View.GONE);
                } else {

                    hnoData.setVisibility(View.GONE);
                    hDept.setVisibility(View.VISIBLE);
                    for (DataSnapshot snapshot1 : snapshot.getChildren()) {
                        TeacherData data = snapshot1.getValue(TeacherData.class);
                        list13.add(data);
                    }
                    hDept.setHasFixedSize(true);
                    hDept.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapter = new TeacherAdapter(list13, getContext());
                    hDept.setAdapter(adapter);
                }

            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(getContext(), error.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void mlDept() {
        dbref = reference.child("Malayalam");
        dbref.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list12 = new ArrayList<>();
                if (!snapshot.exists()) {
                    mlnoData.setVisibility(View.VISIBLE);
                    mlDept.setVisibility(View.GONE);
                } else {

                    mlnoData.setVisibility(View.GONE);
                    mlDept.setVisibility(View.VISIBLE);
                    for (DataSnapshot snapshot1 : snapshot.getChildren()) {
                        TeacherData data = snapshot1.getValue(TeacherData.class);
                        list12.add(data);
                    }
                    mlDept.setHasFixedSize(true);
                    mlDept.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapter = new TeacherAdapter(list12, getContext());
                    mlDept.setAdapter(adapter);
                }

            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(getContext(), error.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void sDept() {
        dbref = reference.child("Statistics");
        dbref.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list11 = new ArrayList<>();
                if (!snapshot.exists()) {
                    snoData.setVisibility(View.VISIBLE);
                    sDept.setVisibility(View.GONE);
                } else {

                    snoData.setVisibility(View.GONE);
                    sDept.setVisibility(View.VISIBLE);
                    for (DataSnapshot snapshot1 : snapshot.getChildren()) {
                        TeacherData data = snapshot1.getValue(TeacherData.class);
                        list11.add(data);
                    }
                    sDept.setHasFixedSize(true);
                    sDept.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapter = new TeacherAdapter(list11, getContext());
                    sDept.setAdapter(adapter);
                }

            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(getContext(), error.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void pDept() {
        dbref = reference.child("Physical Education");
        dbref.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list10 = new ArrayList<>();
                if (!snapshot.exists()) {
                    pnoData.setVisibility(View.VISIBLE);
                    pDept.setVisibility(View.GONE);
                } else {

                    pnoData.setVisibility(View.GONE);
                    pDept.setVisibility(View.VISIBLE);
                    for (DataSnapshot snapshot1 : snapshot.getChildren()) {
                        TeacherData data = snapshot1.getValue(TeacherData.class);
                        list10.add(data);
                    }
                    pDept.setHasFixedSize(true);
                    pDept.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapter = new TeacherAdapter(list10, getContext());
                    pDept.setAdapter(adapter);
                }

            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(getContext(), error.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void ptDept() {
        dbref = reference.child("Political Science");
        dbref.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list9 = new ArrayList<>();
                if (!snapshot.exists()) {
                    ptnoData.setVisibility(View.VISIBLE);
                    jDept.setVisibility(View.GONE);
                } else {

                    ptnoData.setVisibility(View.GONE);
                    ptDept.setVisibility(View.VISIBLE);
                    for (DataSnapshot snapshot1 : snapshot.getChildren()) {
                        TeacherData data = snapshot1.getValue(TeacherData.class);
                        list9.add(data);
                    }
                    ptDept.setHasFixedSize(true);
                    ptDept.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapter = new TeacherAdapter(list9, getContext());
                    ptDept.setAdapter(adapter);
                }

            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(getContext(), error.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void jDept() {
        dbref = reference.child("Journalism");
        dbref.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list8 = new ArrayList<>();
                if (!snapshot.exists()) {
                    jnoData.setVisibility(View.VISIBLE);
                    jDept.setVisibility(View.GONE);
                } else {

                    jnoData.setVisibility(View.GONE);
                    jDept.setVisibility(View.VISIBLE);
                    for (DataSnapshot snapshot1 : snapshot.getChildren()) {
                        TeacherData data = snapshot1.getValue(TeacherData.class);
                        list8.add(data);
                    }
                    jDept.setHasFixedSize(true);
                    jDept.setLayoutManager(new LinearLayoutManager(getContext()));

                    adapter = new TeacherAdapter(list8, getContext());
                    jDept.setAdapter(adapter);
                }

            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(getContext(), error.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void eDept() {
        dbref = reference.child("English");
        dbref.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list7 = new ArrayList<>();
                if (!snapshot.exists()) {
                    enoData.setVisibility(View.VISIBLE);
                    eDept.setVisibility(View.GONE);
                } else {

                    enoData.setVisibility(View.GONE);
                    eDept.setVisibility(View.VISIBLE);
                    for (DataSnapshot snapshot1 : snapshot.getChildren()) {
                        TeacherData data = snapshot1.getValue(TeacherData.class);
                        list7.add(data);
                    }
                    eDept.setHasFixedSize(true);
                    eDept.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapter = new TeacherAdapter(list7, getContext());
                    eDept.setAdapter(adapter);
                }

            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(getContext(), error.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void cDept() {
        dbref = reference.child("Commerce");
        dbref.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list6 = new ArrayList<>();
                if (!snapshot.exists()) {
                    cnoData.setVisibility(View.VISIBLE);
                    cDept.setVisibility(View.GONE);
                } else {

                    cnoData.setVisibility(View.GONE);
                    cDept.setVisibility(View.VISIBLE);
                    for (DataSnapshot snapshot1 : snapshot.getChildren()) {
                        TeacherData data = snapshot1.getValue(TeacherData.class);
                        list6.add(data);
                    }
                    cDept.setHasFixedSize(true);
                    cDept.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapter = new TeacherAdapter(list6, getContext());
                    cDept.setAdapter(adapter);
                }

            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(getContext(), error.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void zoDept() {
        dbref = reference.child("Zoology");
        dbref.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list5 = new ArrayList<>();
                if (!snapshot.exists()) {
                    zonoData.setVisibility(View.VISIBLE);
                    zoDept.setVisibility(View.GONE);
                } else {

                    zonoData.setVisibility(View.GONE);
                    zoDept.setVisibility(View.VISIBLE);
                    for (DataSnapshot snapshot1 : snapshot.getChildren()) {
                        TeacherData data = snapshot1.getValue(TeacherData.class);
                        list5.add(data);
                    }
                    zoDept.setHasFixedSize(true);
                    zoDept.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapter = new TeacherAdapter(list5, getContext());
                    zoDept.setAdapter(adapter);
                }

            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(getContext(), error.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }


    private void  matDept() {
        dbref = reference.child("Mathematics");
        dbref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list4 = new ArrayList<>();
                if(!snapshot.exists()){
                    matnoData.setVisibility(View.VISIBLE);
                    matDept.setVisibility(View.GONE);
                }else {

                    matnoData.setVisibility(View.GONE);
                    matDept.setVisibility(View.VISIBLE);
                    for(DataSnapshot snapshot1: snapshot.getChildren()){
                        TeacherData data= snapshot1.getValue(TeacherData.class);
                        list4.add(data);
                    }
                    matDept.setHasFixedSize(true);
                    matDept.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapter= new TeacherAdapter(list4, getContext());
                    matDept.setAdapter(adapter);
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(getContext(), error.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }

}