package com.example.ebay_interview.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ebay_interview.model.Earthquake
import com.example.ebay_interview.R

class EarthAdapter(
    private val list: List<Earthquake>
) : RecyclerView.Adapter<EarthAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EarthAdapter.ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: EarthAdapter.ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount() = list.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val tvId = itemView.findViewById<TextView>(R.id.tvEq)
        private val tvMeg = itemView.findViewById<TextView>(R.id.tvMeg)

        fun bind(earth: Earthquake) {
            tvId.text = earth.eqid
            tvMeg.text = earth.magnitude.toString()
        }

    }
}


