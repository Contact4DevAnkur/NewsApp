package com.example.newsapp.Repository

import com.example.newsapp.Retrofit.Post
import com.example.newsapp.Retrofit.RetrofitInstance

class PostRepository{
     private val apiService = RetrofitInstance.api

     suspend fun getPosts(): List<Post> {
         return apiService.getPosts()
     }
 }
