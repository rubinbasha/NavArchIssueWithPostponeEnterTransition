package rubin.basha.navarchissue.utils

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.Navigator
import androidx.navigation.fragment.findNavController

const val LOG_TAG = "NavArchIssue"

fun Fragment.navigate(navigatorExtras: Navigator.Extras? = null, navDirection: () -> NavDirections) {
    if (navigatorExtras != null) {
        findNavController().navigate(navDirection(), navigatorExtras)
    } else {
        findNavController().navigate(navDirection())
    }
}

fun loge(message: String) {
    Log.e(LOG_TAG, message)
}