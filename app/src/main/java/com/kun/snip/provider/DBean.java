package com.kun.snip.provider;

import com.kun.snip.adapter.ProviderMultiAdapter;
import com.kun.snip.adapter.ProviderMultiEntity;

public class DBean extends ProviderMultiEntity {
    @Override
    public int getItemType() {
        return ProviderMultiAdapter.D;
    }
}
