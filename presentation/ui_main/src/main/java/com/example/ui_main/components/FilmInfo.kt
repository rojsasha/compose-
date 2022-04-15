package com.example.ui_main.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import coil.request.ImageRequest
import coil.transform.Transformation
import com.example.domain.model.FilmDto
import com.google.accompanist.placeholder.PlaceholderHighlight
import com.google.accompanist.placeholder.material.placeholder
import com.google.accompanist.placeholder.material.shimmer
import com.skydoves.landscapist.CircularReveal
import com.skydoves.landscapist.coil.CoilImage
import com.skydoves.landscapist.palette.BitmapPalette

@Composable
fun FilmItemInfo(film: FilmDto, onClick: (Int) -> Unit) {
    AnimatedVisibility(
        visible = true,
        enter = fadeIn(),
        exit = fadeOut()
    ) {
        Card(
            modifier = Modifier
                .animateContentSize()
                .padding(8.dp)
                .clickable { },
            shape = RoundedCornerShape(8.dp),
            elevation = 8.dp
        ) {
            Row() {
                ImageFilm(
                    imageLink = "character.imageUrl",
                    modifier = Modifier
                        .fillMaxWidth(0.35f)
                )
            }
            Spacer(modifier = Modifier.size(8.dp))
            FilmInfo(
                film = film,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(4.dp)
            )
        }
    }
}

@Composable
fun ImageFilm(
    imageLink: String,
    modifier: Modifier,
    transformations: List<Transformation> = emptyList(),
) {
    CoilImage(
        imageRequest =
        ImageRequest.Builder(LocalContext.current)
            .data(imageLink)
            .crossfade(true)
            .transformations(transformations)
            .build(),
        alignment = Alignment.Center,
        loading = {
            run {
                ConstraintLayout(
                    modifier = Modifier
                        .fillMaxSize()
                        .placeholder(
                            visible = true,

                            highlight = PlaceholderHighlight.shimmer(),
                        )
                ) {
                    val indicator = createRef()
                    CircularProgressIndicator(
                        modifier = Modifier.constrainAs(indicator) {
                            top.linkTo(parent.top)
                            bottom.linkTo(parent.bottom)
                            start.linkTo(parent.start)
                            end.linkTo(parent.end)
                        }
                    )
                }
            }
        },
        circularReveal = CircularReveal(
            duration = 300,
        ),
        modifier = modifier
    )
}

@Composable
fun FilmInfo(
    film: FilmDto,
    modifier: Modifier = Modifier,
    showExtraInfo: Boolean = true,
    alignment: Alignment.Horizontal = Alignment.Start
) {
    Column(
        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        horizontalAlignment = alignment
    ) {
        Text(
            text = "character.name",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.h6,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
        Spacer(modifier = Modifier.height(8.dp))
        if (showExtraInfo) {
            Text(text = "Origin", fontSize = 13.sp)
            Text(text = "character.origin")
        }
        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "Status", fontSize = 13.sp)
    }
}