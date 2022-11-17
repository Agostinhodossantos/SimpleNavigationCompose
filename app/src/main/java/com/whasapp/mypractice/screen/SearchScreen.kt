package com.whasapp.mypractice.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.whasapp.mypractice.common.DefaultButton
import com.whasapp.mypractice.ui.theme.MyPracticeTheme

@Composable
fun SearchScreen(
    query: String?,
    popBackStack: () -> Unit,
    popUpToLogin: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Search Screen", fontSize = 20.sp)

        Spacer(modifier = Modifier.height(5.dp))
        Text("Query: $query", fontSize = 40.sp)

        DefaultButton(
            text = "Back",
            onClick = popBackStack
        )

        DefaultButton(
            text = "Log Out",
            onClick = popUpToLogin
        )

    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    MyPracticeTheme() {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            SearchScreen(
                query = "liang moi",
                popBackStack = {},
                popUpToLogin = {}
            )
        }
    }
}
