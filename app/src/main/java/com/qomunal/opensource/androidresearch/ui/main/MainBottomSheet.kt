package com.qomunal.opensource.androidresearch.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import com.qomunal.opensource.androidresearch.common.base.BaseBottomSheet
import com.qomunal.opensource.androidresearch.databinding.BottomSheetMainBinding

/**
 * Created by faisalamircs on 04/06/2025
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 */


class MainBottomSheet : BaseBottomSheet<BottomSheetMainBinding>() {

    override fun setupViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
    ): BottomSheetMainBinding {
        return BottomSheetMainBinding.inflate(layoutInflater)
    }

}