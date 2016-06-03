package com.pinggusoft.ffmpegtest.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.pinggusoft.ffmpegtest.R;
import com.pinggusoft.ffmpegtest.adapter.VideoItem;

import java.util.ArrayList;
import java.util.List;

//import javax.annotation.Nonnull;

public class ItemsAdapter extends BaseAdapter {
    
    private final LayoutInflater inflater;
    private List<VideoItem> videoItems = new ArrayList<VideoItem>();

    public static class ViewHolder {

        
        private final View view;
        
        private final TextView textView;

        public static ViewHolder fromConvertView( View convertView) {
            return (ViewHolder) convertView.getTag();
        }

        public ViewHolder( LayoutInflater inflater,  ViewGroup parent) {
            view = inflater.inflate(R.layout.main_list_item, parent, false);
            textView = (TextView) view.findViewById(R.id.main_list_item_text);
            view.setTag(this);
        }

        
        public View getView() {
            return view;
        }

        public void bind( VideoItem videoItem) {
            textView.setText(videoItem.text());
        }
    }

    public ItemsAdapter( LayoutInflater inflater) {
        this.inflater = inflater;
    }

    @Override
    public int getCount() {
        return videoItems.size();
    }

    @Override
    public VideoItem getItem(int position) {
        return videoItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return videoItems.get(position).id();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder(inflater, parent);
            convertView = holder.getView();
        } else {
            holder = ViewHolder.fromConvertView(convertView);
        }
        holder.bind(videoItems.get(position));
        return convertView;
    }

    public void swapItems( List<VideoItem> items) {
        videoItems = items;
        notifyDataSetChanged();
    }
}
