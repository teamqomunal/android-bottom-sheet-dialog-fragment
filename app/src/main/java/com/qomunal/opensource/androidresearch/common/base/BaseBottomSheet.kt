package com.qomunal.opensource.androidresearch.common.base

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.qomunal.opensource.androidresearch.R

/**
 * Created by faisalamircs on 04/06/2025
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 */


abstract class BaseBottomSheet<VB : ViewBinding> : BottomSheetDialogFragment() {

    private var _binding: VB? = null

    protected val binding: VB get() = _binding!!

    abstract fun setupViewBinding(inflater: LayoutInflater, container: ViewGroup?): VB

    open fun initUi(savedInstanceState: Bundle?) {}
    open fun initClick() {}
    open fun initObserver() {}

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = setupViewBinding(inflater, container)
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.AppBottomSheetDialogTheme)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUi(savedInstanceState)
        initClick()
        initObserver()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("Cool", "onAttach")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Cool", "onDetach")
    }

}