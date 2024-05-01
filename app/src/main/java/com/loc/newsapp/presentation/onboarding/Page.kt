package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title: String,
    val description: String,

    //@DrawableRes annotation is used to indicate that an integer parameter,
    // field or method return value is expected to be a drawable resource reference
    @DrawableRes val image: Int
)

val page = listOf(
    Page(
        title = "Welcome To NewsX",
        description = "Text To be Added",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Welcome To NewsX",
        description = "Text To be Added",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Welcome To NewsX",
        description = "Text To be Added",
        image = R.drawable.onboarding3
    )
)