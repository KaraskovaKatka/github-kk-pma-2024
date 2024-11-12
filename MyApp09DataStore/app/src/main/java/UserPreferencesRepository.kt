import android.content.Context
import androidx.datastore.preferences.core.edit
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class UserPreferencesRepository(private val context: Context) {
    private val userNameKey = UserPreferencesKeys.USER_NAME

    // Funkce pro uložení uživatelského jména
    suspend fun saveUserName(userName: String) {
        context.dataStore.edit { preferences ->
            preferences[userNameKey] = userName
        }
    }

    // Funkce pro získání uživatelského jména
    val userNameFlow: Flow<String?> = context.dataStore.data
        .map { preferences ->
            preferences[userNameKey]
        }
}
