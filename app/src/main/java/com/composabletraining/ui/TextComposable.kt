package com.composabletraining.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextComposable(
    text: String,                          // Le texte à afficher
    modifier: Modifier = Modifier,         // Modifications visuelles
    color: Color = Color.Unspecified,      // Couleur du texte
    fontSize: TextUnit = TextUnit.Unspecified,  // Taille du texte
    fontStyle: FontStyle? = null,          // Italic, Normal
    fontWeight: FontWeight? = null,        // Bold, Light, etc.
    fontFamily: FontFamily? = null,        // Police de caractères
    letterSpacing: TextUnit = TextUnit.Unspecified,  // Espacement entre lettres
    textDecoration: TextDecoration? = null,  // Underline, LineThrough
    textAlign: TextAlign? = null,          // Start, Center, End, Justify
    lineHeight: TextUnit = TextUnit.Unspecified,  // Hauteur de ligne
    overflow: TextOverflow = TextOverflow.Clip,  // Clip, Ellipsis, Visible
    softWrap: Boolean = true,              // Retour à la ligne automatique
    maxLines: Int = Int.MAX_VALUE,         // Nombre max de lignes
    minLines: Int = 1,                     // Nombre min de lignes
    onTextLayout: (TextLayoutResult) -> Unit = {},  // Callback layout
    style: TextStyle = LocalTextStyle.current  // Style Material
) {

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CompleteTextExamplesPreview() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        // ==================== TAILLES ====================
        SectionHeader("1. Tailles (fontSize)")
        Text("Très petit - 10sp", fontSize = 10.sp)
        Text("Petit - 12sp", fontSize = 12.sp)
        Text("Normal - 16sp", fontSize = 16.sp)
        Text("Grand - 24sp", fontSize = 24.sp)
        Text("Très grand - 32sp", fontSize = 32.sp)
        Text("Énorme - 48sp", fontSize = 48.sp)

        HorizontalDivider(Modifier, DividerDefaults.Thickness, DividerDefaults.color)

        // ==================== POIDS ====================
        SectionHeader("2. Poids (fontWeight)")
        Text("Thin - 100", fontWeight = FontWeight.Thin)
        Text("ExtraLight - 200", fontWeight = FontWeight.ExtraLight)
        Text("Light - 300", fontWeight = FontWeight.Light)
        Text("Normal - 400", fontWeight = FontWeight.Normal)
        Text("Medium - 500", fontWeight = FontWeight.Medium)
        Text("SemiBold - 600", fontWeight = FontWeight.SemiBold)
        Text("Bold - 700", fontWeight = FontWeight.Bold)
        Text("ExtraBold - 800", fontWeight = FontWeight.ExtraBold)
        Text("Black - 900", fontWeight = FontWeight.Black)

        HorizontalDivider(Modifier, DividerDefaults.Thickness, DividerDefaults.color)
        // ==================== COULEURS ====================
        SectionHeader("3. Couleurs (color)")
        Text("Texte rouge", color = Color.Red)
        Text("Texte bleu", color = Color.Blue)
        Text("Texte vert", color = Color.Green)
        Text("Texte custom violet", color = Color(0xFF6200EA))
        Text("Texte avec transparence 50%", color = Color.Blue.copy(alpha = 0.5f))
        Text("Texte gris", color = Color.Gray)

        HorizontalDivider(Modifier, DividerDefaults.Thickness, DividerDefaults.color)

        // ==================== STYLES ====================
        SectionHeader("4. Styles (fontStyle)")
        Text("Style normal", fontStyle = FontStyle.Normal)
        Text("Style italique", fontStyle = FontStyle.Italic)

        HorizontalDivider(Modifier, DividerDefaults.Thickness, DividerDefaults.color)

        // ==================== FAMILLES ====================
        SectionHeader("5. Familles de polices (fontFamily)")
        Text("Default (sans fontFamily)")
        Text("Serif", fontFamily = FontFamily.Serif)
        Text("Sans Serif", fontFamily = FontFamily.SansSerif)
        Text("Monospace", fontFamily = FontFamily.Monospace)
        Text("Cursive", fontFamily = FontFamily.Cursive)

        HorizontalDivider(Modifier, DividerDefaults.Thickness, DividerDefaults.color)

        // ==================== DÉCORATIONS ====================
        SectionHeader("6. Décorations (textDecoration)")
        Text("Texte normal (sans décoration)")
        Text("Texte souligné", textDecoration = TextDecoration.Underline)
        Text("Texte barré", textDecoration = TextDecoration.LineThrough)
        Text(
            "Souligné ET barré",
            textDecoration = TextDecoration.Underline + TextDecoration.LineThrough
        )

        HorizontalDivider(Modifier, DividerDefaults.Thickness, DividerDefaults.color)

        // ==================== ESPACEMENT LETTRES ====================
        SectionHeader("7. Espacement lettres (letterSpacing)")
        Text("Espacement normal (0sp)", letterSpacing = 0.sp)
        Text("E s p a c é (2sp)", letterSpacing = 2.sp)
        Text("T r è s   e s p a c é (4sp)", letterSpacing = 4.sp)
        Text("Condensé (-1sp)", letterSpacing = (-1).sp)

        HorizontalDivider(Modifier, DividerDefaults.Thickness, DividerDefaults.color)

        // ==================== HAUTEUR LIGNE ====================
        SectionHeader("8. Hauteur de ligne (lineHeight)")
        Text(
            "Ligne 1 - Petite hauteur\nLigne 2\nLigne 3",
            lineHeight = 16.sp
        )
        Text(
            "Ligne 1 - Hauteur normale\nLigne 2\nLigne 3",
            lineHeight = 24.sp
        )
        Text(
            "Ligne 1 - Grande hauteur\nLigne 2\nLigne 3",
            lineHeight = 40.sp
        )

        HorizontalDivider(Modifier, DividerDefaults.Thickness, DividerDefaults.color)

        // ==================== ALIGNEMENT ====================
        SectionHeader("9. Alignement (textAlign)")
        Text(
            "Aligné à gauche (Start)",
            textAlign = TextAlign.Start,
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            "Centré (Center)",
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            "Aligné à droite (End)",
            textAlign = TextAlign.End,
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            "Justifié : Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt.",
            textAlign = TextAlign.Justify,
            modifier = Modifier.fillMaxWidth()
        )

        Divider()

        // ==================== OVERFLOW ====================
        SectionHeader("10. Débordement (overflow + maxLines)")
        Text("Overflow.Clip :", fontWeight = FontWeight.Bold)
        Text(
            "Texte très très long qui sera coupé net sans indication",
            overflow = TextOverflow.Clip,
            maxLines = 1,
            modifier = Modifier
                .width(200.dp)
                .background(Color.LightGray)
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text("Overflow.Ellipsis :", fontWeight = FontWeight.Bold)
        Text(
            "Texte très très long qui sera coupé avec des points de suspension",
            overflow = TextOverflow.Ellipsis,
            maxLines = 1,
            modifier = Modifier
                .width(200.dp)
                .background(Color.LightGray)
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text("Overflow.Visible :", fontWeight = FontWeight.Bold)
        Text(
            "Texte très très long qui débordera visuellement de sa zone",
            overflow = TextOverflow.Visible,
            maxLines = 1,
            modifier = Modifier
                .width(200.dp)
                .background(Color.LightGray)
        )

        HorizontalDivider(Modifier, DividerDefaults.Thickness, DividerDefaults.color)

        // ==================== MAX LINES ====================
        SectionHeader("11. Lignes maximum (maxLines)")
        Text(
            "Texte long limité à 2 lignes avec ellipsis. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )

        HorizontalDivider(Modifier, DividerDefaults.Thickness, DividerDefaults.color)

        // ==================== SOFT WRAP ====================
        SectionHeader("12. Retour à la ligne (softWrap)")
        Text("softWrap = true (défaut) :", fontWeight = FontWeight.Bold)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.LightGray)
        ) {
            Text(
                "Texte très long qui va automatiquement passer à la ligne suivante",
                softWrap = true
            )
        }

        Spacer(modifier = Modifier.height(4.dp))

        Text("softWrap = false :", fontWeight = FontWeight.Bold)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.LightGray)
        ) {
            Text(
                "Texte très long qui ne passera pas à la ligne et débordera",
                softWrap = false
            )
        }

        HorizontalDivider(Modifier, DividerDefaults.Thickness, DividerDefaults.color)

        // ==================== MATERIAL STYLES ====================
        SectionHeader("13. Styles Material (style)")
        Text("displayLarge", style = MaterialTheme.typography.displayLarge)
        Text("displayMedium", style = MaterialTheme.typography.displayMedium)
        Text("displaySmall", style = MaterialTheme.typography.displaySmall)

        Spacer(modifier = Modifier.height(8.dp))

        Text("headlineLarge", style = MaterialTheme.typography.headlineLarge)
        Text("headlineMedium", style = MaterialTheme.typography.headlineMedium)
        Text("headlineSmall", style = MaterialTheme.typography.headlineSmall)

        Spacer(modifier = Modifier.height(8.dp))

        Text("titleLarge", style = MaterialTheme.typography.titleLarge)
        Text("titleMedium", style = MaterialTheme.typography.titleMedium)
        Text("titleSmall", style = MaterialTheme.typography.titleSmall)

        Spacer(modifier = Modifier.height(8.dp))

        Text("bodyLarge", style = MaterialTheme.typography.bodyLarge)
        Text("bodyMedium", style = MaterialTheme.typography.bodyMedium)
        Text("bodySmall", style = MaterialTheme.typography.bodySmall)

        Spacer(modifier = Modifier.height(8.dp))

        Text("labelLarge", style = MaterialTheme.typography.labelLarge)
        Text("labelMedium", style = MaterialTheme.typography.labelMedium)
        Text("labelSmall", style = MaterialTheme.typography.labelSmall)

        HorizontalDivider(Modifier, DividerDefaults.Thickness, DividerDefaults.color)

        // ==================== STYLE + COPY ====================
        SectionHeader("14. Style personnalisé (copy)")
        Text(
            "Style Material modifié",
            style = MaterialTheme.typography.headlineMedium.copy(
                color = Color(0xFF6200EA),
                fontWeight = FontWeight.Bold,
                letterSpacing = 2.sp,
                textDecoration = TextDecoration.Underline
            )
        )

        HorizontalDivider(Modifier, DividerDefaults.Thickness, DividerDefaults.color)

        // ==================== ANNOTATED STRING ====================
        SectionHeader("15. Texte multiligne (AnnotatedString)")
        Text(
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(color = Color.Red, fontWeight = FontWeight.Bold)) {
                    append("Rouge et gras")
                }
                append(" puis ")
                withStyle(style = SpanStyle(color = Color.Blue, fontSize = 20.sp)) {
                    append("Bleu et grand")
                }
                append(" puis ")
                withStyle(style = SpanStyle(
                    color = Color.Green,
                    textDecoration = TextDecoration.Underline,
                    fontStyle = FontStyle.Italic
                )) {
                    append("Vert, souligné et italique")
                }
            }
        )

        HorizontalDivider(Modifier, DividerDefaults.Thickness, DividerDefaults.color)

        // ==================== EXEMPLES PRATIQUES ====================
        SectionHeader("16. Exemples pratiques")

        // Carte de prix
        Text("Carte de prix :", fontWeight = FontWeight.Bold, fontSize = 14.sp)
        PriceCard()

        Spacer(modifier = Modifier.height(8.dp))

        // Badges de statut
        Text("Badges de statut :", fontWeight = FontWeight.Bold, fontSize = 14.sp)
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            StatusBadge("Actif", true)
            StatusBadge("Inactif", false)
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Header avec sous-titre
        Text("Header + sous-titre :", fontWeight = FontWeight.Bold, fontSize = 14.sp)
        HeaderWithSubtitle(
            "Titre principal",
            "Sous-titre avec une description plus longue qui peut s'étendre"
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Label avec point de couleur
        Text("Labels avec points :", fontWeight = FontWeight.Bold, fontSize = 14.sp)
        Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
            LabelWithDot("En cours", Color(0xFFFFA000))
            LabelWithDot("Terminé", Color(0xFF4CAF50))
            LabelWithDot("Annulé", Color(0xFFFF5252))
        }

        // Espace final
        Spacer(modifier = Modifier.height(32.dp))
    }
}

@Composable
fun SectionHeader(title: String) {
    Text(
        text = title,
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold,
        color = Color(0xFF6200EA),
        modifier = Modifier.padding(top = 8.dp, bottom = 4.dp)
    )
}

@Composable
fun PriceCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Prix",
                style = MaterialTheme.typography.labelSmall,
                color = Color.Gray
            )

            Row(verticalAlignment = Alignment.Bottom) {
                Text(
                    text = "99",
                    fontSize = 48.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF6200EA)
                )
                Text(
                    text = ",99 €",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color(0xFF6200EA),
                    modifier = Modifier.padding(bottom = 8.dp)
                )
            }

            Text(
                text = "par mois",
                style = MaterialTheme.typography.bodySmall,
                color = Color.Gray
            )
        }
    }
}

@Composable
fun StatusBadge(status: String, isActive: Boolean) {
    Text(
        text = status.uppercase(),
        fontSize = 12.sp,
        fontWeight = FontWeight.Bold,
        color = Color.White,
        letterSpacing = 1.sp,
        modifier = Modifier
            .background(
                color = if (isActive) Color(0xFF4CAF50) else Color(0xFFFF5252),
                shape = RoundedCornerShape(12.dp)
            )
            .padding(horizontal = 12.dp, vertical = 4.dp)
    )
}

@Composable
fun HeaderWithSubtitle(title: String, subtitle: String) {
    Column {
        Text(
            text = title,
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF6200EA)
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = subtitle,
            style = MaterialTheme.typography.bodyMedium,
            color = Color.Gray,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Composable
fun LabelWithDot(label: String, color: Color) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Box(
            modifier = Modifier
                .size(8.dp)
                .background(color, CircleShape)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = label,
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.Medium
        )
    }
}