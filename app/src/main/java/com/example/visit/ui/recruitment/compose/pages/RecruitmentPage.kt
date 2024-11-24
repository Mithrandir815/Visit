package com.example.visit.ui.recruitment.compose.pages

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.visit.data.Recruitment
import com.example.visit.ui.recruitment.compose.organism.RecruitmentContentList
import com.example.visit.ui.theme.PrimaryColor

@Composable
fun RecruitmentPage(
    navController: NavHostController,
    recruitments: List<Recruitment>,
    onRecruitmentClick: (Int) -> Unit,
) {
    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        containerColor = PrimaryColor
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = ScreenNav.RecruitmentScreenNav.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(ScreenNav.RecruitmentScreenNav.route) {
                RecruitmentContentList(Modifier, recruitments, onRecruitmentClick)
            }

            composable(ScreenNav.RecruitmentDetailScreenNav.route) {
//                TODO 画面の作成後
            }
        }
    }
}

sealed class ScreenNav(val route: String) {
    object RecruitmentScreenNav : ScreenNav("recruitmentScreen")
    object RecruitmentDetailScreenNav : ScreenNav("recruitmentDetailScreen")
}

@Preview(showSystemUi = true)
@Composable
fun PreviewRecruitmentContent() {
    val recruitment = Recruitment(
        id = 1,
        title = "長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル",
        company = Recruitment.Company(
            name = "Hoge株式会社",
            image = "aaaa",
        )
    )
    val recruitments = listOf(
        recruitment,
        recruitment,
        recruitment,
        recruitment,
        recruitment,
        recruitment,
        recruitment,
        recruitment,
        recruitment,
        recruitment,
    )
    RecruitmentPage(NavHostController(LocalContext.current), recruitments, {})
}

