package org.techtown.listviewsample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //어뎁터 생성
        ListViewAdapter adapter = new ListViewAdapter();

        //리스트 뷰 참조 및 어뎁터 닫기
        ListView listview = (ListView)findViewById(R.id.listview1);
        listview.setAdapter(adapter);

        //아이템 추가
        adapter.addItem(ContextCompat.getDrawable(this,R.drawable.minji), "민지","010-0000-0000");
        adapter.addItem(ContextCompat.getDrawable(this,R.drawable.sukhwan), "석환","010-1111-1111");
        adapter.addItem(ContextCompat.getDrawable(this,R.drawable.si), "시바","010-2222-2222");
        adapter.addItem(ContextCompat.getDrawable(this,R.drawable.cat), "고양이","010-3333-3333");
        adapter.addItem(ContextCompat.getDrawable(this,R.drawable.po), "포메라니안","010-4444-4444");



    }
}
