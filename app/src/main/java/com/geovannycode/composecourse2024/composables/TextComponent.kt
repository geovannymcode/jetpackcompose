package com.geovannycode.composecourse2024.composables

import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.geovannycode.composecourse2024.previews.MyPreviewDefault
import com.geovannycode.composecourse2024.previews.MyPreviewDefaultN10

@Composable
fun TextBasic() {

    //Estado: Value TextField
    //Evento: onValueChange
    //Recomposition

    var valueTextField by remember {
        mutableStateOf("")
    }

    TextField(
        value = valueTextField,
        onValueChange = {
            text -> valueTextField = text
        }
    )
}

@MyPreviewDefault
@MyPreviewDefaultN10
@Composable
fun TextBasicPreview() {
    TextBasic()
}