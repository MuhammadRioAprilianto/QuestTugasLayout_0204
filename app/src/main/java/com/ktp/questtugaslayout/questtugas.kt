package com.ktp.questtugaslayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun customCard(
    nama: Int,
    nomor: Int,
    alamat: Int,
    gambar: Int,
    modifier: Modifier = Modifier,
    backgroundColor: Int
) {
    val resolvedCardColor = colorResource(id = backgroundColor)
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 6.dp)
            .clip(RoundedCornerShape(15.dp)),
        colors = CardDefaults.cardColors(containerColor = resolvedCardColor)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = gambar),
                contentDescription = null,
                modifier = Modifier
                    .size(50.dp)
                    .padding(5.dp)
            )
            Spacer(modifier = Modifier.width(30.dp))
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Text(
                    text = stringResource(id = nama),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Cursive,
                    color = Color.White,
                    modifier = Modifier.padding(top = 15.dp)
                )
                Text(
                    text = stringResource(id = nomor),
                    fontSize = 12.sp,
                    color = Color.Yellow,
                    modifier = Modifier.padding(top = 10.dp)
                )
                Text(
                    text = stringResource(id = alamat),
                    fontSize = 12.sp,
                    color = Color.Yellow,
                    modifier = Modifier.padding(top = 10.dp)
                )
            }
            Image(
                painter = painterResource(id = gambar),
                contentDescription = null,
                modifier = Modifier
                    .size(50.dp)
                    .padding(5.dp)
            )
        }
    }
}

@Composable
fun mainLayout(modifier: Modifier) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item {
            Text(
                stringResource(R.string.judul),
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Monospace,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
        }
        item {
            Text(
                stringResource(R.string.univ),
                fontSize = 22.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
        }
        item {
            Spacer(modifier = Modifier.height(25.dp))
        }
        item {
            customCard(
                backgroundColor = R.color.navy1,
                nama = R.string.nama1,
                nomor = R.string.nomor1,
                alamat = R.string.alamat1,
                gambar = R.drawable.logoumy
            )
        }
        item {
            customCard(
                backgroundColor = R.color.navy2,
                nama = R.string.nama2,
                nomor = R.string.nomor2,
                alamat = R.string.alamat2,
                gambar = R.drawable.logoumy
            )
        }
        item {
            customCard(
                backgroundColor = R.color.navy3,
                nama = R.string.nama3,
                nomor = R.string.nomor3,
                alamat = R.string.alamat1,
                gambar = R.drawable.logoumy
            )
        }
        item {
            Box(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Text(
                    stringResource(R.string.copy),
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(bottom = 50.dp)
                )
            }
        }
    }
}