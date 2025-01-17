package com.kun.snip.provider;

import com.kun.snip.adapter.ProviderMultiAdapter;
import com.kun.snip.adapter.ProviderMultiEntity;

public class ABean extends ProviderMultiEntity {

    @Override
    public int getItemType() {
        // 注意，一定要返回对应的type不然 lib找不到
        return ProviderMultiAdapter.A;
    }
}
