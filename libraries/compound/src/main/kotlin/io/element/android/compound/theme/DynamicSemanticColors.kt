/*
 * Copyright (c) 2026 Element Creations Ltd.
 *
 * SPDX-License-Identifier: AGPL-3.0-only OR LicenseRef-Element-Commercial.
 * Please see LICENSE files in the repository root for full details.
 */

package io.element.android.compound.theme

import androidx.compose.material3.ColorScheme
import io.element.android.compound.tokens.generated.SemanticColors

/**
 * Material 3 Expressive: rebuild Compound's semantic color tokens from a Material You
 * [ColorScheme] (typically generated from the device wallpaper via
 * `dynamicDarkColorScheme`/`dynamicLightColorScheme`).
 *
 * This recolors the *whole* UI — backgrounds, surfaces, text, icons, borders and accents —
 * so the app follows the system wallpaper palette instead of Element's fixed brand colors.
 *
 * Semantic status colors that have no Material equivalent (success/warning) and the purely
 * decorative / gradient tokens are intentionally left as their original Compound values so
 * that meaning-carrying colors stay recognizable.
 */
fun SemanticColors.withDynamicColorScheme(cs: ColorScheme): SemanticColors = copy(
    // Backgrounds & surfaces -> Material surface roles
    bgCanvasDefault = cs.background,
    bgCanvasDefaultLevel1 = cs.surfaceContainerLow,
    bgCanvasDisabled = cs.surfaceDim,
    bgSubtlePrimary = cs.surfaceContainer,
    bgSubtleSecondary = cs.surfaceContainerHigh,
    bgSubtleSecondaryLevel0 = cs.surface,
    bgSubtleTertiary = cs.surfaceContainerHighest,

    // Accent / primary actions -> primary
    bgAccentRest = cs.primary,
    bgAccentHovered = cs.primary,
    bgAccentPressed = cs.primary,
    bgAccentSelected = cs.primary,
    bgAccentSubtle = cs.primaryContainer,
    bgActionPrimaryRest = cs.primary,
    bgActionPrimaryHovered = cs.primary,
    bgActionPrimaryPressed = cs.primary,
    bgActionPrimaryDisabled = cs.onSurface.copy(alpha = 0.12f),

    // Secondary / tertiary actions
    bgActionSecondaryRest = cs.secondaryContainer,
    bgActionSecondaryHovered = cs.secondaryContainer,
    bgActionSecondaryPressed = cs.secondaryContainer,
    bgActionTertiaryRest = cs.tertiaryContainer,
    bgActionTertiaryHovered = cs.tertiaryContainer,
    bgActionTertiarySelected = cs.tertiaryContainer,

    // Badges
    bgBadgeAccent = cs.primaryContainer,
    bgBadgeDefault = cs.surfaceContainerHighest,
    bgBadgeInfo = cs.secondaryContainer,
    bgBadgePrimary = cs.primary,
    bgBadgeSecondary = cs.secondaryContainer,

    // Info (no Material equivalent) -> secondary
    bgInfoSubtle = cs.secondaryContainer,
    textInfoPrimary = cs.secondary,
    iconInfoPrimary = cs.secondary,
    borderInfoSubtle = cs.secondaryContainer,
    textBadgeInfo = cs.onSecondaryContainer,

    // Critical / errors -> error
    bgCriticalPrimary = cs.error,
    bgCriticalHovered = cs.error,
    bgCriticalSubtle = cs.errorContainer,
    bgCriticalSubtleHovered = cs.errorContainer,
    textCriticalPrimary = cs.error,
    iconCriticalPrimary = cs.error,
    borderCriticalPrimary = cs.error,
    borderCriticalHovered = cs.error,
    borderCriticalSubtle = cs.errorContainer,

    // Text -> onSurface roles
    textPrimary = cs.onSurface,
    textSecondary = cs.onSurfaceVariant,
    textOnSolidPrimary = cs.onPrimary,
    textActionAccent = cs.primary,
    textActionPrimary = cs.onSurface,
    textBadgeAccent = cs.onPrimaryContainer,
    textDisabled = cs.onSurface.copy(alpha = 0.38f),
    textLinkExternal = cs.primary,

    // Icons -> onSurface roles
    iconPrimary = cs.onSurface,
    iconSecondary = cs.onSurfaceVariant,
    iconTertiary = cs.onSurfaceVariant,
    iconQuaternary = cs.outline,
    iconOnSolidPrimary = cs.onPrimary,
    iconAccentPrimary = cs.primary,
    iconAccentTertiary = cs.primary,
    iconDisabled = cs.onSurface.copy(alpha = 0.38f),
    iconPrimaryAlpha = cs.onSurface.copy(alpha = 0.6f),
    iconSecondaryAlpha = cs.onSurfaceVariant.copy(alpha = 0.6f),
    iconTertiaryAlpha = cs.onSurfaceVariant.copy(alpha = 0.4f),
    iconQuaternaryAlpha = cs.outline.copy(alpha = 0.4f),

    // Borders & separators -> outline
    borderInteractivePrimary = cs.primary,
    borderInteractiveSecondary = cs.outline,
    borderInteractiveHovered = cs.onSurface,
    borderDisabled = cs.outlineVariant,
    borderFocused = cs.primary,
    borderAccentPrimary = cs.primary,
    borderAccentSubtle = cs.primaryContainer,
    separatorPrimary = cs.outlineVariant,
    separatorSecondary = cs.outlineVariant,
)
