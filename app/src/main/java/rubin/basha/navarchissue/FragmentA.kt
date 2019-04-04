package rubin.basha.navarchissue


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_a.*
import rubin.basha.navarchissue.utils.loge
import rubin.basha.navarchissue.utils.navigate

class FragmentA : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loge("FragmentA onViewCreated")
        clickMeA.setOnClickListener {
            navigate {
                FragmentADirections.actionFragmentAToFragmentB()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        loge("FragmentA onDestroyView")
    }

}
