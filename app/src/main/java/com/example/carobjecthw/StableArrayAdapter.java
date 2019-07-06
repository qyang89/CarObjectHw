package com.example.carobjecthw;


import android.content.Context;
import android.media.Image;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.HashMap;
import java.util.List;

class StableArrayAdapter extends ArrayAdapter<Car> {
    //declare the init map used to keep track of data
    private HashMap<Car, Integer> idMap = new HashMap<>();

    //declare context and data to be available in the class scope
    Context context;
    List<Car> data;

    //create a constructor and pass values from constructor to the super class/parent
    StableArrayAdapter(Context context, List<Car> data) {
        super(context, R.layout.custom_layout, data);

        //init context and data
        this.context = context;
        this.data = data;

        for(int i = 0; i < data.size();i++) {
            idMap.put(data.get(i), i);
        }
    }





    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //declare and init LayoutInflater
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //DECLARE AND INIT THE VIEW WE WANT TO USE
        View itemView = inflater.inflate(R.layout.custom_layout,parent,false);

        //declare and init the children of the view (main view is custom_layout, buttons/texts are children view)
        TextView tvModel = itemView.findViewById(R.id.tv_model);
        TextView tvMake = itemView.findViewById(R.id.tv_make);
        TextView tvYear = itemView.findViewById(R.id.tv_year);
        TextView tvColor = itemView.findViewById(R.id.tv_color);
        TextView tvBodyType = itemView.findViewById(R.id.tv_bodyType);
        TextView tvEngineType = itemView.findViewById(R.id.tv_engineType);
        TextView tvHorsePower = itemView.findViewById(R.id.tv_horsePower);
        TextView tvSeatCount = itemView.findViewById(R.id.tv_seatCount);
        TextView tvCost = itemView.findViewById(R.id.tv_cost);
        ImageView ivImage = itemView.findViewById(R.id.iv_image);

        //get value/object at current position
        Car car = data.get(position);  //position variable comes from above code in the public view

        //use value/objects with children of the views
        tvModel.setText(car.getModel());
        tvMake.setText(car.getMake());
        tvYear.setText(car.getYear());
        tvColor.setText(car.getColor());
        tvBodyType.setText(car.getBodyType());
        tvEngineType.setText(car.getEngineType());
        tvHorsePower.setText(car.getHorsePower());
        tvSeatCount.setText(car.getSeatCount());
        tvCost.setText(car.getCost());


        Picasso.get().load(car.getImageUrl()).into(ivImage);


        //return the view
        return itemView;
    }

    @Override
    public long getItemId(int position) {
        Car item = getItem(position);
        return idMap.get(item);
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }
}
