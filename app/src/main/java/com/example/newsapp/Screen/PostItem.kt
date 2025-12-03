package com.example.newsapp.Screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newsapp.Retrofit.Post

@Composable
fun PostItem(post: Post){

    Card {
        Column(modifier = Modifier.padding(16.dp)){
            Text(text = post.userId.toString(), style = MaterialTheme.typography.labelLarge)
            Text(text = post.title, style = MaterialTheme.typography.labelLarge)
            Text(text = post.description, style = MaterialTheme.typography.labelLarge)
        }
    }
}


