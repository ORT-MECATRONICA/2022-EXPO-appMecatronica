package com.ortmecatronica.appmecatronica.areasFeature.ui.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ortmecatronica.appmecatronica.R
import com.ortmecatronica.appmecatronica.areasFeature.ui.viewmodel.AreasViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AreasFragment : Fragment() {

    companion object {
        fun newInstance() = AreasFragment()
    }

    private lateinit var viewModel: AreasViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_areas, container, false)
    }


}