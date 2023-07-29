package presentation.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.koin.androidx.viewmodel.ext.android.viewModel
import com.example.androidavanzadoretrofit.databinding.FragmentListBinding
import domain.model.HeroeModel


class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding

    private val viewModel: ListViewModel by viewModel()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentListBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setViewModel()
    }

    private fun setViewModel() {
        viewModel.data.observe(viewLifecycleOwner) {
            startFragment(it)
        }
        viewModel.loadHeroes()
    }
    private fun startFragment(data: List<HeroeModel>) = binding.rvContainer.let {
        it.adapter = ListAdapter(data)
    }

}