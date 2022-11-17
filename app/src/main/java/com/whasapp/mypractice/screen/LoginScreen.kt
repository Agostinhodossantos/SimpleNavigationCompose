package com.whasapp.mypractice.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.whasapp.mypractice.common.DefaultButton
import com.whasapp.mypractice.ui.theme.MyPracticeTheme

@Composable
fun LoginScreen(
    navigateToHome: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Log In", fontSize = 40.sp)

        DefaultButton(
            text = "Log In",
            onClick = navigateToHome
        )
    }
}

@Preview()
@Composable
private fun DefaultPreview() {
    MyPracticeTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            LoginScreen (navigateToHome = {})
        }
    }
}


















