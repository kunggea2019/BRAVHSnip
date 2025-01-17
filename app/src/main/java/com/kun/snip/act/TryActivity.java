package com.kun.snip.act;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.kun.snip.R;
import com.kun.snip.adapter.ProviderMultiAdapter;
import com.kun.snip.adapter.ProviderMultiEntity;
import com.kun.snip.databinding.ActivityTryBinding;
import com.kun.snip.provider.ABean;
import com.kun.snip.provider.BBean;
import com.kun.snip.provider.CBean;
import com.kun.snip.provider.DBean;

import java.util.ArrayList;
import java.util.List;

public class TryActivity extends AppCompatActivity {

    private ActivityTryBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initRV();


    }

    private void initRV() {

        List<ProviderMultiEntity> list = new ArrayList<>();

        // 不同类型的beans
        list.add(new DBean());
        list.add(new ABean());
        list.add(new BBean());
        list.add(new CBean());

        list.add(new ABean());
        list.add(new ABean());
        list.add(new DBean());
        list.add(new BBean());
        list.add(new CBean());
        list.add(new BBean());
        list.add(new DBean());
        list.add(new ABean());
        list.add(new CBean());

        list.add(new BBean());
        list.add(new BBean());
        list.add(new DBean());
        list.add(new DBean());
        list.add(new BBean());
        list.add(new BBean());
        list.add(new CBean());
        list.add(new BBean());
        list.add(new BBean());


        ProviderMultiAdapter adapter = new ProviderMultiAdapter(new ArrayList<>());

        binding.rv.setLayoutManager(new LinearLayoutManager(this));
        binding.rv.setAdapter(adapter);


        adapter.addData(list);


    }


}