package com.example.visit.ui.recruitment.compose.atoms.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.visit.R
import com.example.visit.data.Recruitment
import com.example.visit.ui.recruitment.compose.atoms.organism.RecruitmentContentList
import com.example.visit.ui.theme.PrimaryColor

@Composable
fun RecruitmentPage(recruitments: List<Recruitment>) {
    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        containerColor = PrimaryColor
    ) { innerPadding ->
        Column(modifier = Modifier
            .padding(innerPadding)
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
            RecruitmentContentList(modifier = Modifier, recruitments)
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewRecruitmentContent() {
    val recruitments = listOf(
        Recruitment(
            title = "長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル",
            companyName = "Hoge株式会社",
            companyImage = "aaaa"
        ),
        Recruitment(
            title = "長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル",
            companyName = "Hoge株式会社",
            companyImage = "aaaa"
        ),
        Recruitment(
            title = "長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル",
            companyName = "Hoge株式会社",
            companyImage = "aaaa"
        ),
        Recruitment(
            title = "長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル",
            companyName = "Hoge株式会社",
            companyImage = "aaaa"
        ),
        Recruitment(
            title = "長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル",
            companyName = "Hoge株式会社",
            companyImage = "aaaa"
        ),
        Recruitment(
            title = "長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル",
            companyName = "Hoge株式会社",
            companyImage = "aaaa"
        ),
        Recruitment(
            title = "長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル",
            companyName = "Hoge株式会社",
            companyImage = "aaaa"
        ),
        Recruitment(
            title = "長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル",
            companyName = "Hoge株式会社",
            companyImage = "aaaa"
        ),
        Recruitment(
            title = "長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル",
            companyName = "Hoge株式会社",
            companyImage = "aaaa"
        ),
    )
    RecruitmentPage(recruitments)
}

