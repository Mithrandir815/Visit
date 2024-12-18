package com.example.visit.ui.recruitment.compose.atoms

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.visit.R
import com.example.visit.data.Recruitment
import com.example.visit.ui.theme.SecondaryColor

@Composable
fun RecruitmentContent(
    modifier: Modifier = Modifier,
    recruitment: Recruitment,
    onClick: (Int) -> Unit,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(color = SecondaryColor, shape = RoundedCornerShape(8.dp))
            .clickable(onClick = { onClick(recruitment.id) })
    ) {
        AsyncImage(
            model = ImageRequest.Builder(context = LocalContext.current)
                .data(recruitment.company.image)
                .crossfade(true)
                .build(),
            error = painterResource(R.drawable.ic_launcher_foreground),
            placeholder = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = stringResource(R.string.recruitment_list),
            contentScale = ContentScale.Crop,
            modifier = Modifier.width(80.dp)
        )
        Column {
            Text(
                modifier = Modifier.padding(start = 8.dp, end = 8.dp, top = 4.dp),
                text = recruitment.title,
                fontSize = 12.sp,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1
            )
            Text(
                text = recruitment.company.name,
                modifier = Modifier.padding(start = 8.dp, end = 8.dp, bottom = 4.dp),
                fontSize = 10.sp,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1
            )
        }
    }
}

@Preview
@Composable
fun PreviewRecruitmentContent() {
    val recruitment = Recruitment(
        id = 1,
        title = "Androidエンジニア",
        company = Recruitment.Company(
            name = "Hoge株式会社",
            image = "aaaa",
        )
    )
    RecruitmentContent(modifier = Modifier.background(color = Color.White), recruitment, {})
}