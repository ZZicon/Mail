package com.example.administrator.maillist.adapter;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.BindView;
import cn.droidlover.xdroidmvp.base.SimpleRecAdapter;
import com.example.administrator.maillist.R;
import com.example.administrator.maillist.model.GankResults;
import cn.droidlover.xdroidmvp.imageloader.ILFactory;
import cn.droidlover.xdroidmvp.kit.KnifeKit;

/**
 * Created by Administrator on 2017/10/11.
 */

public class DialAdapter extends SimpleRecAdapter<GankResults.Item, DialAdapter.ViewHolder> {

    public static final int TAG_VIEW = 0;

    public DialAdapter(Context context) {
        super(context);
    }

    @Override
    public ViewHolder newViewHolder(View itemView) {
        return new ViewHolder(itemView);
    }

    @Override
    public int getLayoutId() {
        return R.layout.adapter_home;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        final GankResults.Item item = data.get(position);

        String type = item.getType();
        switch (type) {
            case "Dial":
                holder.mTextView.setText("Dial");
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (getRecItemClick() != null) {

                        }
                    }
                });
                break;
            case "Contacts":
                holder.mTextView.setText("Contacts");
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (getRecItemClick() != null) {

                        }
                    }
                });
                break;
            case "Message":
                holder.mTextView.setText("Message");
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (getRecItemClick() != null) {

                        }
                    }
                });
                break;
            default:
                holder.mTextView.setText("Personal");
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (getRecItemClick() != null) {

                        }
                    }
                });
                break;
        }
        Uri uri = null;

//        String author = item.getWho();
//        holder.tvTime.setText(item.getCreatedAt());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getRecItemClick() != null) {
                    getRecItemClick().onItemClick(position, item, TAG_VIEW, holder);
                }
            }
        });

    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.test_tv)
        TextView mTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            KnifeKit.bind(this, itemView);
        }
    }
}
