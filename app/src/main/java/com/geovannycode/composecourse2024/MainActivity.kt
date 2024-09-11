package com.geovannycode.composecourse2024

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.geovannycode.composecourse2024.composables.TextBasic
import com.geovannycode.composecourse2024.exercises.CardPresentation
import com.geovannycode.composecourse2024.exercises.CounterContent
import com.geovannycode.composecourse2024.ui.theme.ComposeCourse2024Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            //CounterContent()
            TextBasic()
           /* Box(modifier = Modifier.fillMaxSize().padding(16.dp),
                contentAlignment = Alignment.Center) {
                CardPresentation(name = "Geovanny Mendoza",
                    email = "gmendoza@gmail.com",
                    image = R.drawable.avatar)
            }*/
           // MyFirstComposable(name = "JetPack Compose")
            /*ComposeCourse2024Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
             */
        }
    }
}
