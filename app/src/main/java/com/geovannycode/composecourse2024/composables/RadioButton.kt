package com.geovannycode.composecourse2024.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import com.geovannycode.composecourse2024.previews.MyPreviewDefault

@Composable
fun RadioButtonComponent() {

    val courseList: List<String> = listOf("Kotlin", "Java", "Python", "iOS")

    //Estado: Curso Seleccionado
    //Evento: onClick
    //Recomposition

    var currentSelection by remember {
        mutableStateOf("Kotlin")
    }
    Column {
        courseList.forEach { course ->
            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(
                    selected = currentSelection == course,
                    onClick = {
                        currentSelection = course
                    },
                    colors = RadioButtonDefaults.colors(
                        selectedColor = Color.Blue,
                        unselectedColor = Color.Red,
                        disabledSelectedColor = Color.Green,
                        disabledUnselectedColor = Color.Magenta
                    ),
                    enabled = true
                )
                Text(
                    text = course,
                )
            }
        }
    }


}

@MyPreviewDefault
@Composable
fun RadioButtonComponentPreview() {
    RadioButtonComponent()
}