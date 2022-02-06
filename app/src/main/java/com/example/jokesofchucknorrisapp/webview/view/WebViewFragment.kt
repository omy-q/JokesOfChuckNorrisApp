package com.example.jokesofchucknorrisapp.webview.view

import android.os.Bundle
import android.view.View
import com.example.jokesofchucknorrisapp.base.view.BaseFragment
import com.example.jokesofchucknorrisapp.databinding.FragmentWebviewBinding

class WebViewFragment: BaseFragment<FragmentWebviewBinding>(FragmentWebviewBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        binding.webView.webViewClient = MyWebViewClient()
        binding.webView.loadUrl("https://www.icndb.com/api/")
    }

}