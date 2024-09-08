package com.nouroeddinne.gson;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



        Serialization();
        Deserialization();




    }


    // Simple

//    public void Serialization(){
//
//        Employee m = new Employee("noureddinne",21,55.2);
//        Gson gson = new Gson();
//        String result = gson.toJson(m);
//        Log.d("TAG", "Serialization: "+result);
//
//    }
//
//
//
//    public void Deserialization(){
//
//        String json = " {'age':21,'name':'noureddinne','salary':55.2}";
//        Gson gson = new Gson();
//        Employee model = gson.fromJson(json, Employee.class);
//
//        Log.d("TAG", "Deserialization: "+model.name+" "+model.age+" "+model.salary);
//
//    }



    // Nested Objects


//    public void Serialization(){
//
//        Address a = new Address("USA","123 street","New York");
//        Employee m = new Employee("noureddinne",21,55.2,a);
//        Gson gson = new Gson();
//        String result = gson.toJson(m);
//        Log.d("result", "Serialization: "+result);
//    }
//
//
//    public void Deserialization(){
//
//        String json = "{'address':{'city':'New York','country':'USA','street':'123 street'},'age':21,'name':'noureddinne','salary':55.2}";
//        Gson gson = new Gson();
//        Employee model = gson.fromJson(json, Employee.class);
//
//        Log.d("result", "Deserialization: "+model.name+" "+model.age+" "+model.salary+" "+ model.getAddress().getCountry()+" "+ model.getAddress().city+" "+ model.getAddress().street);
//
//    }




    //Lists of Objects



        public void Serialization(){


        List<Payment> paymentInfoList = new ArrayList<>();
        paymentInfoList.add(new Payment("Food",250.2));
        paymentInfoList.add(new Payment("Visa",500.0));
        paymentInfoList.add(new Payment("Internat",16.99));
        paymentInfoList.add(new Payment("Gaz Car",752.55));
        paymentInfoList.add(new Payment("Tax",988.65));

        Address a = new Address("USA","123 street","New York");

        Employee m = new Employee("noureddinne",21,55.2,a,paymentInfoList);

        Gson gson = new Gson();
        String result = gson.toJson(m);
        Log.d("result", "Serialization: "+result);
    }


    public void Deserialization(){

        String json = " {'address':{'city':'New York','country':'USA','street':'123 street'},'age':21,'name':'noureddinne'," +
                "'payment':[" +
                "{'amount':250.2,'name':'Food'}," +
                "{'amount':500.0,'name':'Visa'}," +
                "{'amount':16.99,'name':'Internat'}," +
                "{'amount':752.55,'name':'Gaz Car'}," +
                "{'amount':98865,'name':Tax" +
                "}]," +
                "'salary':55.2} ";
        Gson gson = new Gson();
        Employee model = gson.fromJson(json, Employee.class);

        Log.d("result", "Deserialization: "+model.name+" "+model.age+" "+model.salary+" "+ model.getAddress().getCountry()+" "+ model.getAddress().city+" "+ model.getAddress().street+
                        " "+model.payment.get(0).name+" "+model.payment.get(0).amount+
                        " "+model.payment.get(1).name+" "+model.payment.get(1).amount+
                        " "+model.payment.get(2).name+" "+model.payment.get(2).amount+
                        " "+model.payment.get(3).name+" "+model.payment.get(3).amount+
                        " "+model.payment.get(4).name+" "+model.payment.get(4).amount
                );

    }
















}