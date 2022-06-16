package com.ortmecatronica.appmecatronica.areasFeature.ui.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.ortmecatronica.appmecatronica.R
import com.ortmecatronica.appmecatronica.areasFeature.ui.viewmodel.AreasViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

//@AndroidEntryPoint
class AreasFragment : Fragment() {

    val viewModel : AreasViewModel by viewModel()

    companion object {
        fun newInstance() = AreasFragment()
    }

    override fun onStart() {
        super.onStart()
        viewModel.getAreas()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_areas, container, false)
    }


}