package com.example.paytmmall;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class ProdActivity extends Fragment {
    private RecyclerView recyclerView;
    private TextView categoriesName;
    private ArrayList<ProductModel> productModelList = new ArrayList<>();


    public ProdActivity() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_prod_activity, container, false);

        recyclerView=container.findViewById(R.id.prod_recyclerView);
        categoriesName=container.findViewById(R.id.categoriesName);
        BuildListTrending();
        setRecyclerViewTrending();



        return view;
    }

    private void setRecyclerViewTrending() {
        ProductAdapter adapter = new ProductAdapter(productModelList);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),3);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(gridLayoutManager);
    }

    private void BuildListTrending() {
        String str = SharedPreferenceHelper.getStringPreference(getContext(),"categories");
        if(str.equals("Trending")){
            categoriesName.setText(str);
            for(int i=0; i<10; i++){
                ProductModel prod = new ProductModel(R.drawable.ic_trending,"Trending");
                productModelList.add(prod);
            }
        }else if(str.equals("Electronic")){
            categoriesName.setText(str);
            for(int i=0; i<10; i++){
                ProductModel prod = new ProductModel(R.drawable.electronics,"Electronics");
                productModelList.add(prod);
            }
        }
    }
}