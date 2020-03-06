package cz.vasic2000.materialdesign.ui.changeTheme

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import cz.vasic2000.materialdesign.R

class ChangeThemeFragment : Fragment() {

    private lateinit var changeThemeModel: ChangeThemeModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        changeThemeModel =
                ViewModelProvider(this).get(ChangeThemeModel::class.java)
        val root = inflater.inflate(R.layout.fragment_changetheme, container, false)
        val textView: TextView = root.findViewById(R.id.text_theme_change)
        changeThemeModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
