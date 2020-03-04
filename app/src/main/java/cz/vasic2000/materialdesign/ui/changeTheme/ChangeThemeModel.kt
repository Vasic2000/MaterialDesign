package cz.vasic2000.materialdesign.ui.changeTheme

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ChangeThemeModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Theme Select Fragment"
    }
    val text: LiveData<String> = _text
}