package com.example.m3u8

import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.devbrackets.android.exomedia.listener.OnPreparedListener
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), OnPreparedListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupVideoView()
    }

    private fun setupVideoView() {
        // Make sure to use the correct VideoView import
        video_view.setOnPreparedListener(this)

        //For now we just picked an arbitrary item to play
        video_view.setVideoURI(Uri.parse("https://s3.amazonaws.com/shiftone-video-test/video/index.m3u8"))
    }

    override fun onPrepared() {
        video_view.start()
    }

}
