package com.example.lab4androidcoban.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lab4androidcoban.NguoiDung;
import com.example.lab4androidcoban.R;

import java.util.List;


public class MyAdapter extends BaseAdapter {

    Context context;
    List<NguoiDung> list;

    public MyAdapter(Context context, List<NguoiDung> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Khởi tạo giao diện
        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.row,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.img = convertView.findViewById(R.id.img);;
            viewHolder.tvName = convertView.findViewById(R.id.tv_name);
            viewHolder.tvBorn = convertView.findViewById(R.id.tv_born);

            convertView.setTag(viewHolder);
        }
        else {viewHolder = (ViewHolder) convertView.getTag();}

        //Đổ dữ liệu

        NguoiDung nguoiDung = (NguoiDung) getItem(position);
        viewHolder.tvName.setText(nguoiDung.getmName());
        viewHolder.tvBorn.setText(nguoiDung.getmBorn());

        return convertView;
    }
    public class ViewHolder{

        private ImageView img;
        private TextView tvName;
        private TextView tvBorn;
    }
}
