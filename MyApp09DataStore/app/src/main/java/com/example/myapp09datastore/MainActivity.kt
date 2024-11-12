import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.example.myapp09datastore.R
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private val viewModel: UserViewModel by viewModels {
        UserViewModelFactory(UserPreferencesRepository(applicationContext))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextUserName = findViewById<EditText>(R.id.edit_text_user_name)
        val buttonSave = findViewById<Button>(R.id.button_save)
        val textViewUserName = findViewById<TextView>(R.id.text_view_user_name)

        lifecycleScope.launchWhenStarted {
            viewModel.userName.collect { userName ->
                textViewUserName.text = userName ?: "Your name will appear here"
            }
        }

        buttonSave.setOnClickListener {
            val userName = editTextUserName.text.toString()
            viewModel.saveUserName(userName)
        }
    }
}

class UserViewModelFactory(userPreferencesRepository: UserPreferencesRepository) :
    ViewModelProvider.Factory {

}
