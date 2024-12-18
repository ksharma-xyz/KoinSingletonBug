package xyz.ksharma.koinsingleton

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import xyz.ksharma.koinsingleton.ui.theme.KoinSingletonBugTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            KoinSingletonBugTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = HomeRoute,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    ) {
                        composable<HomeRoute> {
                            val viewmodel by viewModels<HomeViewModel>()
                            LaunchedEffect(Unit) { viewmodel.doWork() }
                            HomeScreen(navController)
                        }
                        composable<DetailRoute> {
                            val viewmodel by viewModels<DetailViewModel>()
                            LaunchedEffect(Unit) { viewmodel.doWork() }
                            DetailScreen(navController)
                        }
                    }
                }
            }
        }
    }
}
