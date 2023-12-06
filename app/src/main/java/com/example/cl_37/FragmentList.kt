package com.example.cl_37

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.cl_37.databinding.FragmentListBinding


class FragmentList : Fragment() {
    private lateinit var binding: FragmentListBinding
    private val musicList = arrayListOf(
        Music("1", "PHARAOH", "BLACK SIEMENS", "3:16"),
        Music("2", "Santiz", "Забытый Бала", "5:36"),
        Music("3", "ULUKMANAPO", "So Clean So Fresh", "2:16"),
        Music("4", "Akon", "Gringo", "4:34"),
        Music("5", "V $ X V", "MERCEDES", "2:57"),
        Music("6", "PHARAOH", "Не по пути", "2:38"),
        Music("7", "MACAN", "За всех", "1:44"),
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = MusicAdapter(musicList,this::onClick)
        binding.recyclerView.adapter = adapter
    }

    private fun onClick(i: Int) {
       val intent=Intent(requireContext(),SecondActivity::class.java)
    }

}