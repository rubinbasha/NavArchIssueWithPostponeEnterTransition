package rubin.basha.navarchissue


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_b.*
import rubin.basha.navarchissue.utils.loge
import rubin.basha.navarchissue.utils.navigate

class FragmentB : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loge("FragmentB onViewCreated")
        clickMeB.setOnClickListener {
            navigate {
                FragmentBDirections.actionFragmentBToFragmentC()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        loge("FragmentB onDestroyView")
    }

}
