package com.buddy.tiki.ui.fragment;

import io.reactivex.functions.Consumer;
import java.lang.invoke.LambdaForm.Hidden;

final /* synthetic */ class SettingFragment$$Lambda$6 implements Consumer {
    private final SettingFragment f2210a;

    private SettingFragment$$Lambda$6(SettingFragment settingFragment) {
        this.a = settingFragment;
    }

    public static Consumer lambdaFactory$(SettingFragment settingFragment) {
        return new SettingFragment$$Lambda$6(settingFragment);
    }

    @Hidden
    public void accept(Object obj) {
        this.a.m1407c(obj);
    }
}
