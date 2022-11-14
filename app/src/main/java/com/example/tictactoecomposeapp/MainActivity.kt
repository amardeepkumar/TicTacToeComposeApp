package com.example.tictactoecomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tictactoecomposeapp.ui.theme.TicTacToeComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TicTacToeComposeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TicTacToeUi()
                }
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun TicTacToePreview() {
    TicTacToeUi()
}

@Composable
fun ButtonWithState(m: Modifier) {
    var result by remember {
        mutableStateOf("")
    }
    Button(onClick = { result = if (result == "X") "" else "X" }, modifier = m) {
        Text(text = result, fontSize = 100.sp)
    }
}

@Composable
fun TicTacToeUi() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        verticalArrangement = Arrangement.spacedBy(
            space = 10.dp,
            alignment = Alignment.CenterVertically
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            horizontalArrangement = Arrangement.spacedBy(
                10.dp,
                alignment = Alignment.CenterHorizontally
            )
        ) {
            ButtonWithState(
                m = Modifier
                    .fillMaxSize()
                    .weight(1f, fill = true)
            )
            ButtonWithState(
                m = Modifier
                    .fillMaxSize()
                    .weight(1f, fill = true)
            )
            ButtonWithState(
                m = Modifier
                    .fillMaxSize()
                    .weight(1f, fill = true)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            horizontalArrangement = Arrangement.spacedBy(
                10.dp,
                alignment = Alignment.CenterHorizontally
            )
        ) {
            ButtonWithState(
                m = Modifier
                    .fillMaxSize()
                    .weight(1f, fill = true)
            )
            ButtonWithState(
                m = Modifier
                    .fillMaxSize()
                    .weight(1f, fill = true)
            )
            ButtonWithState(
                m = Modifier
                    .fillMaxSize()
                    .weight(1f, fill = true)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            horizontalArrangement = Arrangement.spacedBy(
                10.dp,
                alignment = Alignment.CenterHorizontally
            )
        ) {
            ButtonWithState(
                m = Modifier
                    .fillMaxSize()
                    .weight(1f, fill = true)
            )
            ButtonWithState(
                m = Modifier
                    .fillMaxSize()
                    .weight(1f, fill = true)
            )
            ButtonWithState(
                m = Modifier
                    .fillMaxSize()
                    .weight(1f, fill = true)
            )
        }
    }
}