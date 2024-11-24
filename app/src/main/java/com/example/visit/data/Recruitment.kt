package com.example.visit.data

/*
* 企業の募集情報
 */
//@Parcelize
data class Recruitment(
    //求人ID
//    @Json("id")
    val id: Int,
    //募集タイトル
//    @Json("title")
    val title: String,
    //企業情報
//    @Json("company")
    val company: Company
) {
//    override fun describeContents(): Int {
//        TODO("Not yet implemented")
//    }
//
//    override fun writeToParcel(dest: Parcel, flags: Int) {
//        TODO("Not yet implemented")
//    }

    data class Company(
//        @Json("name")
        val name: String,

//        @Json("image")
        val image: String,
    )
}

