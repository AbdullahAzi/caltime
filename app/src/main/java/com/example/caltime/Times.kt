package com.example.caltime
import androidx.fragment.app.Fragment
import com.example.caltime.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CalendarView
import android.widget.TextView
import androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance



class SecondFragment : Fragment(R.layout.fragment_times) {
    lateinit var TV: TextView
    lateinit var datee:

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TV = findViewByid (androidx.core.R.id.time)
        datee = Calender.getInstance().getTime()
        TV.setText(datee.toString())

    }
}