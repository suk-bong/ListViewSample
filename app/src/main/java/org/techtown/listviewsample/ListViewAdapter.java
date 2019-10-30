package org.techtown.listviewsample;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {

    //어뎁터에 추가된 데이터를 저장하기 위한 어레이 리스트
    private ArrayList<ListViewItem> listViewItemList = new ArrayList<ListViewItem>();

    //리스트뷰 어뎁터 생성자
    public ListViewAdapter(){
    }

    //어뎁터에 사용되는 데이터의 개수를 리턴 => 필수 메소드
    @Override
    public int getCount() {
        return listViewItemList.size();
    }

    //포지션에 위치한 데이터를 화면에 출력하는데 사용될 뷰를 리턴 => 필수 메소드
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        if (convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listview_item,parent,false);
        }

        //화면에 표시될 레이아웃이 인플레이트 된 뷰로부터 위젯에 대한 참조 획득
        ImageView iconImageView = (ImageView) convertView.findViewById(R.id.imageView1);
        TextView titleTextView = (TextView) convertView.findViewById(R.id.textView1);
        TextView descTextView = (TextView) convertView.findViewById(R.id.textView2);

        //데이터 셋(listViewitemList)에서 포지션에 위치한 데이터 참조 획득
        ListViewItem listViewItem = listViewItemList.get(position);

        iconImageView.setImageDrawable(listViewItem.getIcon());
        titleTextView.setText(listViewItem.getTitle());
        descTextView.setText(listViewItem.getDesc());

        return convertView;
    }

    //포지션에 있는 데이터와 관계된 아이템(row)의 ID를 리턴 => 필수 메소드
    @Override
    public long getItemId(int position) {
        return position;
    }

    //포지션에 있는 데이터 리턴 => 필수 메소드
    @Override
    public Object getItem(int position) {
        return listViewItemList.get(position);
    }

    //아이템 데이터 추가
    public void addItem(Drawable icon, String title, String desc){
        ListViewItem item = new ListViewItem();

        item.setIcon(icon);
        item.setTitle(title);
        item.setDesc(desc);

        listViewItemList.add(item);
    }

}
