package com.durbinlabs.motionlayoutexperiment.recycler

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.durbinlabs.motionlayoutexperiment.R

class ViewHolder internal constructor(view: View) : RecyclerView.ViewHolder(view) {
    private val serial: TextView = view.findViewById(R.id.tvSerial)
    private val name: TextView = view.findViewById(R.id.tvTeamName)
    private val flag: ImageView = view.findViewById(R.id.ivTeamFlag)
    private val point: TextView = view.findViewById(R.id.tvPoint)
    private val nrr: TextView = view.findViewById(R.id.tvNrr)
    internal fun bindReport(model: Model) {
        serial.text = model.sl.toString()
        name.text = model.name
        flag.setImageResource(model.flag)
        point.text = model.point.toString()
        nrr.text = model.nrr.toString()
    }
}