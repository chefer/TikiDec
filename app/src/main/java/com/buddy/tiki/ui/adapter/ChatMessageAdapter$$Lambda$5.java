package com.buddy.tiki.ui.adapter;

import com.buddy.tiki.model.user.UserChatMessage;
import io.reactivex.functions.Consumer;
import java.lang.invoke.LambdaForm.Hidden;

final /* synthetic */ class ChatMessageAdapter$$Lambda$5 implements Consumer {
    private final ChatMessageAdapter f1688a;
    private final UserChatMessage f1689b;

    private ChatMessageAdapter$$Lambda$5(ChatMessageAdapter chatMessageAdapter, UserChatMessage userChatMessage) {
        this.a = chatMessageAdapter;
        this.b = userChatMessage;
    }

    public static Consumer lambdaFactory$(ChatMessageAdapter chatMessageAdapter, UserChatMessage userChatMessage) {
        return new ChatMessageAdapter$$Lambda$5(chatMessageAdapter, userChatMessage);
    }

    @Hidden
    public void accept(Object obj) {
        this.a.m1009c(this.b, obj);
    }
}
