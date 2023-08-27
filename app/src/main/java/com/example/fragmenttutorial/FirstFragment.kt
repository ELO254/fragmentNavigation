package com.example.fragmenttutorial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view =  inflater.inflate(R.layout.fragment_first, container, false)
        var buttonfrag : Button = view.findViewById(R.id.firstbutton)
        buttonfrag.setOnClickListener {
            requireFragmentManager().beginTransaction().replace(R.id.fragment_container2,SecondFragment()).commit()

        }
        return view

    }

}