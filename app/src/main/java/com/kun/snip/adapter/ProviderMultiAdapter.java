package com.kun.snip.adapter;

import androidx.annotation.NonNull;

import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.kun.snip.provider.ABean;
import com.kun.snip.provider.AItemProvider;
import com.kun.snip.provider.BBean;
import com.kun.snip.provider.BItemProvider;
import com.kun.snip.provider.CBean;
import com.kun.snip.provider.CItemProvider;
import com.kun.snip.provider.DBean;
import com.kun.snip.provider.DItemProvider;

import java.util.List;

public class ProviderMultiAdapter extends BaseProviderMultiAdapter<ProviderMultiEntity> {
    public static final int A = 0;
    public static final int B = 1;
    public static final int C = 2;
    public static final int D = 3;

    public ProviderMultiAdapter(List<ProviderMultiEntity> data) {
        super(data);

        // 注册 Provider
        addItemProvider(new AItemProvider());
        addItemProvider(new BItemProvider());
        addItemProvider(new CItemProvider());
        addItemProvider(new DItemProvider());
    }

    @Override
    protected int getItemType(@NonNull List<? extends ProviderMultiEntity> list, int position) {

        if (getItem(position) instanceof ABean) {
            return A;
        } else if (getItem(position) instanceof BBean) {
            return B;
        } else if (getItem(position) instanceof CBean) {
            return C;
        } else if (getItem(position) instanceof DBean) {
            return D;
        }
        return -1;
    }


}
