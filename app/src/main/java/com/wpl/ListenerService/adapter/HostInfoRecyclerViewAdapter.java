package com.wpl.ListenerService.adapter;

import android.content.Context;
import android.media.Image;
import android.widget.ImageView;

import com.wpl.ListenerService.R;
import com.wpl.ListenerService.adapter.recyclerViewBaseAdapter.BaseAdapter;
import com.wpl.ListenerService.adapter.recyclerViewBaseAdapter.ViewHolder;
import com.wpl.ListenerService.bean.FeedbackData;

import java.util.List;

/**
 * adapter
 * Created by Administrator on 2017/2/22.
 */
public class HostInfoRecyclerViewAdapter extends BaseAdapter<FeedbackData> {

    public HostInfoRecyclerViewAdapter(Context context, List<FeedbackData> datas, boolean isOpenLoadMore) {
        super(context, datas, isOpenLoadMore);
    }

    @Override
    protected void convert(ViewHolder holder, FeedbackData data, int position) {
        holder.setText(R.id.itemFeedback_poi, data.getAoi());
        holder.setText(R.id.itemFeedback_date, data.getCreatedAt());
        holder.setText(R.id.itemFeedback_city, data.getCity());

        holder.setText(R.id.itemFeedback_callText, String.valueOf(data.getCallLog().size()));
        holder.setText(R.id.itemFeedback_smsText, String.valueOf(data.getSmsLog().size()));

        ImageView netType = (ImageView) holder.getConvertView().findViewById(R.id.itemFeedback_netType);
        switch (data.getNetType()) {
            case "WIFI":
                netType.setImageResource(R.mipmap.wifi);
                break;
            case "CMNET":
                netType.setImageResource(R.mipmap.cmnet);
                break;
            default:
                break;
        }

    }

    @Override
    protected int getItemLayoutId() {
        return R.layout.item_client_feedback_recycler_view;
    }
}