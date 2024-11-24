package com.example.visit.data

/*
* 企業の募集情報
 */
data class Recruitment (
    //求人ID
    val id: Int,
    //募集タイトル
    val title: String,
    //企業名
    val companyName: String,
    //募集のサムネ
    val companyImage: String,
)