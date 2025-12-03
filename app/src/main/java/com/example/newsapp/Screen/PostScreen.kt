package com.example.newsapp.Screen

import androidx.compose.runtime.Composable
import com.example.newsapp.ViewModel.PostViewModel


@Composable
fun PostScreen(viewModel: PostViewModel) {
    val posts= viewModel.posts
    PostList(posts)
}

