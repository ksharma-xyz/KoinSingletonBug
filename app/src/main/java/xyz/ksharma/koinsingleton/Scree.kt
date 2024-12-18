package xyz.ksharma.koinsingleton

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController


@Composable
fun HomeScreen(navController: NavHostController) {
    Column {
        Text("Home Screen", modifier = Modifier.padding(16.dp))

        Text("Go to Detail", modifier = Modifier
            .padding(16.dp)
            .clickable {
                navController.navigate(DetailRoute)
            })
    }
}

@Composable
fun DetailScreen(navController: NavHostController) {
    Column {
        Text("Detail Screen", modifier = Modifier.padding(16.dp))

        Text("Go Back", modifier = Modifier
            .padding(16.dp)
            .clickable {
                navController.navigate(HomeRoute)
            })
    }
}
