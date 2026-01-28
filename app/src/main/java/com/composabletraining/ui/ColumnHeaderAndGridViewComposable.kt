package com.composabletraining.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ColumnHeaderAndGridViewComposable(
    content : @Composable () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxSize()
    ) {
        content()
    }
}

@Preview(showBackground = true)
@Composable
fun ColumnHeaderAndGridViewComposablePreview() {
    ColumnHeaderAndGridViewComposable() {
        Column(modifier =
            Modifier
                .fillMaxSize()
                .padding(16.dp)) {
            Text(
                text = "Version 1",
                style = TextStyle.Default,
                modifier = Modifier
                    .padding(16.dp)
                    .background(Color.Yellow)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Version 2 : background puis padding
            Text(
                text = "Version 2",
                modifier = Modifier
                    .background(Color.Yellow)
                    .padding(16.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Version 3 : combinaison complexe
            Text(
                text = "Version 3",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Blue)
                    .padding(16.dp)
                    .background(Color.Yellow)
                    .padding(8.dp)
                    .border(2.dp, Color.Red)
            )
        }
    }
}