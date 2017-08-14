package com.anmolarora.videodemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = (VideoView) findViewById(R.id.videoView);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.small);// video is chosen
        // (add path of online video in () to stream directly to app)

        MediaController mediaController = new MediaController(this); // buttons for video control
        mediaController.setAnchorView(videoView);//attaching media controller to video view
        videoView.setMediaController(mediaController);//both ways

        videoView.start();
    }
}
