package com.crazylegend.imagepicker.contracts

import androidx.activity.result.ActivityResultLauncher
import com.crazylegend.imagepicker.R
import com.crazylegend.imagepicker.adapter.ImagesAdapter
import com.crazylegend.imagepicker.databinding.FragmentGalleryLayoutBinding
import com.crazylegend.imagepicker.images.ImagesVM


/**
 * Created by crazy on 5/8/20 to long live and prosper !
 */
internal interface SinglePickerContracts {
    val imagesVM: ImagesVM
    val binding: FragmentGalleryLayoutBinding?
    val askForStoragePermission: ActivityResultLauncher<String>
    val layout get() = R.layout.fragment_gallery_layout
    val imagesAdapter:ImagesAdapter
}