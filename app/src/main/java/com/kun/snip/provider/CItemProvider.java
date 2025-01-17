package com.kun.snip.provider;

import android.graphics.Color;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.kun.snip.R;
import com.kun.snip.adapter.ProviderMultiAdapter;
import com.kun.snip.adapter.ProviderMultiEntity;

public class CItemProvider extends BaseItemProvider<ProviderMultiEntity> {

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return super.onCreateViewHolder(parent, viewType);
    }

    @Override
    public int getItemViewType() {
        return ProviderMultiAdapter.C;
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_c;
    }

    @Override
    public void convert(@NonNull BaseViewHolder helper, ProviderMultiEntity providerMultiEntity) {
        helper.setText(R.id.tv_title, "CCCCCCCCCCCCCCCCCCCCC");

        helper.setTextColor(R.id.tv_title, Color.RED);



    }
}
