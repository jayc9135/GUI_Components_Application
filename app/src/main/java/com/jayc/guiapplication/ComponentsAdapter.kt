package com.jayc.guiapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ComponentsAdapter(private val dataSet: Array<String>) : RecyclerView.Adapter<ComponentsAdapter.ViewHolder>() {

    private lateinit var  mListener: onItemClickListener

    interface onItemClickListener{
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener){
        mListener = listener
    }


    class ViewHolder(view: View, listener: onItemClickListener) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.component_text)

        init {
            itemView.setOnClickListener{
                listener.onItemClick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ComponentsAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.component_list_item, parent, false)
        return ViewHolder(view, mListener)
    }



    override fun onBindViewHolder(holder: ComponentsAdapter.ViewHolder, position: Int) {
        holder.textView.text = dataSet[position]
    }

    override fun getItemCount() = dataSet.size

}