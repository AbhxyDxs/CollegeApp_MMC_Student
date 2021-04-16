package com.example.marymathauser.ui.about;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.marymathauser.R;

import java.util.List;

public class BranchAdapter extends PagerAdapter {
    private Context context;
    private List<BranchModel> list;


    public BranchAdapter(Context context, List<BranchModel> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
View view = LayoutInflater.from(context).inflate(R.layout.branch_item_layout,container,false);
        ImageView brIcn;
        TextView brTle,brDes;
        brIcn = view.findViewById(R.id.br_icon);
        brTle = view.findViewById(R.id.br_title);
        brDes = view.findViewById(R.id.br_desc);

        brIcn.setImageResource(list.get(position).getImg());
        brTle.setText(list.get(position).getTitle());
        brDes.setText(list.get(position).getDescription());
        container.addView(view,0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ((ViewPager) container).removeView((View) object);    }
}
