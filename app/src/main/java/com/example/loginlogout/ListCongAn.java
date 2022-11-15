package com.example.loginlogout;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ListCongAn extends AppCompatActivity {
    ListView listViewCocktail ;
    ArrayList<CongAn> arrCocktail;
    CongAnAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_order);
        listViewCocktail = findViewById(R.id.listOrder);
        arrCocktail = new ArrayList<>();
        arrCocktail.add(new CongAn("Cong An A" , "Da Nang" , "Si quan" , R.drawable.policehehe));
        arrCocktail.add(new CongAn("Cong An B" , "HCM" , "Thieu Ta" , R.drawable.policehehe));
        arrCocktail.add(new CongAn("Cong An C" , "Ha Noi" , "Trung Ta" , R.drawable.policehehe));
        arrCocktail.add(new CongAn("Cong An D" , "Vung Tau" , "Thuong Ta" , R.drawable.policehehe));
        adapter = new CongAnAdapter(this , R.layout.row_order , arrCocktail);
        listViewCocktail.setAdapter(adapter);

        listViewCocktail.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                CongAn cocktail = arrCocktail.get(i);

            }
        });
        listViewCocktail.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                AlertDialog.Builder alerdialog = new AlertDialog.Builder(ListCongAn.this);
                alerdialog.setTitle("Thong bao");
                alerdialog.setMessage("Ban co muon xoa khong");
                alerdialog.setPositiveButton("Co", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int ih) {
                        arrCocktail.remove(i);
                        adapter.notifyDataSetChanged();
                    }
                });
                alerdialog.setNegativeButton("khong", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int ih) {
                    }
                });
                alerdialog.show();
                return false;
            }
        });
    }
}