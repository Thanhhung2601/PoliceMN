package com.example.loginlogout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CongAnAdapter extends BaseAdapter {
    private Context context ;
    private int layout ;
    private List<CongAn> cocktailList ;
    public CongAnAdapter(Context context , int layout , List<CongAn> cocktailList ){
        this.context = context ;
        this.layout = layout ;
        this.cocktailList = cocktailList ;
    }

    @Override
    public int getCount() {
        return cocktailList.size();
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
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout , null);

        TextView tenCongAn = view.findViewById(R.id.tenCongAn);
        TextView noiCongTac = view.findViewById(R.id.noiCongTac);
        TextView capBac = view.findViewById(R.id.capBac);
        ImageView img_order = view.findViewById(R.id.img_order);

        CongAn cocktail = cocktailList.get(i);

        tenCongAn.setText(cocktail.getTenCongAn());
        noiCongTac.setText(cocktail.getNoiCongTac());
        capBac.setText(cocktail.getCapBac());
        img_order.setImageResource(cocktail.getImage());

        return view;
    }
}
