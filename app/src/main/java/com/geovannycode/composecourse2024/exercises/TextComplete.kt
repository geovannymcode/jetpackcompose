package com.geovannycode.composecourse2024.exercises

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.geovannycode.composecourse2024.previews.MyPreviewDefault

@Composable
fun TextComplete(modifier: Modifier = Modifier) {

    //Estado : Text
    //Evento: onValueChange
    //Recomposicion
    var text by remember {
        mutableStateOf("")
    }

    Column {
        MyOutlinedTextField(
            text = text,
            myOnValueChange = {
                text = it
            }
        )
        MyText(
            text = text
        )
    }
}

@Composable
fun MyOutlinedTextField(
    modifier: Modifier = Modifier,
    text: String,
    myOnValueChange:(String)-> Unit
) {

    OutlinedTextField(
        value = text,
        onValueChange = { value ->
            myOnValueChange(value)
        }
    )
}

@Composable
fun MyText(
    modifier: Modifier = Modifier,
    text: String
) {

    Text(text = text)

}

@MyPreviewDefault
@Composable
fun TextCompletePreview() {
    TextComplete()
}