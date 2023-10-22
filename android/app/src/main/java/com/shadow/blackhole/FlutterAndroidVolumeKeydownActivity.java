package com.shadow.blackhole;

import static android.view.KeyEvent.KEYCODE_VOLUME_DOWN;
import static android.view.KeyEvent.KEYCODE_VOLUME_UP;

import static dev.darttools.flutter_android_volume_keydown.FlutterAndroidVolumeKeydownPlugin.eventSink;
import com.ryanheise.audioservice.AudioServiceActivity;
import android.view.KeyEvent;

import java.io.Console;

import io.flutter.embedding.android.FlutterActivity;

public class FlutterAndroidVolumeKeydownActivity extends AudioServiceActivity {
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KEYCODE_VOLUME_DOWN && eventSink != null) {
            eventSink.success(true);
            return true;
        }
        if(keyCode == KEYCODE_VOLUME_UP && eventSink != null) {
            eventSink.success(false);
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
