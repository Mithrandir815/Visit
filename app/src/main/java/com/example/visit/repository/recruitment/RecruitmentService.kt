package com.example.visit.repository.recruitment

import com.example.visit.data.Recruitment
import com.example.visit.data.RecruitmentDetail
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RecruitmentService {

    /*
    * 求人一覧取得API
     */
    @GET("api/v1/projects")
    suspend fun getRecruitments(
        @Query("q") q: String? = null,
        @Query("page") page: Int? = null,
    ): List<Recruitment>

    /*
    * 求人詳細取得API
     */
    @GET("api/v1/projects/{project_id}")
    suspend fun getRecruitmentDetail(
        @Path("project_id") projectId: Int? = null,
    ): RecruitmentDetail
}