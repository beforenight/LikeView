package cn.izouxiang.likeviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import cn.izouxiang.likeview.R;

public class MainActivity extends AppCompatActivity {
    private List<SSEntity> ssEntities = new ArrayList<>();

    private void initData() {
        ssEntities.clear();
        ssEntities.add(new SSEntity("小明", true, 100, 1));
        ssEntities.add(new SSEntity("小红", false, 99, 0));
        ssEntities.add(new SSEntity("小强", true, 102, 20));
        ssEntities.add(new SSEntity("小黑", false, 103, 10));
        ssEntities.add(new SSEntity("小白", false, 109, 5));
        ssEntities.add(new SSEntity("小黑", true, 110, 2));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();

        RecyclerView rcv = (RecyclerView) findViewById(R.id.rcv);
        rcv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rcv.setAdapter(new SSAdapter(ssEntities, this));
    }
}
