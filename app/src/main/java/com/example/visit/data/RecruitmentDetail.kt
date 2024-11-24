package com.example.visit.data

data class RecruitmentDetail(
    //募集タイトル
    val title: String,
    //企業名
    val companyName: String,
    //募集のサムネ
    val companyImage: String,
    //なにをやっているのか
    val whatDescription: String,
    //なぜやるのか
    val whyDescription: String,
    //どうやっているのか
    val howDescription: String,
)
