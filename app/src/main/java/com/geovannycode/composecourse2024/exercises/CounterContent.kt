package com.geovannycode.composecourse2024.exercises

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.geovannycode.composecourse2024.previews.MyPreviewDefault

@Composable
fun CounterContent() {

    //Estado: quantity
    //Evento: onclick +, onclick -

    //var quantity = 0

    var quantity by remember {
        mutableStateOf(0)
    }

    Row(modifier = Modifier
        .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center) {
        Button(onClick = {
            quantity ++
        }) {
            Text(text = "+")
        }
        Text(
            text = "$quantity",
            fontSize = 20.sp,
            modifier = Modifier.padding(horizontal = 8.dp)
        )
        Button(onClick = {
            quantity --
        }) {
            Text(text = "-")
        }
    }
}

@MyPreviewDefault
@Composable
fun CounterContentPreview() {
CounterContent()
}