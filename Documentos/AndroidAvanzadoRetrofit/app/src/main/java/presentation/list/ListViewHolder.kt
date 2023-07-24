package presentation.list

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.androidavanzadoretrofit.databinding.CellViewBinding
import domain.model.HeroeModel

class ListViewHolder(private val binding : CellViewBinding) : RecyclerView.ViewHolder(binding.root){

    fun printCell(heroeModel: HeroeModel) = binding.let {
        it.tvName.text = heroeModel.name
        Glide.with(it.root)
            .load(heroeModel.photo)
            .into(it.ivPhoto)
    }

}