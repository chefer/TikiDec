package com.buddy.tiki.ui.activity;

import java.lang.invoke.LambdaForm.Hidden;

final /* synthetic */ class CallFriendActivity$$Lambda$19 implements Runnable {
    private final CallFriendActivity f1310a;

    private CallFriendActivity$$Lambda$19(CallFriendActivity callFriendActivity) {
        this.a = callFriendActivity;
    }

    public static Runnable lambdaFactory$(CallFriendActivity callFriendActivity) {
        return new CallFriendActivity$$Lambda$19(callFriendActivity);
    }

    @Hidden
    public void run() {
        this.a.m689t();
    }
}
