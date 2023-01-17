package co.id.jetpackcompose

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .background(Color.Yellow)
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth()
                    .padding(top = 60.dp)
                    .border(5.dp, Color.Green)
            ) {
                Text("Hello")
                Spacer(modifier = Modifier.height(35.dp))
                Text("World")
            }
        }
    }
}