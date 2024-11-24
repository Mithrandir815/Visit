package com.example.visit.model.recruitment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.visit.data.Recruitment
import com.example.visit.repository.recruitment.RecruitmentService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class RecruitmentViewModel(
    val recruitmentService: RecruitmentService,
) : ViewModel() {
    private val _recruitments = MutableStateFlow<List<Recruitment>>(listOf())
    val recruitments: Flow<List<Recruitment>> = _recruitments.asStateFlow()

    fun getRecruitments(paging: Int) {
        viewModelScope.launch {
            _recruitments.value = recruitmentService.getRecruitments(
                "mobile",
                paging
            )
        }
    }
}