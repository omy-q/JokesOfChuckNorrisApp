package com.example.jokesofchucknorrisapp.jokes.view.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.jokesofchucknorrisapp.databinding.ItemRecyclerViewJokeBinding

class JokeViewHolder(
    private val binding: ItemRecyclerViewJokeBinding
): RecyclerView.ViewHolder(binding.root) {
    fun bind(joke: String){
        binding.textViewJoke.text = joke
    }
}