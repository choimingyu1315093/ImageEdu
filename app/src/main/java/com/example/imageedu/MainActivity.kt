package com.example.imageedu

import android.graphics.ColorMatrix
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.imageedu.ui.theme.ImageEduTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ImageEduTheme {

            }
        }
    }
}

@Composable
fun DrawableImage(modifier: Modifier = Modifier){
    Image(
        painter = painterResource(R.drawable.imagecover),
        contentDescription = "Drawable Image Example",
        contentScale = ContentScale.Crop,
        modifier = modifier
            .size(300.dp)
            .clip(RoundedCornerShape(16.dp))
            .border(BorderStroke(2.dp, Color.Red), RoundedCornerShape(16.dp)),
    )
}

@Composable
fun BitmapImage(modifier: Modifier = Modifier){
    Image(
        bitmap = ImageBitmap.imageResource(R.drawable.imagecover),
        contentDescription = "Bitmap Image",
        modifier = modifier.size(200.dp)
    )
}

@Composable
fun VectorImage(modifier: Modifier = Modifier){
    Image(
        imageVector = ImageVector.vectorResource(R.drawable.imagecover),
        contentDescription = "Vector Image",
        modifier = modifier.size(200.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ImageEduTheme {
        Surface (
            modifier = Modifier.fillMaxSize()
        ){
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ){
                DrawableImage()
            }
        }
    }
}