package com.example.jokesofchucknorrisapp.jokes.view

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.jokesofchucknorrisapp.base.view.BaseFragment
import com.example.jokesofchucknorrisapp.databinding.FragmentJokesBinding
import com.example.jokesofchucknorrisapp.jokes.data.Joke
import com.example.jokesofchucknorrisapp.jokes.model.JokesModelImplementation
import com.example.jokesofchucknorrisapp.jokes.presenter.JokesPresenter
import com.example.jokesofchucknorrisapp.jokes.view.adapter.JokesListAdapter
import com.example.jokesofchucknorrisapp.remote.ApiHolder
import moxy.ktx.moxyPresenter

class JokesFragment : BaseFragment<FragmentJokesBinding>(FragmentJokesBinding::inflate), JokesView {

    private val presenter by moxyPresenter {
        JokesPresenter(JokesModelImplementation(ApiHolder.retrofitService))
    }
    private val adapter by lazy {
        JokesListAdapter()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initBtnListener()
        initRecyclerView()
    }

    private fun initBtnListener() {
        binding.btnReload.setOnClickListener {
            val count = (binding.editTextJokesCount.text.toString()).toInt()
            presenter.getData(count)
        }
    }

    private fun initRecyclerView() {
        with(binding) {
            recyclerListJokes.layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            recyclerListJokes.adapter = adapter
        }
    }

    override fun showJokes(jokes: List<Joke>) {
       adapter.submitList(jokes)
    }

    override fun showLoading() {
        binding.recyclerListJokes.isVisible = false
        binding.loading.isVisible = true
    }

    override fun hideLoading() {
        binding.recyclerListJokes.isVisible = true
        binding.loading.isVisible = false
    }

    override fun showError(error: String) {
        Toast.makeText(context, error, Toast.LENGTH_LONG).show()
    }
}
