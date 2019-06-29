
package com.durbinlabs.motionlayoutexperiment.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.durbinlabs.motionlayoutexperiment.R

class PointTableRecyclerAdapter(val models: ArrayList<Model>): RecyclerView.Adapter<ViewHolder>()
{

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {


        val inflatedView = parent.inflate(R.layout.recycler_item, false)
        return ViewHolder(inflatedView)
    }

    override fun getItemCount(): Int =models.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindReport(models[position])
    }

    fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
        return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
    }
}