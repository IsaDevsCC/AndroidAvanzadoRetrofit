package presentation.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidavanzadoretrofit.R
import com.example.androidavanzadoretrofit.databinding.CellViewBinding
import com.example.androidavanzadoretrofit.databinding.FragmentListBinding
import domain.model.HeroeModel
import domain.model.entity


class ListFragment : Fragment() {

    private  lateinit var binding : FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentListBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        startFragment()
    }

    private fun startFragment() = binding.rvContainer.let {
        val list = List(25) {
            entity()
       }

        it.adapter = ListAdapter(list)
    }
}