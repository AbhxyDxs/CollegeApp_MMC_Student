package com.example.marymathauser.qpapper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.marymathauser.R;
import com.example.marymathauser.ebook.EbookActivity;
import com.example.marymathauser.ebook.EbookAdapter;
import com.example.marymathauser.ebook.EbookData;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class QuestionActivity extends AppCompatActivity {
    private RecyclerView QuestionRecycle;
    private DatabaseReference reference;
    private List<QuestionData> list;
    private QuestionAdapter adapter;
    ShimmerFrameLayout shimmerFrameLayout;
    LinearLayout shimmerlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        getSupportActionBar().setTitle("Question Papers");

        QuestionRecycle = findViewById(R.id.questionRecyl);
        reference = FirebaseDatabase.getInstance().getReference().child("question");
        shimmerFrameLayout = findViewById(R.id.shimmer_view_container);
        shimmerlay = findViewById(R.id.shimmerly);
        getData();

    }


    private void getData() {

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                list = new ArrayList<>();
                for(DataSnapshot snapshot : dataSnapshot.getChildren()){
                    QuestionData data = snapshot.getValue(QuestionData.class);
                    list.add(data);

                }

                adapter= new QuestionAdapter(QuestionActivity.this,list);
                QuestionRecycle.setLayoutManager(new LinearLayoutManager(QuestionActivity.this));
                QuestionRecycle.setAdapter(adapter);
                shimmerFrameLayout.stopShimmer();
                shimmerlay.setVisibility(View.GONE);


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(QuestionActivity.this, error.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    protected void onPause() {
        shimmerFrameLayout.stopShimmer();
        super.onPause();
    }

    @Override
    protected void onResume() {
        shimmerFrameLayout.startShimmer();
        super.onResume();
    }
}