import android.content.Context
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore

// Inicializace DataStore
val Context.dataStore by preferencesDataStore(name = "user_prefs")

// Klíče pro ukládání hodnot
object UserPreferencesKeys {
    val USER_NAME = stringPreferencesKey("user_name")
}
