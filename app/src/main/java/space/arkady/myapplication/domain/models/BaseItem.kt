package space.arkady.myapplication.domain.models

sealed class BaseItem

data class Date(
    val dateNews: String
) : BaseItem()

data class News(
    val author: String?,
    val title: String?,
    val description: String?,
    val articleUrl: String?,
    val content: String?,
    val idNews: String?,
    val nameNews: String?
) : BaseItem()
