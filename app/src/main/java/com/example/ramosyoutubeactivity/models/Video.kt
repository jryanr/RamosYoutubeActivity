package com.example.ramosyoutubeactivity.models

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
class Video(var id: String? = "", var title: String? = "", var link: String? = "", var rank: String? = "",var reason: String? = "") {
    override fun toString(): String {
        return "Rank $rank: $title"
    }
}
