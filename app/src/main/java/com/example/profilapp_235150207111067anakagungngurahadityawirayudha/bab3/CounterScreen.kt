package com.example.profilapp_235150207111067anakagungngurahadityawirayudha.bab3

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
//@Preview
fun CounterScreen() {
    var count by remember { mutableStateOf(0) }
    Box(modifier = Modifier.fillMaxSize().background(Color.White), contentAlignment = Alignment.Center){
        Column (horizontalAlignment = Alignment.CenterHorizontally){
            Text(
                "Aplikasi Counter Plus Minus",
                style = TextStyle(fontSize = 24.sp), fontWeight = FontWeight.Medium)
            Spacer(modifier = Modifier.height(32.dp))
            Text(
                count.toString(),
                style = TextStyle(fontSize = 20.sp), fontWeight = FontWeight.SemiBold)
            Spacer(modifier = Modifier.height(32.dp))
            Row (horizontalArrangement = Arrangement.spacedBy(16.dp)){
                OutlinedButton (onClick = {
                    if (count>0){
                        count--
                    }
                }) {
                    Text("Dikurangin")
                }
                Button(onClick = {
                    count++
                }) {
                    Text("Ditambahin")
                }
            }
        }
    }
}