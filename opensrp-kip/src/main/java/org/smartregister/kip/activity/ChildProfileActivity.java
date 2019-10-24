package org.smartregister.kip.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;

import org.smartregister.child.util.Utils;
import org.smartregister.kip.util.KipUtils;
import org.smartregister.view.activity.BaseProfileActivity;

public class ChildProfileActivity extends BaseProfileActivity {
    @Override
    protected void attachBaseContext(android.content.Context base) {
        // get language from prefs
        String lang = KipUtils.getLanguage(base.getApplicationContext());
        super.attachBaseContext(KipUtils.setAppLocale(base, lang));
    }

    @Override
    public void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        Utils.showToast(this, "In the profile page!!");
    }

    @Override
    protected void onResumption() {
        super.onResumption();
    }

    @Override
    protected void initializePresenter() {
        // Todo
    }

    @Override
    protected ViewPager setupViewPager(ViewPager viewPager) {
        return null;
    }

    @Override
    protected void fetchProfileData() {
        // Todo
    }
}

