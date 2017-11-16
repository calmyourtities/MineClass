package com.dannyyyy.mineclass;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import static android.os.SystemClock.sleep;

public class ChatActivity extends AppCompatActivity {

    Thread introThread = new Thread(new Runnable() {
        @Override
        public void run() {
            sleep(2000);
            addMessage();
        }
    });

    LinearLayout chatContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        chatContainer = (LinearLayout) findViewById(R.id.chat_bubbles);
        addMessage();

        //introThread.start();
        //TODO make this an intro chat activity
    }

    public void addMessage(/*ChatView cv*/) {
        //TODO
        ChatView cv = new ChatView(getApplicationContext(), null);
        cv = new ChatView(getApplicationContext(), null);
        cv.setText("What's up?");
        cv.setSide(ChatView.SIDES.RIGHT);
        chatContainer.addView(cv);
    }
}
