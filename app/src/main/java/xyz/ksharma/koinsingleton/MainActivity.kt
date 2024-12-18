package xyz.ksharma.koinsingleton

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import org.koin.android.ext.koin.androidContext
import org.koin.compose.KoinApplication
import org.koin.dsl.koinConfiguration
import xyz.ksharma.koinsingleton.ui.theme.KoinSingletonBugTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KoinApplication(application = koinConfig) {
                KoinSingletonBugTheme {
                    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                        Text(text = "Hello World!", modifier = Modifier.padding(innerPadding))
                    }
                }
            }
        }
    }
}

val koinConfig = koinConfiguration {
    modules(repoModule)
    androidContext(MainApplication.instance ?: error("No Android application context set"))
}
