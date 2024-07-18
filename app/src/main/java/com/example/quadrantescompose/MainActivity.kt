package com.example.quadrantescompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrantescompose.ui.theme.QuadrantesComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuadrantesComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Quadrantes(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Quadrantes(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxWidth())
    {
        Row(
            modifier = Modifier.weight(1f)
        ) {
            Column(
                modifier = modifier
                    .weight(1f)
                    .fillMaxHeight().background(Color(0xFFEADDFF)),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = "Text composable",
                    modifier = Modifier.padding(16.dp),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Justify
                )
                Text(
                    text = "Displays text and follows the recommended Material Design guidelines.",
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(16.dp)
                )
            }
            Column(
                modifier = modifier
                    .weight(1f)
                    .fillMaxHeight().background(Color(0xFFD0BCFF)),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Image composable",
                    modifier = Modifier.padding(16.dp),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Justify
                )
                Text(
                    text = "Creates a composable that lays out and draws a given Painter class object.",
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
        Row(
            modifier = Modifier.weight(1f)
        ) {
            Column(
                modifier = modifier
                    .weight(1f)
                    .fillMaxHeight().background(Color(0xFFB69DF8)),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Row composable",
                    modifier = Modifier.padding(16.dp),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "A layout composable that places its children in a horizontal sequence.",
                    textAlign = TextAlign.Justify,
                     modifier = Modifier.padding(16.dp)
                )
            }
            Column(
                modifier = modifier
                    .weight(1f)
                    .fillMaxHeight().background(Color(0xFFF6EDFF)),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Column composable",
                    modifier = Modifier.padding(16.dp),
                    fontWeight = FontWeight.Bold

                )
                Text(
                    text = "A layout composable that places its children in a vertical sequence.",
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(16.dp)
                )
            }
        }


    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuadrantesComposeTheme {
        Quadrantes()
    }
}