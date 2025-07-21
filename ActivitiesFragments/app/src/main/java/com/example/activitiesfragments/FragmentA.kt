package com.example.activitiesfragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class FragmentA : Fragment(R.layout.fragment_a) {
    override fun onAttach(context: Context) {
        super.onAttach(context); Log.d("FragmentA", "onAttach")
    }
    override fun onCreate(savedInstanceState: Bundle?)
    { super.onCreate(savedInstanceState);
        Log.d("FragmentA", "onCreate")
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d("FragmentA", "onCreateView")
        val view = inflater.inflate(R.layout.fragment_a, container, false)
        view.findViewById<Button>(R.id.btn_to_second_activity).setOnClickListener {
            (activity as? MainActivity)?.navigateToSecondActivity()
        }
        return view
    }
    override fun onStart() {
        super.onStart();
        Log.d("FragmentA", "onStart")
    }
    override fun onResume() {
        super.onResume();
        Log.d("FragmentA", "onResume")
    }
    override fun onPause() {
        super.onPause();
        Log.d("FragmentA", "onPause")
    }
    override fun onStop() {
        super.onStop();
        Log.d("FragmentA", "onStop")
    }
    override fun onDestroyView() {
        super.onDestroyView();
        Log.d("FragmentA", "onDestroyView")
    }
    override fun onDestroy() {
        super.onDestroy();
        Log.d("FragmentA", "onDestroy")
    }
    override fun onDetach() {
        super.onDetach();
        Log.d("FragmentA", "onDetach")
    }
}