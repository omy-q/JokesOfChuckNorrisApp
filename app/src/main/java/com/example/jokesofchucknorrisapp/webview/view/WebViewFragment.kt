package com.example.jokesofchucknorrisapp.webview.view

import android.os.Bundle
import android.view.View
import com.example.jokesofchucknorrisapp.base.view.BaseFragment
import com.example.jokesofchucknorrisapp.databinding.FragmentWebviewBinding

class WebViewFragment : BaseFragment<FragmentWebviewBinding>(FragmentWebviewBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView(savedInstanceState)
    }

    private fun initView(savedInstanceState: Bundle?) {
        with(binding.webView) {
            webViewClient = MyWebViewClient()
            if (savedInstanceState != null) {
                restoreState(savedInstanceState)
            } else {
                loadUrl("http://www.icndb.com/api/")
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        binding.webView.saveState(outState)
        super.onSaveInstanceState(outState)
    }

}