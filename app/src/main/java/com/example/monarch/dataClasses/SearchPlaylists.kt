package com.example.monarch.dataClasses

data class SearchPlaylists(
    val pageInfo: PageInfo,
    val items: List<SearchItems>,
    val nextPageToken: String
)

data class SearchItems(val id: SearchID, val snippet: SearchSnippet)

data class SearchID(val playlistId: String)

data class SearchSnippet(val thumbnails: Thumbnails, val title: String, val channelTitle: String)