package com.example.cl_37


import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cl_37.databinding.ItemMusicBinding

class MusicAdapter(
    private var musicList: ArrayList<Music>,
    private val onClick: (position: Int) -> Unit
) : RecyclerView.Adapter<MusicAdapter.MusicViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        return MusicViewHolder(
            ItemMusicBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount() = musicList.size

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        holder.bind(musicList[position])
            val musicName = musicList[position].name
            val intent = Intent(holder.itemView.context, SecondActivity::class.java)
            intent.putExtra("musicName", musicName)
            holder.itemView.context.startActivity(intent)
        }
    }

    inner class MusicViewHolder(private var binding: ItemMusicBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Music) {
            itemView.setOnClickListener { onClick() }
            binding.run {
                number.text = item.number
                musicLength.text = item.timer
                musicName.text = item.name
                musicSinger.text = item.singer
            }
        }
    }
}