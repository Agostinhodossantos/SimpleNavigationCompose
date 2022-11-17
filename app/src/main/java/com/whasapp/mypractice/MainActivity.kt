package com.whasapp.mypractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.whasapp.mypractice.navigation.NavGraph
import com.whasapp.mypractice.ui.theme.MyPracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyPracticeTheme {
                MainScreen()
            }
        }
    }
}

@Composable
private fun MainScreen() {
    MyPracticeTheme() {
        val navController = rememberNavController()
        NavGraph(navController)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyPracticeTheme {
    }
}















