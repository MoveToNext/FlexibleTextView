package com.flexible.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.list_view)
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        listView.setAdapter(new MyAdapter());
    }


    private class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return 20;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null){
                view = LayoutInflater.from(MainActivity.this).inflate(R.layout.item_list, viewGroup, false);
            }
            FlexibleTextView C1 = ViewHolderUtil.get(view, R.id.C1);
            FlexibleTextView C2 = ViewHolderUtil.get(view, R.id.C2);
            FlexibleTextView C3 = ViewHolderUtil.get(view, R.id.C3);
            FlexibleTextView C4 = ViewHolderUtil.get(view, R.id.C4);
            FlexibleTextView C5 = ViewHolderUtil.get(view, R.id.C5);
            FlexibleTextView C6 = ViewHolderUtil.get(view, R.id.C6);
            FlexibleTextView C7 = ViewHolderUtil.get(view, R.id.C7);
            FlexibleTextView C8 = ViewHolderUtil.get(view, R.id.C8);
            FlexibleTextView C9 = ViewHolderUtil.get(view, R.id.C9);
            FlexibleTextView C10 = ViewHolderUtil.get(view, R.id.C10);
            FlexibleTextView C11 = ViewHolderUtil.get(view, R.id.C11);
            TextView zs_qishu = ViewHolderUtil.get(view, R.id.zs_qishu);
            zs_qishu.setText(i+"行");
            C1.showCicleText(i+"");
            C2.showCicleText(i+1+"");
            C3.showCicleText(i+2+"");
            C4.showCicleText(i+3+"");
            C5.showText(i+"");

            C6.showPurpleText(i+"");
            C7.showBlueText(i+"");
            C8.showGrayText(i+"");
            C9.showGreenText(i+"");
            C10.showText(i+2+"");
            C11.showText(i+"");

            return view;
        }
    }
}