package com.example.mywebactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val BASE_URL = "https://google.com"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //webView
        webView.webChromeClient = object : WebChromeClient(){

        }

        webView.webViewClient = object : WebViewClient(){

        }

        val settings = webView.settings
            settings.javaScriptEnabled = true
            webView.loadUrl(BASE_URL)


    }

    override fun onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack()
        }else{
            super.onBackPressed()
        }
    }
}