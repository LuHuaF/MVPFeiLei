package com.umeng.soexample.mvpfeilei.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.umeng.soexample.mvpfeilei.R;
import com.umeng.soexample.mvpfeilei.bean.TopBean;

import java.util.List;


public class TopAdapter extends RecyclerView.Adapter<TopAdapter.ViewHolder> {

    private List<TopBean.DataBean> list;
    private Context context;

    public TopAdapter(List<TopBean.DataBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.topitem, viewGroup, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        TopBean.DataBean dataBean = list.get(i);
        Glide.with(context).load(dataBean.getPic_url()).into(viewHolder.topimg);
        viewHolder.toptv.setText(dataBean.getNews_title());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView topimg;
        private TextView toptv;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            topimg = itemView.findViewById(R.id.topimg);
            toptv = itemView.findViewById(R.id.toptv);
        }
    }
}
