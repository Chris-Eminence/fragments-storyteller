package com.example.storyteller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.storyteller.fragments.FragmentOne
import com.example.storyteller.fragments.FragmentTwo

class MainActivity : AppCompatActivity(), Communicator{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentOne = FragmentOne()
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragmentOne).commit()

    }

    override fun passDataCom(editTextInput: String) {
        val bundle = Bundle()
        bundle.putString("message", editTextInput)

        val transaction = this.supportFragmentManager.beginTransaction()
        val fragmentTwo = FragmentTwo()

        fragmentTwo.arguments = bundle

        transaction.replace(R.id.fragment_container, fragmentTwo)
        transaction.commit()

    }
}