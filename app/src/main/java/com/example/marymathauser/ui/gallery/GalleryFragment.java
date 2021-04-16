package com.example.marymathauser.ui.gallery;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.marymathauser.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class GalleryFragment extends Fragment {

    RecyclerView oRecycelview,cRecycelview,iRecycelview,fRecycelview,feRecycelview,tRecycelview,onRecycelview,chRecycelview,
            ncRecycelview,nsRecycelview,jRecycelview,ivRecycelview,rRecycelview;
    GalleryAdapter adapter;
    DatabaseReference reference;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view =  inflater.inflate(R.layout.fragment_gallery, container, false);
       oRecycelview = view.findViewById(R.id.oRecycelview);
       cRecycelview = view.findViewById(R.id.cRecycelview);
       fRecycelview = view.findViewById(R.id.fRecycelview);
       iRecycelview = view.findViewById(R.id.iRecycelview);
       feRecycelview = view.findViewById(R.id.feRecycelview);
       tRecycelview = view.findViewById(R.id.tRecycelview);
       onRecycelview = view.findViewById(R.id.onRecycelview);
       chRecycelview = view.findViewById(R.id.chRecycelview);
       ncRecycelview = view.findViewById(R.id.ncRecycelview);
       nsRecycelview = view.findViewById(R.id.nsRecycelview);
       jRecycelview = view.findViewById(R.id.jnRecycelview);
       ivRecycelview = view.findViewById(R.id.ivRecycelview);
       rRecycelview = view.findViewById(R.id.reRecycelview);
       reference = FirebaseDatabase.getInstance().getReference().child("gallery");
       getCovImage();
       getFreImage();
       getFesImage();
       getIndImage();
       getTecImage();
       getOnmImage();
       getGndImage();
       getChrImage();
       getRepImage();
       getCivImage();
       getNssImage();
       getNccImage();
       getOthImage();

        return view;
    }



    private void getOthImage() {
        reference.child("Other Event").addValueEventListener(new ValueEventListener() {

            List<String> imagelist = new ArrayList<>();
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for (DataSnapshot snapshot: dataSnapshot.getChildren()){
                    String data= (String) snapshot.getValue();
                    imagelist.add(0,data);

                }

                adapter = new GalleryAdapter(getContext(),imagelist);
                oRecycelview.setLayoutManager(new GridLayoutManager(getContext(),3));
                oRecycelview.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    private void getCovImage() {
        reference.child("Convocation").addValueEventListener(new ValueEventListener() {

            List<String> imagelist = new ArrayList<>();
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for (DataSnapshot snapshot: dataSnapshot.getChildren()){
                    String data= (String) snapshot.getValue();
                    imagelist.add(0,data);

                }

                adapter = new GalleryAdapter(getContext(),imagelist);
                cRecycelview.setLayoutManager(new GridLayoutManager(getContext(),3));
                cRecycelview.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
    private void getFesImage() {
        reference.child("College Fest").addValueEventListener(new ValueEventListener() {

            List<String> imagelist = new ArrayList<>();
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for (DataSnapshot snapshot: dataSnapshot.getChildren()){
                    String data= (String) snapshot.getValue();
                    imagelist.add(0,data);

                }

                adapter = new GalleryAdapter(getContext(),imagelist);
                feRecycelview.setLayoutManager(new GridLayoutManager(getContext(),3));
                feRecycelview.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }

    private void getNccImage() {
        reference.child("Ncc Day").addValueEventListener(new ValueEventListener() {

            List<String> imagelist = new ArrayList<>();
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for (DataSnapshot snapshot: dataSnapshot.getChildren()){
                    String data= (String) snapshot.getValue();
                    imagelist.add(0,data);

                }

                adapter = new GalleryAdapter(getContext(),imagelist);
                ncRecycelview.setLayoutManager(new GridLayoutManager(getContext(),3));
                ncRecycelview.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }

    private void getNssImage() {
        reference.child("NSS Day").addValueEventListener(new ValueEventListener() {

            List<String> imagelist = new ArrayList<>();
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for (DataSnapshot snapshot: dataSnapshot.getChildren()){
                    String data= (String) snapshot.getValue();
                    imagelist.add(0,data);

                }

                adapter = new GalleryAdapter(getContext(),imagelist);
                nsRecycelview.setLayoutManager(new GridLayoutManager(getContext(),3));
                nsRecycelview.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }

    private void getCivImage() {
        reference.child("College IV").addValueEventListener(new ValueEventListener() {

            List<String> imagelist = new ArrayList<>();
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for (DataSnapshot snapshot: dataSnapshot.getChildren()){
                    String data= (String) snapshot.getValue();
                    imagelist.add(0,data);

                }

                adapter = new GalleryAdapter(getContext(),imagelist);
                ivRecycelview.setLayoutManager(new GridLayoutManager(getContext(),3));
                ivRecycelview.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }

    private void getRepImage() {
        reference.child("Republic Day").addValueEventListener(new ValueEventListener() {

            List<String> imagelist = new ArrayList<>();
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for (DataSnapshot snapshot: dataSnapshot.getChildren()){
                    String data= (String) snapshot.getValue();
                    imagelist.add(0,data);

                }

                adapter = new GalleryAdapter(getContext(),imagelist);
                rRecycelview.setLayoutManager(new GridLayoutManager(getContext(),3));
                rRecycelview.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }

    private void getChrImage() {

        reference.child("Christmas").addValueEventListener(new ValueEventListener() {

            List<String> imagelist = new ArrayList<>();
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for (DataSnapshot snapshot: dataSnapshot.getChildren()){
                    String data= (String) snapshot.getValue();
                    imagelist.add(0,data);

                }

                adapter = new GalleryAdapter(getContext(),imagelist);
                chRecycelview.setLayoutManager(new GridLayoutManager(getContext(),3));
                chRecycelview.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });



    }

    private void getGndImage() {
        reference.child("Gandhi Jayanthi").addValueEventListener(new ValueEventListener() {

            List<String> imagelist = new ArrayList<>();
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for (DataSnapshot snapshot: dataSnapshot.getChildren()){
                    String data= (String) snapshot.getValue();
                    imagelist.add(0,data);

                }

                adapter = new GalleryAdapter(getContext(),imagelist);
                jRecycelview.setLayoutManager(new GridLayoutManager(getContext(),3));
                jRecycelview.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }

    private void getIndImage() {
        reference.child("Independence Day").addValueEventListener(new ValueEventListener() {

            List<String> imagelist = new ArrayList<>();
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for (DataSnapshot snapshot: dataSnapshot.getChildren()){
                    String data= (String) snapshot.getValue();
                    imagelist.add(0,data);

                }

                adapter = new GalleryAdapter(getContext(),imagelist);
                iRecycelview.setLayoutManager(new GridLayoutManager(getContext(),3));
                iRecycelview.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }

    private void getTecImage() {
        reference.child("Teachers Day").addValueEventListener(new ValueEventListener() {

            List<String> imagelist = new ArrayList<>();
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for (DataSnapshot snapshot: dataSnapshot.getChildren()){
                    String data= (String) snapshot.getValue();
                    imagelist.add(0,data);

                }

                adapter = new GalleryAdapter(getContext(),imagelist);
                tRecycelview.setLayoutManager(new GridLayoutManager(getContext(),3));
                tRecycelview.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }

    private void getOnmImage() {
        reference.child("Onam").addValueEventListener(new ValueEventListener() {

            List<String> imagelist = new ArrayList<>();
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for (DataSnapshot snapshot: dataSnapshot.getChildren()){
                    String data= (String) snapshot.getValue();
                    imagelist.add(0,data);

                }

                adapter = new GalleryAdapter(getContext(),imagelist);
                onRecycelview.setLayoutManager(new GridLayoutManager(getContext(),3));
                onRecycelview.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }

    private void getFreImage() {
        reference.child("Freshers Day").addValueEventListener(new ValueEventListener() {

            List<String> imagelist = new ArrayList<>();
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for (DataSnapshot snapshot: dataSnapshot.getChildren()){
                    String data= (String) snapshot.getValue();
                    imagelist.add(0,data);

                }

                adapter = new GalleryAdapter(getContext(),imagelist);
                fRecycelview.setLayoutManager(new GridLayoutManager(getContext(),3));
                fRecycelview.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }

}