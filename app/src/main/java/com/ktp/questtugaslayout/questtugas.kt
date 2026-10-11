package com.ktp.questtugaslayout

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun customCard(
    nama: Int,
    nomor: Int,
    alamat: Int,
    gambar: Int,
    modifier: Modifier = Modifier,
    backgroungColor: Color = Color.DarkGray
) {
    Card(
        modifier = modifier
            .fillMaxWidth(1f)
            .clip(RoundedCornerShape(15.dp))
            .padding(15.dp),
        colors = CardDefaults.cardColors(containerColor = Color.Gray)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(5.dp)
                .
        ) { }
    }
}