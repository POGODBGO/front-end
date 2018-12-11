package com.team.dbgo

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

class SurrGymViewHolder(itemView : View?) : RecyclerView.ViewHolder(itemView!!) {
    var surr_gym_name : TextView = itemView!!.findViewById(R.id.surr_gym_name) as TextView
}