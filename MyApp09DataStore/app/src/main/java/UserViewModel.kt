import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class UserViewModel(private val repository: UserPreferencesRepository) : ViewModel() {

    // Čtení uživatelského jména z DataStore jako StateFlow
    val userName: StateFlow<String?> = repository.userNameFlow
        .stateIn(viewModelScope, kotlinx.coroutines.flow.SharingStarted.Lazily, null)

    // Ukládání uživatelského jména
    fun saveUserName(userName: String) {
        viewModelScope.launch {
            repository.saveUserName(userName)
        }
    }
}
