package com.durbinlabs.motionlayoutexperiment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.durbinlabs.motionlayoutexperiment.recycler.Model
import com.durbinlabs.motionlayoutexperiment.recycler.PointTableRecyclerAdapter

class PointTableActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout1)

        val items: ArrayList<Model> = ArrayList()

        items.add(Model(1,R.drawable.australia,"Australia",12,1.0))
        items.add(Model(2,R.drawable.nz,"Newzealand",1,1.0))
        items.add(Model(3,R.drawable.nz,"India",1,1.0))
        items.add(Model(4,R.drawable.bdesh,"Bangladesh",1,1.0))
        items.add(Model(5,R.drawable.pk,"Pakistan",1,1.0))
        items.add(Model(6,R.drawable.england,"England",1,1.0))
        items.add(Model(7,R.drawable.sl,"Srilanka",1,1.0))
        items.add(Model(8,R.drawable.sa,"South Africa",1,1.0))
        items.add(Model(9,R.drawable.nz,"West Indies",1,1.0))
        items.add(Model(10,R.drawable.afghanistan,"Afghanistan",1,1.0))

        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewStatus) ?: return
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = PointTableRecyclerAdapter(items)
    }
}
