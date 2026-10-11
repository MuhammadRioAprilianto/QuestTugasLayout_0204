package com.ktp.questtugaslayout

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
    nama: String,
    nomor: String,
    alamat: String,
    backgroungColor: Color,
    contentColor: Color,
    gambar: ImageVector,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth(1f)
            .clip(RoundedCornerShape(15.dp))
            .padding(15.dp),
        colors = CardDefaults.cardColors(containerColor = Color.Gray)
    ) {

    }
}