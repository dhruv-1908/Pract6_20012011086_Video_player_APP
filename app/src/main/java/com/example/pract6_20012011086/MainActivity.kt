package com.example.pract6_20012011086

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import com.example.pract6_20012011086.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initVideoPlayer()
        binding.youtubeButton.setOnClickListener{
            Intent(this,youtubeActivity::class.java).apply {
                startActivity(this)
            }
        }
    }
    private fun initVideoPlayer(){
        var mediaController=MediaController(this)
        var uri:Uri=Uri.parse("android.resource://${packageName}/${R.raw.thestoryoflight}")
        binding.myVideo.setMediaController(mediaController)
        mediaController.setAnchorView(binding.myVideo)
        binding.myVideo.setVideoURI(uri)
        binding.myVideo.requestFocus()
        binding.myVideo.start()
    }
}


