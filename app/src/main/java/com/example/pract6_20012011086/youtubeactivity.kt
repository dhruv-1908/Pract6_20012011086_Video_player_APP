package com.example.pract6_20012011086

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import com.example.pract6_20012011086.databinding.ActivityYoutubeactivityBinding

class youtubeActivity : AppCompatActivity() {
    private lateinit var binding : ActivityYoutubeactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYoutubeactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initYoutubeVideo()
        binding.backButton.setOnClickListener {
            Intent(this@youtubeActivity,MainActivity::class.java).apply {
                startActivity(this)
            }
        }
    }

    private val youtubeID = "oljycorlyvQ"
    private fun initYoutubeVideo(){
        val webSettings: WebSettings = binding.myWebView.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
        binding.myWebView.loadUrl("https://www.youtube.com/watch?v=oljycorlyvQ")
    }
}

