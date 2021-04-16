package com.example.marymathauser.qpapper;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.marymathauser.R;
import com.example.marymathauser.ebook.PdfViewerActivity;

import java.util.List;

public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.QuestionViewHolder> {


    private Context context;
    private List<QuestionData> list;

    public QuestionAdapter(Context context, List<QuestionData> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public QuestionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.question_item_layout, parent, false);
        return new QuestionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuestionViewHolder holder, int position) {

        holder.questionName.setText(list.get(position).getQuestiontitle());

        holder.questionName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, PdfViewActivity.class);
                intent.putExtra("QuestionUrl", list.get(position).getQuestionUrl());
                context.startActivity(intent);
            }
        });

        holder.questionDwnld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(list.get(position).getQuestionUrl()));
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class QuestionViewHolder extends RecyclerView.ViewHolder {


        private TextView questionName;
        private ImageView questionDwnld;

        public QuestionViewHolder(@NonNull View itemView) {
            super(itemView);

            questionName = itemView.findViewById(R.id.questionName);
            questionDwnld = itemView.findViewById(R.id.questionDwnld);
        }
    }

}
