package com.example.visit.ui.recruitment.compose.organism

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.visit.R
import com.example.visit.data.Recruitment
import com.example.visit.ui.recruitment.compose.atoms.RecruitmentContent
import com.example.visit.ui.theme.PrimaryColor

@Composable
fun RecruitmentContentList(
    modifier: Modifier = Modifier,
    recruitments: List<Recruitment> = listOf<Recruitment>(),
    onRecruitmentClick: (Int) -> Unit,
) {
    Column(
        modifier = modifier
            .background(color = PrimaryColor)
    ) {
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            text = stringResource(R.string.recruitment_list),
            fontSize = 32.sp,
            textAlign = TextAlign.Center,
        )
        LazyColumn(
            Modifier
                .fillMaxWidth()
                .padding(all = 4.dp)
        ) {
            items(items = recruitments) { recruitment ->
                RecruitmentContent(Modifier.padding(bottom = 4.dp), recruitment, onRecruitmentClick)
            }
        }
    }
}

@Preview
@Composable
fun PreviewRecruitmentContent() {
    val recruitments = listOf(
        Recruitment(
            id = 1,
            title = "長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル",
            company = Recruitment.Company(
                name = "Hoge株式会社",
                image = "aaaa",
            )
        ),
        Recruitment(
            id = 2,
            title = "Androidエンジニア",
            company = Recruitment.Company(
                name = "Hoge株式会社",
                image = "aaaa",
            )
        ),
        Recruitment(
            id = 3,
            title = "Androidエンジニア",
            company = Recruitment.Company(
                name = "Hoge株式会社",
                image = "aaaa",
            )
        ),
    )
    RecruitmentContentList(modifier = Modifier.background(color = Color.White), recruitments, {})
}