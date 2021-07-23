package com.example.paytmmall;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class ProdActivity extends Fragment implements OnClickListener{
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
        ProductAdapter adapter = new ProductAdapter(productModelList,this);
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
        }else if(str.equals("Men Fashion")){
            categoriesName.setText(str);
            for(int i=0; i<10; i++){
                ProductModel prod = new ProductModel(R.drawable.mens_fashion,"Men's Fashion");
                productModelList.add(prod);
            }
        }else if(str.equals("Women Fashion")){
            categoriesName.setText(str);
            for(int i=0; i<10; i++){
                ProductModel prod = new ProductModel(R.drawable.womens_fashion,"Women's Fashion");
                productModelList.add(prod);
            }
        }else if(str.equals("Mobile")){
            categoriesName.setText(str);
            for(int i=0; i<10; i++){
                ProductModel prod = new ProductModel(R.drawable.ic_mobile,"Mobile Devices");
                productModelList.add(prod);
            }
        }else if(str.equals("Home kitchen")){
            categoriesName.setText(str);
            for(int i=0; i<10; i++){
                ProductModel prod = new ProductModel(R.drawable.cooker,"Home & Kitchen");
                productModelList.add(prod);
            }
        }else if(str.equals("Appliance")){
            categoriesName.setText(str);
            for(int i=0; i<10; i++){
                ProductModel prod = new ProductModel(R.drawable.applience,"Appliance");
                productModelList.add(prod);
            }
        }else if(str.equals("Grocery")){
            categoriesName.setText(str);
            for(int i=0; i<10; i++){
                ProductModel prod = new ProductModel(R.drawable.grocery,"Grocery");
                productModelList.add(prod);
            }
        }else if(str.equals("Toys Kids")){
            categoriesName.setText(str);
            for(int i=0; i<10; i++){
                ProductModel prod = new ProductModel(R.drawable.toys,"Toys & Kids");
                productModelList.add(prod);
            }
        }
    }

    @Override
    public void onClick(ProductModel productModel, int position) {

        String str = productModel.getText();
        Toast.makeText(getContext(), str+"   "+position, Toast.LENGTH_SHORT).show();

    }
}