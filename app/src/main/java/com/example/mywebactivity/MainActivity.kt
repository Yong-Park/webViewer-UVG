package com.example.mywebactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //webView
        webView.webChromeClient = object : WebViewClient(){

        }

        webView.webViewClient = object : WebViewClient(){

        }

        val settings = webView.settings
            settings.javaScriptEnabled = true
            

    }
}