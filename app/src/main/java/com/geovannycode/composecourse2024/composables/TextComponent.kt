package com.geovannycode.composecourse2024.composables

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
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

    OutlinedTextField(
        value = valueTextField,
        onValueChange = { text ->
            valueTextField = text
        },
        label = {
            Text(text = "Address")
        },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "Address",
                tint = Color.Red
            )
        },
        trailingIcon = {
            Icon(
                imageVector = Icons.Default.Check,
                contentDescription = "Check",
                tint = Color.Blue
            )
        },
        singleLine = true,
        shape = RoundedCornerShape(12.dp),
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = Color.Blue,
            unfocusedBorderColor = Color.Red
        ),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Number,
            autoCorrect = true,
            imeAction = ImeAction.Search
        )
    )
}

@MyPreviewDefault
@MyPreviewDefaultN10
@Composable
fun TextBasicPreview() {
    TextBasic()
}