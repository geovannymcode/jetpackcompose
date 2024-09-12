package com.geovannycode.composecourse2024.exercises

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.geovannycode.composecourse2024.previews.MyPreviewDefault

@Composable
fun VisibilityComponent() {

    var isVisible by remember { mutableStateOf(true) }
    Column {
        Button(onClick = { isVisible = !isVisible }) {
            Text(text = "Show/Hide")
        }
        if (isVisible) {
            Text(text = "Compose")
        }
    }
}

@MyPreviewDefault
@Composable
fun VisibilityComponentPreview() {
    VisibilityComponent()
}
