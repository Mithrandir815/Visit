package com.example.visit.data

data class RecruitmentDetail(
    //募集タイトル
    val title: String = "",
    //企業名
    val company: Company = Company(),
    //なにをやっているのか
    val whatDescription: String = "",
    //なぜやるのか
    val whyDescription: String = "",
    //どうやっているのか
    val howDescription: String = "",
) {
    data class Company(
        val name: String = "",
        val image: String = "",
    )
}
