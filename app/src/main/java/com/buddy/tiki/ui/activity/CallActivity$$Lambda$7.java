package com.buddy.tiki.ui.activity;

import android.view.View;
import android.view.View.OnClickListener;
import java.lang.invoke.LambdaForm.Hidden;

final /* synthetic */ class CallActivity$$Lambda$7 implements OnClickListener {
    private final CallActivity f1220a;

    private CallActivity$$Lambda$7(CallActivity callActivity) {
        this.a = callActivity;
    }

    public static OnClickListener lambdaFactory$(CallActivity callActivity) {
        return new CallActivity$$Lambda$7(callActivity);
    }

    @Hidden
    public void onClick(View view) {
        this.a.m624c(view);
    }
}
