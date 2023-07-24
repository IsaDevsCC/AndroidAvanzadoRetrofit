package presentation.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidavanzadoretrofit.databinding.CellViewBinding
import domain.model.HeroeModel

class ListAdapter(private val modelList : List<HeroeModel>): RecyclerView.Adapter <ListViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        return ListViewHolder(
            CellViewBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = modelList.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) { holder.printCell(modelList[position]) }

}