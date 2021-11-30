package com.geektech.month3_android1_homework7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.geektech.month3_android1_homework7.databinding.ActivityMainBinding;

import java.util.ArrayList;

import model.model;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_favorite, R.id.navigation_person).build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.bottomNavigation, navController);
        ArrayList<model> models = new ArrayList<>();
        models.add(new model(R.drawable.ic_person,"joshua_l The game in Japan was amazing and I want to share some photos"));
        models.add(new model(R.drawable.ic_lenta,"joshua_l The game in Japan was amazing and I want to share some photos"));
        models.add(new model(R.drawable.ic_lenta,"joshua_l The game in Japan was amazing and I want to share some photos"));
        models.add(new model(R.drawable.ic_lenta,"joshua_l The game in Japan was amazing and I want to share some photos"));
        models.add(new model(R.drawable.ic_lenta,"joshua_l The game in Japan was amazing and I want to share some photos"));
        Adapter adapter =new Adapter(models);
        binding.rvHome.setAdapter(adapter);

    }
}