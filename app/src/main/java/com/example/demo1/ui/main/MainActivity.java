package com.example.demo1.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.demo1.R;
import com.example.demo1.ui.main.Retrofit.RetrofitClient;
import com.example.demo1.ui.main.adapter.RecycleAdapter;
import com.example.demo1.ui.main.classinfo.Classinfo;
import com.example.demo1.ui.main.classinfo.NetworkClient;
import com.example.demo1.ui.main.classinfo.Thongtin;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Thongtin> arrayList;
    RecycleAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        arrayList=new ArrayList<>();
        arrayList.add(new Thongtin("TP Hồ chí minh","TP.Đẹp","30","70%","60%"));
        arrayList.add(new Thongtin("Hà Nội","Thủ đô","30","60%","60%"));
        adapter=new RecycleAdapter(arrayList,MainActivity.this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(mLayoutManager);

       /* fetchWeatherDetails();*/
    }
   /* private void fetchWeatherDetails() {
        //Obtain an instance of Retrofit by calling the static method.
        Retrofit retrofit = NetworkClient.getRetrofitClient();
        *//*
        The main purpose of Retrofit is to create HTTP calls from the Java interface based on the annotation associated with each method. This is achieved by just passing the interface class as parameter to the create method
        *//*
        RetrofitClient.WeatherAPIs weatherAPIs = retrofit.create(RetrofitClient.WeatherAPIs.class);
        *//*
        Invoke the method corresponding to the HTTP request which will return a Call object. This Call object will used to send the actual network request with the specified parameters
        *//*
        Call call = (Call) weatherAPIs.getWeatherByCity("London,uk", "b6907d289e10d714a6e88b30761fae22");
        *//*
        This is the line which actually sends a network request. Calling enqueue() executes a call asynchronously. It has two callback listeners which will invoked on the main thread
        *//*
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) {
                *//*This is the success callback. Though the response type is JSON, with Retrofit we get the response in the form of WResponse POJO class
                 *//*
                if (response.isSuccessful()) {

                  ResponseBody classinfo=response.body();
                    Toast.makeText(MainActivity.this,classinfo.toString(),Toast.LENGTH_LONG).show();
                }
            }
        });
        }*/
}

