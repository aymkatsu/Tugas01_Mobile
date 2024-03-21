package com.example.tugas01mobile

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas01mobile.ui.theme.Tugas01MobileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tugas01MobileTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText(pengirim = "Wahyu",
                        isi = "Selamat Anda Mendapat Saldo dadakan sebesar 100k",
                        judul ="Pemenang Doorprize" )
                }
            }
        }
    }
}

@Composable
fun GreetingText(pengirim: String, isi: String, judul: String, modifier: Modifier = Modifier) {
  Box(modifier = Modifier
      .fillMaxSize()
      )

  Column (
      verticalArrangement = Arrangement.Top
  ){
Text(
    text =judul,
    fontSize = 55.sp,
    textAlign = TextAlign.Center,
    lineHeight = 80.sp

)
  }
  Column(
      verticalArrangement = Arrangement.Center
  ){
Text(
    text =isi,
    fontSize = 45.sp,
    textAlign = TextAlign.Center,
    lineHeight = 45.sp
)
  }
  Column (
      verticalArrangement = Arrangement.Bottom
  ) {
Text(
    text =pengirim,
    fontSize = 50.sp,
    textAlign = TextAlign.End,
    )

  }
    }
@Composable
fun GreetingImage(pengirim: String, isi: String, judul: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable._5_photos_confirming_that_chihuahuas_love_pink)
    Box(modifier) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
        )
        GreetingText(pengirim = pengirim ,
            isi = isi,
            judul =judul
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tugas01MobileTheme {
      GreetingImage(pengirim = "Wahyu",
          isi = "Selamat Anda Mendapat Saldo dadakan sebesar 100k",
          judul ="Pemenang Doorprize")
    }
}