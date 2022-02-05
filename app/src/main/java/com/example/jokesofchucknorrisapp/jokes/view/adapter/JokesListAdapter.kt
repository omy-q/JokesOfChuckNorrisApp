package com.example.jokesofchucknorrisapp.jokes.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.jokesofchucknorrisapp.databinding.ItemRecyclerViewJokeBinding
import com.example.jokesofchucknorrisapp.jokes.data.Joke

class JokesListAdapter : ListAdapter<Joke, JokeViewHolder>(JokeDiffUtilCallback) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JokeViewHolder {
        return JokeViewHolder(
            ItemRecyclerViewJokeBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: JokeViewHolder, position: Int) {
        holder.bind(currentList[position].jokeName)
    }

}