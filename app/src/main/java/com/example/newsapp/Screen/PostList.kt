package com.example.newsapp.Screen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.newsapp.Retrofit.Post


@Composable
fun PostList(post: List<Post>){
    LazyColumn {
        items(post){
            post -> PostItem(post = post)
        }
    }
}