package com.example.carobjecthw;

import android.app.Activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "Main Activity";
    //declare views
    ListView listView;
    EditText etCount;
    Button btnload;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize views
        listView = findViewById(R.id.lv_list);
        etCount = findViewById(R.id.et_count_value);
        btnload = findViewById(R.id.btn_load);


        //set onclicklistener for button
        btnload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<Car> car = fetchCars();   //declare list of strings, equal to fetchdata
                setupListView(car);

            }
        });
    }

    private void setupListView(List<Car> data) {
        Log.d(TAG, "setupListView:" + data);

        //declare and int our adapter
        StableArrayAdapter adapter = new StableArrayAdapter(MainActivity.this, data);

        //set the adapter to listview
        listView.setAdapter(adapter);

        //set onitemclicklistener to listview
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//retrieve the value from the parent using the position passed in
                String value = (String) parent.getItemAtPosition(position);
            }
        });
    }


    //create fetchcar method -- number list with user input, dynamic list

    private List<Car> fetchCars() {


        //test to see if this will cover Personn object
        List<Car> cars = new ArrayList<>();  //this list will not show unless it's being returned.

//add couple person objects to list" ));
        cars.add(new Car("A5","Audi","2019","Silver","Coupe,Convertible","Gas","248-444","4", "", ""));
        cars.add(new Car("A5","Audi","2019","Silver","Coupe,Convertible","6","7","4", "", ""));
        cars.add(new Car("A5","Audi","2019","Silver","Coupe,Convertible","6","7","4", "", ""));
        cars.add(new Car("A5","Audi","2019","Silver","Coupe,Convertible","6","7","4", "", ""));
        cars.add(new Car("A5","Audi","2019","Silver","Coupe,Convertible","6","7","4", "", ""));

        return cars;

    }

    //            //declare and initialize
    private List<String> fetchData() {
        List<String> list = new ArrayList<>();
        int count;
        String etValue = etCount.getText().toString();  //string

        //will try to run code in the try scope first
        //if that fails, will try to run code in the catch scope
        try {
            count = Integer.valueOf(etValue);    //converts string to integer
        } catch (Exception ex) {
            count = 10; //if conversion fails or try=fail or no string is there, 10 counts (indx) max
        }

        //loop that adds numbers to the list
        for (int i = 0; i < count; i++) {  //if success, it will add to the list of value indicated based on count.
            list.add("" + i);
        }
        return list;
    }
}
