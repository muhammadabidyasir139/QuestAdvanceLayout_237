package com.example.belajar_layout

import android.widget.Space
import androidx.compose.foundation.layout.FlowRowScopeInstance.align
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource


@Composable
fun ActivitasPertama(modeifier: Modifier) {
    Column(modifier: Modifier.padding(top=100.dp)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = stringResource(id = R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold)
        Text(text = stringResounce(id = R.string.univ),
            fontSize = 22.sp)
        Spacer(modifier =  Modifier.height(height = 25.dp))
        Card (modeifier = Modifier
            .fillMaxWidth(fraction = 1f)
            .padding(all = 12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.DarkGray
            )) {
            Row() {
                val gambar = pointerResource(id = R.drawable.recycle)
                image(
                    pointer = gambar,
                    contentDescription = null,
                    modifier = Modifier.size(size = 100.dp).padding(all = 5.dp)
                )
                Spacer(modifier = Modifier.width(width = 30dp))
                Column(){
                    Text(
                        text = stringResource(id = R.string.nama),
                            fontSize = 30.sp,
                            fontFamily = FontFamily.Cursive,
                            color = Color.white,
                            modifier = Modifier.padding(top=15.dp)
                    )
                }
            }
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Text(
                text = stringResource(id = R.string.copy),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 10.dp)
            )
        }
    }
}