package com.example.projectleboncoin_amse;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;


public class AdAdapter extends BaseAdapter {
    private final Context mContext;
    private final ArrayList<AdModel> mAdModelList;

    // 构造函数
    public AdAdapter(Context context, ArrayList<AdModel> adModelList) {
        mContext = context;
        mAdModelList = adModelList;
    }

    @Override
    public int getCount() {
        return mAdModelList.size(); // 返回广告数量
    }

    @Override
    public Object getItem(int position) {
        return mAdModelList.get(position); // 返回第position个广告
    }

    @Override
    public long getItemId(int position) {
        return position; // 返回广告id为position
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;


        if (convertView == null) {
            // 如果convertView为空，加载布局

            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_listview_ad, parent, false);

            // 创建一个ViewHolder对象保存视图中的各个组件
            viewHolder = new ViewHolder();
            viewHolder.imageView = convertView.findViewById(R.id.imageView2);
            viewHolder.titleTextView = convertView.findViewById(R.id.titre1);
            viewHolder.addressTextView = convertView.findViewById(R.id.address1);
            viewHolder.priceTextView = convertView.findViewById(R.id.price1);
            // 将ViewHolder对象存储在convertView中
            convertView.setTag(viewHolder);
        } else {
            // 如果convertView不为空，直接从convertView中获取ViewHolder对象
            viewHolder = (ViewHolder) convertView.getTag();
        }

        // 获取当前位置的广告对象
        AdModel ad = (AdModel) getItem(position);

        // 设置广告数据到视图中
        viewHolder.imageView.setImageResource(ad.getImage());
        viewHolder.titleTextView.setText(ad.getTitle());
        viewHolder.addressTextView.setText(ad.getAddress());
        viewHolder.priceTextView.setText(ad.getPrice());
        Log.i("TEST", "Test");

        boolean isRedValue = MainActivity.isMyBoolean();
        if (isRedValue) {
            // If isRedValue is true, set background color to soft yellow
            int softYellow = Color.rgb(250, 252, 203);
            convertView.setBackgroundColor(softYellow);
        } else {
            // Otherwise, set background color to a different color
            // Here, I'm assuming you want to use the soft yellow color defined in resources
            convertView.setBackgroundColor(ContextCompat.getColor(mContext, R.color.white));
        }
        return convertView;
    }

    // ViewHolder类，用于保存视图中的各个组件
    private static class ViewHolder {
        TextView priceTextView;
        ImageView imageView;
        TextView titleTextView;
        TextView addressTextView;
    }
}

