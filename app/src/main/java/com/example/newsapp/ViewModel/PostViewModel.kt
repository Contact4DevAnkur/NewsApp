package com.example.newsapp.ViewModel

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsapp.Repository.PostRepository
import com.example.newsapp.Retrofit.Post
import kotlinx.coroutines.launch


class PostViewModel : ViewModel(){
    private val repository = PostRepository()

    var posts by mutableStateOf<List<Post>>(emptyList())

    init {
        viewModelScope.launch {
            val fetchPost = repository.getPosts()
            posts=fetchPost
        }

    }

}