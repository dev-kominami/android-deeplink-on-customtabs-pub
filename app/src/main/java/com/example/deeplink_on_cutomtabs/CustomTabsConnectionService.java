package com.example.deeplink_on_cutomtabs;

import android.net.Uri;
import android.os.Bundle;

import androidx.browser.customtabs.CustomTabsService;
import androidx.browser.customtabs.CustomTabsSessionToken;

import java.util.List;

// 参考 https://qiita.com/ryo_mm2d/items/fa7790a99db4eeebcbbc
public class CustomTabsConnectionService extends CustomTabsService {
    @Override
    protected boolean warmup(long flags) {
        return false;
    }

    @Override
    protected boolean newSession(CustomTabsSessionToken sessionToken) {
        return true;
    }

    @Override
    protected boolean mayLaunchUrl(CustomTabsSessionToken sessionToken, Uri url, Bundle extras, List<Bundle> otherLikelyBundles) {
        return true;
    }

    @Override
    protected Bundle extraCommand(String commandName, Bundle args) {
        return null;
    }

    @Override
    protected boolean updateVisuals(CustomTabsSessionToken sessionToken, Bundle bundle) {
        return false;
    }

    @Override
    protected boolean requestPostMessageChannel(CustomTabsSessionToken sessionToken, Uri postMessageOrigin) {
        return false;
    }

    @Override
    protected int postMessage(CustomTabsSessionToken sessionToken, String message, Bundle extras) {
        return CustomTabsService.RESULT_FAILURE_DISALLOWED;
    }

    @Override
    protected boolean validateRelationship(CustomTabsSessionToken sessionToken, int relation, Uri origin, Bundle extras) {
        return false;
    }
}
