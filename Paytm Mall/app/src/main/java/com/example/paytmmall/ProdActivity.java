package com.example.paytmmall;

import android.content.Intent;
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


public class ProdActivity extends Fragment implements OnClickListener {
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

        recyclerView = container.findViewById(R.id.prod_recyclerView);
        categoriesName = container.findViewById(R.id.categoriesName);
        BuildListTrending();
        setRecyclerViewTrending();


        return view;
    }

    private void setRecyclerViewTrending() {
        ProductAdapter adapter = new ProductAdapter(productModelList, this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(gridLayoutManager);
    }

    private void BuildListTrending() {
        String str = SharedPreferenceHelper.getStringPreference(getContext(), "categories");
        if (str.equals("Trending")) {
            categoriesName.setText(str);
            ProductModel mask = new ProductModel(R.drawable.mask, "Mask And Sanitizers");
            productModelList.add(mask);

            ProductModel oximeter = new ProductModel(R.drawable.oximeter, "Pulse Oximeter");
            productModelList.add(oximeter);

            ProductModel electronic = new ProductModel(R.drawable.ic_electronics, "Electronics");
            productModelList.add(electronic);

            ProductModel mobiles = new ProductModel(R.drawable.ic_mobiles, "Mobiles");
            productModelList.add(mobiles);

            ProductModel tablets = new ProductModel(R.drawable.ic_tablets, "Tablets");
            productModelList.add(tablets);

            ProductModel featured = new ProductModel(R.drawable.featured_phones, "Featured Phones");
            productModelList.add(featured);

            ProductModel used = new ProductModel(R.drawable.used_phones, "Used Phones");
            productModelList.add(used);

        } else if (str.equals("Electronic")) {
            categoriesName.setText(str);
            ProductModel headPhone = new ProductModel(R.drawable.headphones, "Over-Ear Headphones");
            productModelList.add(headPhone);

            ProductModel wireless = new ProductModel(R.drawable.wireless, "Truly Wireless");
            productModelList.add(wireless);

            ProductModel bluetooth = new ProductModel(R.drawable.bluetooth, "Bluetooth Earphones");
            productModelList.add(bluetooth);

            ProductModel speakers = new ProductModel(R.drawable.speakers, "Portable Speakers");
            productModelList.add(speakers);

            ProductModel mobiles = new ProductModel(R.drawable.ic_mobiles, "Mobiles");
            productModelList.add(mobiles);

            ProductModel tablets = new ProductModel(R.drawable.ic_tablets, "Tablets");
            productModelList.add(tablets);

            ProductModel featured = new ProductModel(R.drawable.featured_phones, "Featured Phones");
            productModelList.add(featured);

            ProductModel used = new ProductModel(R.drawable.used_phones, "Used Phones");
            productModelList.add(used);

            ProductModel mobileCables = new ProductModel(R.drawable.mobiles_cables, "Mobile Cables");
            productModelList.add(mobileCables);

            ProductModel charger = new ProductModel(R.drawable.charger, "Charger");
            productModelList.add(charger);

            ProductModel screenGuard = new ProductModel(R.drawable.screen_gaurd, "Screen Guard");
            productModelList.add(screenGuard);


        } else if (str.equals("Men Fashion")) {
            categoriesName.setText(str);

            ProductModel tShirt = new ProductModel(R.drawable.t_shirt, "T-Shirt");
            productModelList.add(tShirt);

            ProductModel casualShirt = new ProductModel(R.drawable.casual_shirt, "Casual Shirt");
            productModelList.add(casualShirt);

            ProductModel jakie = new ProductModel(R.drawable.jakie, "Jackets");
            productModelList.add(jakie);

            ProductModel formalShirt = new ProductModel(R.drawable.formal_shirt, "Formal Shirts");
            productModelList.add(formalShirt);


        } else if (str.equals("Women Fashion")) {
            categoriesName.setText(str);
            for (int i = 0; i < 10; i++) {
                ProductModel prod = new ProductModel(R.drawable.womens_fashion, "Women's Fashion");
                productModelList.add(prod);
            }
        } else if (str.equals("Mobile Accessories")) {
            categoriesName.setText(str);
            ProductModel mobiles = new ProductModel(R.drawable.ic_mobiles, "Mobiles");
            productModelList.add(mobiles);

            ProductModel tablets = new ProductModel(R.drawable.ic_tablets, "Tablets");
            productModelList.add(tablets);

            ProductModel featured = new ProductModel(R.drawable.featured_phones, "Featured Phones");
            productModelList.add(featured);

            ProductModel used = new ProductModel(R.drawable.used_phones, "Used Phones");
            productModelList.add(used);

            ProductModel mobileCables = new ProductModel(R.drawable.mobiles_cables, "Mobile Cables");
            productModelList.add(mobileCables);

            ProductModel charger = new ProductModel(R.drawable.charger, "Charger");
            productModelList.add(charger);

            ProductModel screenGuard = new ProductModel(R.drawable.screen_gaurd, "Screen Guard");
            productModelList.add(screenGuard);

        } else if (str.equals("Home kitchen")) {
            categoriesName.setText(str);
            for (int i = 0; i < 10; i++) {
                ProductModel prod = new ProductModel(R.drawable.cooker, "Home & Kitchen");
                productModelList.add(prod);
            }
        } else if (str.equals("Appliance")) {
            categoriesName.setText(str);
            for (int i = 0; i < 10; i++) {
                ProductModel prod = new ProductModel(R.drawable.applience, "Appliance");
                productModelList.add(prod);
            }
        } else if (str.equals("Grocery")) {
            categoriesName.setText(str);
            for (int i = 0; i < 10; i++) {
                ProductModel prod = new ProductModel(R.drawable.grocery, "Grocery");
                productModelList.add(prod);
            }
        } else if (str.equals("Toys Kids")) {
            categoriesName.setText(str);
            for (int i = 0; i < 10; i++) {
                ProductModel prod = new ProductModel(R.drawable.toys, "Toys & Kids");
                productModelList.add(prod);
            }
        }
    }

    @Override
    public void onClick(ProductModel productModel, int position) {

        String str = productModel.getText();
        SharedPreferenceHelper.writeIntegerPreference(getContext(), "prodImg", productModel.getImg());
        SharedPreferenceHelper.writeStringPreference(getContext(), "prodName", productModel.getText());
        Toast.makeText(getContext(), str + "   " + position, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getContext(), ProductViewer_Activity.class);
        startActivity(intent);

    }
}