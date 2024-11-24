package com.example.visit.ui.recruitmentdetail.compose.atoms

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.visit.R
import com.example.visit.data.RecruitmentDetail
import com.example.visit.ui.theme.SecondaryColor

@Composable
fun RecruitmentDetails(
    modifier: Modifier,
    recruitmentDetail: RecruitmentDetail,
) {
    Column(
        modifier
            .fillMaxWidth()
            .background(color = SecondaryColor, shape = RoundedCornerShape(8.dp))
    ) {
        AsyncImage(
            model = ImageRequest.Builder(context = LocalContext.current)
                .data(recruitmentDetail.company.image)
                .crossfade(true)
                .build(),
            error = painterResource(R.drawable.ic_launcher_foreground),
            placeholder = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = stringResource(R.string.recruitment_list),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        )
        Text(
            modifier = Modifier.padding(4.dp),
            text = recruitmentDetail.title,
            fontSize = 24.sp,
        )
        Text(
            modifier = Modifier.padding(4.dp),
            text = recruitmentDetail.company.name,
            fontSize = 20.sp,
        )
        Text(
            modifier = Modifier.padding(4.dp),
            text = recruitmentDetail.whatDescription,
            fontSize = 16.sp,
        )
        Text(
            modifier = Modifier.padding(4.dp),
            text = recruitmentDetail.whyDescription,
            fontSize = 16.sp,
        )
        Text(
            modifier = Modifier.padding(4.dp),
            text = recruitmentDetail.howDescription,
            fontSize = 16.sp,
        )
    }
}

@Preview
@Composable
fun PreviewRecruitmentDetails() {
    val recruitmentDetail = RecruitmentDetail(
        title = "Androidエンジニア",
        company = RecruitmentDetail.Company(
            name = "Hoge株式会社",
            image = "aaaa",
        ),
        whyDescription = "aaaaafjaidhfioajiodhpadhoj",
        whatDescription = "aaaaafjaidhfioajiodhpadhoj",
        howDescription = "aaaaafjaidhfioajiodhpadhoj"
    )
    RecruitmentDetails(
        modifier = Modifier,
        recruitmentDetail = recruitmentDetail,
    )
}