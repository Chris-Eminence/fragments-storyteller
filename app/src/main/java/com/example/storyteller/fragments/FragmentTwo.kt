package com.example.storyteller.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.storyteller.R


class FragmentTwo : Fragment() {

    var displayMessage : String =""
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_two, container,false)
        val messageView : TextView = view.findViewById(R.id.goal_textView)

        displayMessage = arguments?.getString("message").toString()

        messageView.text = displayMessage
        return view
    }
}