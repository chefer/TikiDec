package com.buddy.tiki.ui.activity;

import com.buddy.tiki.ui.activity.WebBrowserActivity.C04471;
import io.reactivex.functions.Consumer;
import java.lang.invoke.LambdaForm.Hidden;

final /* synthetic */ class WebBrowserActivity$1$$Lambda$2 implements Consumer {
    private final C04471 f1590a;

    private WebBrowserActivity$1$$Lambda$2(C04471 c04471) {
        this.a = c04471;
    }

    public static Consumer lambdaFactory$(C04471 c04471) {
        return new WebBrowserActivity$1$$Lambda$2(c04471);
    }

    @Hidden
    public void accept(Object obj) {
        this.a.m933a((Throwable) obj);
    }
}
