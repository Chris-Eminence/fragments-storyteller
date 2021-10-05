package com.example.storyteller.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.storyteller.Communicator
import com.example.storyteller.R

class FragmentOne : Fragment() {

    private lateinit var communicator: Communicator

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_one, container, false)
        communicator = activity as Communicator
        val sendBtn : Button = view.findViewById(R.id.sendButton)
        val storyED : EditText = view.findViewById(R.id.story_edit_text)

        sendBtn.setOnClickListener{
            communicator.passDataCom(storyED.text.toString())
        }
        return view
    }
}