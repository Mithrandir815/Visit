package com.example.visit.ui.recruitment.compose.atoms.organism

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.visit.data.Recruitment
import com.example.visit.ui.recruitment.compose.atoms.RecruitmentContent

@Composable
fun RecruitmentContentList(
    modifier: Modifier = Modifier,
    recruitments: List<Recruitment> = listOf<Recruitment>(),
) {
    LazyColumn(
        modifier
            .fillMaxWidth()
            .padding(all = 4.dp)
    ) {
        items(items = recruitments) { recruitment ->
            RecruitmentContent(Modifier.padding(bottom = 4.dp), recruitment)
        }
    }
}

@Preview
@Composable
fun PreviewRecruitmentContent() {
    val recruitments = listOf(
        Recruitment(
            title = "長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル",
            companyName = "Hoge株式会社",
            companyImage = "aaaa"
        ),
        Recruitment(
            title = "Androidエンジニア",
            companyName = "Hoge株式会社",
            companyImage = "aaaa"
        ),
        Recruitment(
            title = "Androidエンジニア",
            companyName = "Hoge株式会社",
            companyImage = "aaaa"
        ),
    )
    RecruitmentContentList(modifier = Modifier.background(color = Color.White), recruitments)
}