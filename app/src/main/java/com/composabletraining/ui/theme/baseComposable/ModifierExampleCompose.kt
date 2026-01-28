package com.composabletraining.ui.theme.baseComposable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//---- A. Taille et positionnement
//Modifier
//    .size(100.dp)              // Taille fixe (largeur ET hauteur)
//    .width(200.dp)             // Largeur uniquement
//    .height(50.dp)             // Hauteur uniquement
//    .fillMaxWidth()            // Remplit toute la largeur disponible
//    .fillMaxHeight()           // Remplit toute la hauteur disponible
//    .fillMaxSize()             // Remplit largeur ET hauteur
//    .wrapContentSize()         // S'adapte au contenu

//---- B.Espacement

//Modifier
//    .padding(16.dp)                           // Padding uniforme
//    .padding(horizontal = 16.dp, vertical = 8.dp)  // Horizontal et vertical
//    .padding(start = 16.dp, end = 8.dp)       // Différent de chaque côté

//---- C.Apparence visuelle

//Modifier
//    .background(Color.Blue)                   // Couleur de fond
//    .background(Color.Blue, RoundedCornerShape(8.dp))  // Fond avec coins arrondis
//    .border(2.dp, Color.Red)                  // Bordure
//    .clip(RoundedCornerShape(12.dp))          // Découper les coins
//    .shadow(4.dp)                             // Ombre
//    .alpha(0.5f)                              // Transparence (0f = invisible, 1f = opaque)

//---- D.Interactions

//Modifier
//    .clickable { /* Action au clic */ }       // Rendre cliquable
//    .scrollable(...)                          // Rendre scrollable
//    .draggable(...)                           // Rendre déplaçable

//---- E. Alignement et arrangement
//Modifier
//    .align(Alignment.Center)                  // Dans un Box, Column ou Row
//    .weight(1f)                               // Dans une Row/Column : partage l'espace
@Composable
fun ModifierPaddingCompose(
    modifier: Modifier
) {
    Text(
        text = "Hello",
        modifier = modifier

    )
}

@Preview(showBackground = true)
@Composable
fun ModifierPaddingSecondComposePreview() {
    ModifierPaddingCompose(
        modifier = Modifier
            .background(Color.Blue)
            .padding(16.dp)
            .border(2.dp, Color.Red)
    )
}

@Preview(showBackground = true)
@Composable
fun ModifierBigPaddingSecondComposePreview() {
    ModifierPaddingCompose(
        modifier = Modifier
            .background(Color.Blue)
            .padding(32.dp)
            .border(2.dp, Color.Red)
    )
}

@Preview(showBackground = true)
@Composable
fun ModifierFirstPaddingComposePreview() {
    ModifierPaddingCompose(
        modifier = Modifier
            .padding(16.dp)
            .background(Color.Blue)
            .border(2.dp, Color.Red)
    )
}
@Preview(showBackground = true)
@Composable
fun ModifierFirstBigPaddingComposePreview() {
    ModifierPaddingCompose(
        modifier = Modifier
            .padding(32.dp)
            .background(Color.Blue)
            .border(2.dp, Color.Red)
    )
}

@Preview(showBackground = true)
@Composable
fun ModifierClipShadowAlphaComposePreview() {
    ModifierPaddingCompose(
        modifier = Modifier
            .padding(32.dp)
            .background(Color.Blue)
            .border(2.dp, Color.Red)
            .clip(RoundedCornerShape(12.dp))          // Découper les coins
            .shadow(4.dp)                             // Ombre
            .alpha(0.5f)
    )
}
