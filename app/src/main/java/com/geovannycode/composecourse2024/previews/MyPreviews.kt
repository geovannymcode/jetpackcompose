package com.geovannycode.composecourse2024.previews

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.geovannycode.composecourse2024.composables.TextBasic

@Preview(
    name="Preview",
    showSystemUi = true
)
annotation class MyPreviewDefault

@Preview(
    name="Preview",
    showSystemUi = true,
    device = Devices.NEXUS_10
)
annotation class MyPreviewDefaultN10