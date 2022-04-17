package space.arkady.myapplication.data.models

import com.google.gson.annotations.SerializedName

data class NewsArticle(
    @SerializedName("source")
    val source: NewsSource,
    @SerializedName("author")
    val author: String?,
    @SerializedName("title")
    val title: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("url")
    val articleUrl: String?,
    @SerializedName("urlToImage")
    val urlToImage: String,
    @SerializedName("publishedAt")
    val publishedAt: String,
    @SerializedName("content")
    val content: String?,
)