package com.NguyenNgocGiaHung.CustomizedListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

public class CountryAdapter extends BaseAdapter {
    private List<Country> dsQuocGia; //Nguồn dữ liệu
    private Context context;
    private LayoutInflater inflater;

    public CountryAdapter(List<Country> dsQuocGia, Context context) {
        this.dsQuocGia = dsQuocGia;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }
    //
    class ControlHolder{ //tuong ung voi file item layout
        ImageView imageViewFlag;
        TextView textViewName;
        TextView textViewPopulation;
    }

    @Override
    public int getCount() {
        return dsQuocGia.size();
    }

    @Override
    public Object getItem(int i) {
        return dsQuocGia.get(i);
    }

    @Override
    public long getItemId(int i) { //chua dùng đến
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //get Item's View for setting data
        ControlHolder itemControlHolder; //stores refs to XML
        if(view == null) { //inflate form layout item XML
            view = inflater.inflate(R.layout.item_layout_country,null);
            //set refs for Controls
            itemControlHolder = new ControlHolder();
            itemControlHolder.imageViewFlag = view.findViewById(R.id.imageViewFlag);
            itemControlHolder.textViewName = view.findViewById(R.id.textViewNation);
            itemControlHolder.textViewPopulation = view.findViewById(R.id.textViewPopulation);
        }
        else{
            itemControlHolder = (ControlHolder)view.getTag();
        }
        //set Data for control which hold in itemControlHolder
            //data
        Country nationI = dsQuocGia.get(i);
        itemControlHolder.textViewName.setText(nationI.getCountryName());
        itemControlHolder.textViewPopulation.setText("Population" + nationI + "");
        //image
        int resImageID = context.getResources().getIdentifier(nationI.getCountryFlag(),"mipmap",context.getPackageName());
            itemControlHolder.imageViewFlag.setImageResource(resImageID);
        return view;
    }
}
