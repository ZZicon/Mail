package com.example.administrator.maillist.fragment;

import com.example.administrator.maillist.adapter.DialAdapter;
import com.example.administrator.maillist.model.GankResults;

import cn.droidlover.xdroidmvp.base.SimpleRecAdapter;
import cn.droidlover.xrecyclerview.RecyclerItemCallback;
import cn.droidlover.xrecyclerview.XRecyclerView;

/**
 * Created by Administrator on 2017/10/11.
 */

public class DialFragment extends BasePagerFragment{

    DialAdapter adapter;

    @Override
    public SimpleRecAdapter getAdapter() {
        if (adapter == null) {
            adapter = new DialAdapter(context);
            adapter.setRecItemClick(new RecyclerItemCallback<GankResults.Item, DialAdapter.ViewHolder>() {
                @Override
                public void onItemClick(int position, GankResults.Item model, int tag, DialAdapter.ViewHolder holder) {
                    super.onItemClick(position, model, tag, holder);
                    switch (tag) {
                        case DialAdapter.TAG_VIEW:
//                            WebActivity.launch(context, model.getUrl(), model.getDesc());
                            break;
                    }
                }
            });
        }
        return adapter;
    }

    @Override
    public void setLayoutManager(XRecyclerView recyclerView) {
        recyclerView.verticalLayoutManager(context);
    }

    @Override
    public String getType() {
        return "Dial";
    }

    public static DialFragment newInstance() {
        return new DialFragment();
    }
}
