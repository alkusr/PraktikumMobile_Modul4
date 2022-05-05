package com.example.teknooo.ui.gallery

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.teknooo.databinding.ActivityGalleryBinding

class GalleryActivity : AppCompatActivity() {
    private var _binding: ActivityGalleryBinding? = null
    private val binding get() = _binding!!

    companion object{
        const val activityImage = "image"
        const val activityJudul = "judul"
        const val activityGenre = "sub"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityGalleryBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val image = binding.gambarActivityGallery
        image.setImageResource(intent.getIntExtra(activityImage, 0))

        val name = binding.judulActivityGallery
        name.text = intent.getStringExtra(activityJudul)

        val date = binding.subActivityGallery
        date.text = intent.getStringExtra(activityGenre)
    }
}