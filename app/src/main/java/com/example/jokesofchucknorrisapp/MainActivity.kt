package com.example.jokesofchucknorrisapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.jokesofchucknorrisapp.databinding.ActivityMainBinding
import com.example.jokesofchucknorrisapp.jokes.view.JokesFragment
import com.example.jokesofchucknorrisapp.webview.view.WebViewFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initNavigationListener()
    }

    private fun initNavigationListener() {
        binding.bottomNavigationView.setOnItemSelectedListener { itemMenu ->
            when (itemMenu.itemId) {
                R.id.jokes_screen -> {
                    transferToFragment(R.id.screen_container, JokesFragment())
                    true
                }
                R.id.webview_screen -> {
                    transferToFragment(R.id.screen_container, WebViewFragment())
                    true
                }
                else -> false
            }
        }
    }

    private fun transferToFragment(fragmentId: Int, fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(fragmentId, fragment)
            .commit()
    }
}