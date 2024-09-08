package com.geovannycode.composecourse2024

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyFirstComposable(name: String) {

    //Option + command + L
    //MyBox()
    MyRows()
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.DarkGray)
        .padding(32.dp)) {
        Text(
            text = "Hola Mundo $name!",
            fontSize = 18.sp,

            )
        Text(
            text = "Empieza la aventura de Valeria!"
        )
        Button(onClick = {}) {
            Text(
                text = "Empezar"
            )
        }
    }

}


@Preview(
    name = "MyFirstComposable",
    showSystemUi = true
)
/*
@Composable
fun MyFirstComposablePreviewPhone() {
    MyFirstComposable(name = "JetPack Compose")
}
*/

/*
@Composable
fun MyBox(){

    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Blue)
        .padding(32.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Hola Mundo!",
            fontSize = 20.sp,
            color = Color.White
        )
    }
}
 */

@Composable
fun MyRows() {
    Row {
        Box(modifier = Modifier
            .width(80.dp)
            .height(80.dp)
            .background(Color.Red))
        Box(modifier = Modifier
            .width(80.dp)
            .height(80.dp)
            .background(Color.Blue))
        Box(modifier = Modifier
            .width(80.dp)
            .height(80.dp)
            .background(Color.Green))
    }
}

/*
@Preview(
    name = "MyFirstComposableTable",
    showSystemUi = true,
    device = Devices.NEXUS_10
)
@Composable
fun MyFirstComposablePreviewTable() {
    MyFirstComposable(name ="JetPack Compose")
}
*/
/*
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeCourse2024Theme {
        Greeting("Android")
    }
}
 */