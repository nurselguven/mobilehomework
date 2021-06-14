package com.nursel.mobile_work
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment(R.layout.fragment_home){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_login.onClickListener{
            val action= HomeFragmentDirections.actionHomeFragmentToLoginFragment()
            findNavController().navigate(action)

        }
    }
}



