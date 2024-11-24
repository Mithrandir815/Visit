package com.example.visit.model.recruitment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.visit.data.RecruitmentDetail
import com.example.visit.repository.recruitment.RecruitmentService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class RecruitmentDetailViewModel(
    val recruitmentService: RecruitmentService,
) : ViewModel() {

    private val _recruitmentDetail = MutableStateFlow<RecruitmentDetail>(RecruitmentDetail())
    val recruitmentDetail: Flow<RecruitmentDetail> = _recruitmentDetail.asStateFlow()

    fun getRecruitmentDetail(projectId: Int) {
        viewModelScope.launch {
            _recruitmentDetail.value = recruitmentService.getRecruitmentDetail(
                projectId = projectId
            )
        }
    }
}