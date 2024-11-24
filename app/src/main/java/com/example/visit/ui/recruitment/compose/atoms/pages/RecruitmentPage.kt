package com.example.visit.ui.recruitment.compose.atoms.pages

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
import com.example.visit.ui.recruitment.compose.atoms.organism.RecruitmentContentList
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
    val recruitments = listOf(
        Recruitment(
            id = 1,
            title = "長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル",
            companyName = "Hoge株式会社",
            companyImage = "aaaa"
        ),
        Recruitment(
            id = 2,
            title = "長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル",
            companyName = "Hoge株式会社",
            companyImage = "aaaa"
        ),
        Recruitment(
            id = 3,
            title = "長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル",
            companyName = "Hoge株式会社",
            companyImage = "aaaa"
        ),
        Recruitment(
            id = 4,
            title = "長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル",
            companyName = "Hoge株式会社",
            companyImage = "aaaa"
        ),
        Recruitment(
            id = 5,
            title = "長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル",
            companyName = "Hoge株式会社",
            companyImage = "aaaa"
        ),
        Recruitment(
            id = 6,
            title = "長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル",
            companyName = "Hoge株式会社",
            companyImage = "aaaa"
        ),
        Recruitment(
            id = 7,
            title = "長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル",
            companyName = "Hoge株式会社",
            companyImage = "aaaa"
        ),
        Recruitment(
            id = 8,
            title = "長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル",
            companyName = "Hoge株式会社",
            companyImage = "aaaa"
        ),
        Recruitment(
            id = 9,
            title = "長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル長いタイトル",
            companyName = "Hoge株式会社",
            companyImage = "aaaa"
        ),
    )
    RecruitmentPage(NavHostController(LocalContext.current), recruitments, {})
}

