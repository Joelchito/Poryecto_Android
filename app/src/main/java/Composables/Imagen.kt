package Composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ContentScale.Companion
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bannerbutarque.R

@Preview(showSystemUi = true)
@Composable
fun imagen() {
    Image(painter = painterResource(id = R.drawable.banner_yacimiento),
        contentDescription = "imagen", modifier = Modifier
            .padding(10.dp)
            .height(120.dp)
            .clip(RoundedCornerShape(10.dp)),
            contentScale = ContentScale.FillHeight)
}