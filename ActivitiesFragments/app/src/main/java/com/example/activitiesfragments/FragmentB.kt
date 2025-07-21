package com.example.activitiesfragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class FragmentB : Fragment() {
    override fun onAttach(context: Context) {
        super.onAttach(context); Log.d("FragmentB", "onAttach")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState); Log.d("FragmentB", "onCreate")
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d("FragmentB", "onCreateView")
        val view = inflater.inflate(R.layout.fragment_b, container, false)
        view.findViewById<Button>(R.id.btn_back).setOnClickListener {
            (activity as? SecondActivity)?.navigateBack()
        }
        return view
    }
    override fun onStart() {
        super.onStart();
        Log.d("FragmentB", "onStart")
    }
    override fun onResume() {
        super.onResume();
        Log.d("FragmentB", "onResume")
    }
    override fun onPause() {
        super.onPause();
        Log.d("FragmentB", "onPause")
    }
    override fun onStop() {
        super.onStop();
        Log.d("FragmentB", "onStop")
    }
    override fun onDestroyView() {
        super.onDestroyView();
        Log.d("FragmentB", "onDestroyView")
    }
    override fun onDestroy() {
        super.onDestroy();
        Log.d("FragmentB", "onDestroy")
    }
    override fun onDetach() {
        super.onDetach();
        Log.d("FragmentB", "onDetach")
    }
}