package com.mobdeve.s12.lee.kim.fakemon_exercise

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

internal class FakeamonAdapter(data: ArrayList<PokemonModel>) :
    RecyclerView.Adapter<FakeamonViewHolder>() {
    private val data: ArrayList<PokemonModel>

    init {
        this.data = data
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FakeamonViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.fakeamon_view, parent, false)
        return FakeamonViewHolder(view)
    }

    override fun onBindViewHolder(holder: FakeamonViewHolder, position: Int) {
        holder.setImageView(data[position].imageId)
        holder.setNameTextView(data[position].name)
        holder.setDescTextView(data[position].desc)
        holder.setSpeciesTextView(data[position].specie)
        holder.setLocationTextView(data[position].location)
        holder.deleteButton.setOnClickListener {
            deleteFakeamon(holder, position)
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    private fun deleteFakeamon(holder: FakeamonViewHolder, position: Int) {
        val deletedFakeamon = this.data.removeAt(position)
        notifyItemRemoved(position)
        createDeleteToast(holder, deletedFakeamon)
    }

    private fun createDeleteToast(holder: FakeamonViewHolder, deletedFakeamon: PokemonModel) {
        val fakeamonName = deletedFakeamon.name
        Toast.makeText(
            holder.itemView.context,
            "$fakeamonName has been deleted.",
            Toast.LENGTH_SHORT
        ).show()
    }
}