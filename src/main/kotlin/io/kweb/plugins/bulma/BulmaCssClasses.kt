package io.kweb.plugins.bulma

import io.kweb.dom.attributes.AttributeBuilder
import io.kweb.dom.attributes.classes
import kotlin.reflect.KProperty

class BulmaCssClasses : AttributeBuilder() {

    /*
     * Colors
     */

    val isWhite by "is-white"
    val isBlack by "is-black"
    val isLight by "is-light"
    val isDark by "is-dark"
    val isPrimary by "is-primary"
    val isLink by "is-link"
    val isInfo by "is-info"
    val isSuccess by "is-success"
    val isWarning by "is-warning"
    val isDanger by "is-danger"
    val isBlackBis by "is-black-bis"
    val isBlackTer by "is-black-ter"
    val isGreyDarker by "is-grey-darker"
    val isGreyDark by "is-grey-dark"
    val isGreyLight by "is-grey-light"
    val isGreyLighter by "is-grey-lighter"
    val isWhiteTer by "is-white-ter"
    val isWhiteBis by "is-white-bis"

    /*
     * Size
     */

    val isSmall by "is-small"
    val isNormal by "is-normal"
    val isMedium by "is-medium"
    val isLarge by "is-large"

    /*
     * Style and State
     */

    val isOutlined by "is-outlined"

    val isLoading by "is-loading"

    /*
     * Float
     */

    val isClearfix by "is-clearfix"

    val isPulledLeft by "is-pulled-left"

    val isPulledRight by "is-pulled-right"

    /*
     * Spacing
     */

    val isMarginless by "is-marginless"

    val isPaddingless by "is-paddingless"

    /*
     * Other
     */

    val isOverlay by "is-overlay"

    val isClipped by "is-clipped"

    val isRadiusless by "is-radiusless"

    val isShadowless by "is-shadowless"

    val isUnselectable by "is-unselectable"

    val isInvisible by "is-invisible"

    val isSrOnly by "is-sr-only"

    /*
     * Show
     */

    val isFlexMobile by "is-flex-mobile"
    val isFlexTabletOnly by "is-flex-tablet-only"
    val isFlexDesktopOnly by "is-flex-desktop-only"
    val isFlexWidescreenOnly by "is-flex-widescreen-only"
    val isFlexTouch by "is-flex-touch"
    val isFlexTablet by "is-flex-tablet"
    val isFlexDesktop by "is-flex-desktop"
    val isFlexWidescreen by "is-flex-widescreen"
    val isFlexFullhd by "is-flex-fullhd"

    /*
     * Hide
     */

    val isHiddenMobile by "is-hidden-mobile"
    val isHiddenTabletOnly by "is-hidden-tablet-only"
    val isHiddenDesktopOnly by "is-hidden-desktop-only"
    val isHiddenWidescreenOnly by "is-hidden-widescreen-only"
    val isHiddenTouch by "is-hidden-touch"
    val isHiddenTablet by "is-hidden-tablet"
    val isHiddenDestkop by "is-hidden-desktop"
    val isHiddenWidescreen by "is-hidden-widescreen"
    val isHiddenFullhd by "is-hidden-fullhd"

    /*
     * Background Color
     */

    val hasBackgroundWhite by "has-background-white"
    val hasBackgroundBlack by "has-background-black"
    val hasBackgroundLight by "has-background-light"
    val hasBackgroundDark by "has-background-dark"
    val hasBackgroundPrimary by "has-background-primary"
    val hasBackgroundInfo by "has-background-info"
    val hasBackgroundLink by "has-background-link"
    val hasBackgroundSuccess by "has-background-success"
    val hasBackgroundWarning by "has-background-warning"
    val hasBackgroundDanger by "has-background-danger"
    val hasBackgroundBlackBis by "has-background-black-bis"
    val hasBackgroundBlackTer by "has-background-black-ter"
    val hasBackgroundGreyDarker by "has-background-grey-darker"
    val hasBackgroundGreyDark by "has-background-grey-dark"
    val hasBackgroundGrey by "has-background-grey"
    val hasBackgroundGreyLight by "has-background-grey-light"
    val hasBackgroundGreyLighter by "has-background-grey-lighter"
    val hasBackgroundGreyTer by "has-background-grey-ter"
    val hasBackgroundGreyBis by "has-background-grey-bis"

    /*
     * Typography (Size)
     */

    val isSize1 by "is-size-1"
    val isSize2 by "is-size-2"
    val isSize3 by "is-size-3"
    val isSize4 by "is-size-4"
    val isSize5 by "is-size-5"
    val isSize6 by "is-size-6"
    val isSize7 by "is-size-7"

    /*
     * Typography (Responsive Size)
     */

    val isSize1Mobile by "is-size-1-mobile"
    val isSize2Mobile by "is-size-2-mobile"
    val isSize3Mobile by "is-size-3-mobile"
    val isSize4Mobile by "is-size-4-mobile"
    val isSize5Mobile by "is-size-5-mobile"
    val isSize6Mobile by "is-size-6-mobile"
    val isSize7Mobile by "is-size-7-mobile"

    val isSize1Tablet by "is-size-1-tablet"
    val isSize2Tablet by "is-size-2-tablet"
    val isSize3Tablet by "is-size-3-tablet"
    val isSize4Tablet by "is-size-4-tablet"
    val isSize5Tablet by "is-size-5-tablet"
    val isSize6Tablet by "is-size-6-tablet"
    val isSize7Tablet by "is-size-7-tablet"

    val isSize1Touch by "is-size-1-touch"
    val isSize2Touch by "is-size-2-touch"
    val isSize3Touch by "is-size-3-touch"
    val isSize4Touch by "is-size-4-touch"
    val isSize5Touch by "is-size-5-touch"
    val isSize6Touch by "is-size-6-touch"
    val isSize7Touch by "is-size-7-touch"

    val isSize1Desktop by "is-size-1-desktop"
    val isSize2Desktop by "is-size-2-desktop"
    val isSize3Desktop by "is-size-3-desktop"
    val isSize4Desktop by "is-size-4-desktop"
    val isSize5Desktop by "is-size-5-desktop"
    val isSize6Desktop by "is-size-6-desktop"
    val isSize7Desktop by "is-size-7-desktop"

    val isSize1Widescreen by "is-size-1-widescreen"
    val isSize2Widescreen by "is-size-2-widescreen"
    val isSize3Widescreen by "is-size-3-widescreen"
    val isSize4Widescreen by "is-size-4-widescreen"
    val isSize5Widescreen by "is-size-5-widescreen"
    val isSize6Widescreen by "is-size-6-widescreen"
    val isSize7Widescreen by "is-size-7-widescreen"

    val isSize1Fullhd by "is-size-1-fullhd"
    val isSize2Fullhd by "is-size-2-fullhd"
    val isSize3Fullhd by "is-size-3-fullhd"
    val isSize4Fullhd by "is-size-4-fullhd"
    val isSize5Fullhd by "is-size-5-fullhd"
    val isSize6Fullhd by "is-size-6-fullhd"
    val isSize7Fullhd by "is-size-7-fullhd"

    /*
     * Typography (Color)
     */

    val hasTextWhite by "has-text-white"
    val hasTextBlack by "has-text-black"
    val hasTextLight by "has-text-light"
    val hasTextDark by "has-text-dark"
    val hasTextPrimary by "has-text-primary"
    val hasTextInfo by "has-text-info"
    val hasTextLink by "has-text-link"
    val hasTextSuccess by "has-text-success"
    val hasTextWarning by "has-text-warning"
    val hasTextDanger by "has-text-danger"
    val hasTextBlackBis by "has-text-black-bis"
    val hasTextBlackTer by "has-text-black-ter"
    val hasTextGreyDarker by "has-text-grey-darker"
    val hasTextGreyDark by "has-text-grey-dark"
    val hasTextGrey by "has-text-grey"
    val hasTextGreyLight by "has-text-grey-light"
    val hasTextGreyLighter by "has-text-grey-lighter"
    val hasTextGreyTer by "has-text-grey-ter"
    val hasTextGreyBis by "has-text-grey-bis"

    /*
     * Typography (Alignment)
     */

    val hasTextCentered by "has-text-centered"

    val hasTextJustified by "has-text-justified"

    val hasTextLeft by "has-text-left"

    val hasTextRight by "has-text-right"

    /*
     * Typography (Responsive Alignment)
     */

    val hasTextCenteredMobile by "has-text-centered-mobile"
    val hasTextCenteredTablet by "has-text-centered-tablet"
    val hasTextCenteredTabletOnly by "has-text-centered-tablet-only"
    val hasTextCenteredTouch by "has-text-centered-touch"
    val hasTextCenteredDesktop by "has-text-centered-desktop"
    val hasTextCenteredDesktopOnly by "has-text-centered-desktop-only"
    val hasTextCenteredWidescreen by "has-text-centered-widescreen"
    val hasTextCenteredWidescreenOnly by "has-text-centered-widescreen-only"
    val hasTextCenteredFullhd by "has-text-centered-fullhd"

    val hasTextJustifiedMobile by "has-text-justified-mobile"
    val hasTextJustifiedTablet by "has-text-justified-tablet"
    val hasTextJustifiedTabletOnly by "has-text-justified-tablet-only"
    val hasTextJustifiedTouch by "has-text-justified-touch"
    val hasTextJustifiedDesktop by "has-text-justified-desktop"
    val hasTextJustifiedDesktopOnly by "has-text-justified-desktop-only"
    val hasTextJustifiedWidescreen by "has-text-justified-widescreen"
    val hasTextJustifiedWidescreenOnly by "has-text-justified-widescreen-only"
    val hasTextJustifiedFullhd by "has-text-justified-fullhd"

    val hasTextLeftMobile by "has-text-left-mobile"
    val hasTextLeftTablet by "has-text-left-tablet"
    val hasTextLeftTabletOnly by "has-text-left-tablet-only"
    val hasTextLeftTouch by "has-text-left-touch"
    val hasTextLeftDesktop by "has-text-left-desktop"
    val hasTextLeftDesktopOnly by "has-text-left-desktop-only"
    val hasTextLeftWidescreen by "has-text-left-widescreen"
    val hasTextLeftWidescreenOnly by "has-text-left-widescreen-only"
    val hasTextLeftFullhd by "has-text-left-fullhd"

    val hasTextRightMobile by "has-text-right-mobile"
    val hasTextRightTablet by "has-text-right-tablet"
    val hasTextRightTabletOnly by "has-text-right-tablet-only"
    val hasTextRightTouch by "has-text-right-touch"
    val hasTextRightDesktop by "has-text-right-desktop"
    val hasTextRightDesktopOnly by "has-text-right-desktop-only"
    val hasTextRightWidescreen by "has-text-right-widescreen"
    val hasTextRightWidescreenOnly by "has-text-right-widescreen-only"
    val hasTextRightFullhd by "has-text-right-fullhd"

    /*
     * Typography (Transformation)
     */

    val isCapitalized by "is-capitalized"

    val isLowercase by "is-lowercase"

    val isUppercase by "is-uppercase"

    val isItalic by "is-italic"

    /*
     * Typography (Weight)
     */

    val hasTextWeightLight by "has-text-weight-light"
    val hasTextWeightNormal by "has-text-weight-normal"
    val hasTextWeightSemibold by "has-text-weight-semibold"
    val hasTextWeightBold by "has-text-weight-bold"

    /*
     * Columns - Basics
     */

    val columns by "columns"
    val column by "column"

    /*
     * Columns - Sizes
     */

    val isNarrow by "is-narrow"

    val isNarrowMobile by "is-narrow-mobile"
    val isNarrowTablet by "is-narrow-tablet"
    val isNarrowTouch by "is-narrow-touch"
    val isNarrowDesktop by "is-narrow-desktop"
    val isNarrowWidescreen by "is-narrow-widescreen"
    val isNarrowFullhd by "is-narrow-fullhd"


    val isFourFifths by "is-four-fifths"
    val isThreeFifths by "is-three-fifths"
    val isTwoFifths by "is-two-fifths"
    val isOneFifth by "is-one-fifth"

    val isThreeQuarters by "is-three-quarters"
    val isHalf by "is-half"
    val isOneQuarter by "is-one-quarter"

    val isTwoThirds by "is-two-thirds"
    val isOneThird by "is-one-third"

    val isFull by "is-full"

    val is1 by "is-1"
    val is2 by "is-2"
    val is3 by "is-3"
    val is4 by "is-4"
    val is5 by "is-5"
    val is6 by "is-6"
    val is7 by "is-7"
    val is8 by "is-8"
    val is9 by "is-9"
    val is10 by "is-10"
    val is11 by "is-11"
    val is12 by "is-12"

    val isOffsetFourFifths by "is-offset-four-fifths"
    val isOffsetThreeFifths by "is-offset-three-fifths"
    val isOffsetTwoFifths by "is-offset-two-fifths"
    val isOffsetOneFifth by "is-offset-one-fifth"

    val isOffsetThreeQuarters by "is-offset-three-quarters"
    val isOffsetHalf by "is-offset-half"
    val isOffsetOneQuarter by "is-offset-one-quarter"

    val isOffsetTwoThirds by "is-offset-two-thirds"
    val isOffsetOneThird by "is-offset-one-third"

    val isOffset1 by "is-offset-1"
    val isOffset2 by "is-offset-2"
    val isOffset3 by "is-offset-3"
    val isOffset4 by "is-offset-4"
    val isOffset5 by "is-offset-5"
    val isOffset6 by "is-offset-6"
    val isOffset7 by "is-offset-7"
    val isOffset8 by "is-offset-8"
    val isOffset9 by "is-offset-9"
    val isOffset10 by "is-offset-10"
    val isOffset11 by "is-offset-11"
    val isOffset12 by "is-offset-12"

    /*
     * Columns - Responsiveness
     */

    val isMobile by "is-mobile"

    val isDesktop by "is-desktop"

    // TODO: Add column sizes for each viewport size

    /*
     * Columns - Gap
     */

    val isGapless by "is-gapless"

    val isVariable by "is-variable"

    /*
     * Columns - Options
     */

    val isVcentered by "is-vcentered"

    val isMultiline by "is-multiline"

    val isCentered by "is-centered"

    /*
     * Layout - Container
     */

    val container by "container"

    val isFluid by "is-fluid"

    val isWidescreen by "is-widescreen"

    val isFullhd by "is-fullhd"

    /*
     * Layout - Level
     */

    val level by "level"

    val levelLeft by "level-left"

    val levelRight by "level-right"

    val levelITem by "level-item"

    /*
     * Layout - Media Object
     */

    val media by "media"

    val mediaLeft by "media-left"

    val mediaRight by "media-right"

    val mediaContent by "media-content"

    /*
     * Layout - Hero
     */

    val hero by "hero"

    val heroHead by "hero-head"

    val heroBody by "hero-body"

    val heroFoot by "hero-foot"

    val isBold by "is-bold"

    val isFullheight by "is-fullheight"

    val isFullheightWithNavbar by "is-fullheight-with-navbar"

    /*
     * Layout - Section
     */

    val section by "section"

    /*
     * Layout - Footer
     */

    val footer by "footer"

    /*
     * Layout - Tiles
     */

    val tile by "tile"

    val isAncestor by "is-ancestor"

    val isParent by "is-parent"

    val isChild by "is-child"

    val isVertical by "is-vertical"

    /*
     * Form - General
     */

    val label by "label"

    val input by "input"

    val textarea by "textarea"

    val select by "select"

    val checkbox by "checkbox"

    val radio by "radio"

    val help by "help"

    val control by "control"

    val field by "field"

    val fieldLabel by "field-label"

    val fieldBody by "field-body"

    val icons by "icons"

    val hasIconsLeft by "has-icons-left"

    val hasIconsRight by "has-icons-right"

    val isLeft by "is-left"

    val isRight by "is-right"

    val hasAddons by "has-addons"

    val hasAddonsCentered by "has-addons-centered"

    val hasAddonsRight by "has-addons-right"

    val isExpanded by "is-expanded"

    val isFullWidth by "is-fullwidth"

    val isGrouped by "is-grouped"

    val isGroupedCentered by "is-grouped-centered"

    val isGroupedRight by "is-grouped-right"

    val isGroupedMultiline by "is-grouped-multiline"

    val isHorizontal by "is-horizontal"

    /*
     * Form - Input
     */

    val isRounded by "is-rounded"

    val isHovered by "is-hovered"

    val isFocused by "is-focused"

    val isStatic by "is-static"

    val hasFixedSize by "has-fixed-size"

    /*
     * Form - File
     */

    val file by "file"

    val fileLabel by "file-label"

    val fileInput by "file-input"

    val fileCta by "file-cta"

    val fileIcon by "file-icon"

    val fileName by "file-name"

    val hasName by "has-name"

    val isBoxed by "is-boxed"

    /*
     * Elements - Box
     */

    val box by "box"

    /*
     * Elements - Button
     */

    val button by "button"

    val buttons by "buttons"

    val areSmall by "are-small"

    val areMedium by "are-medium"

    val areLarge by "are-large"

    val isInverted by "is-inverted"

    val isActive by "is-active"

    /*
     * Elements - Content
     */

    val content by "content"

    val isLowerAlpha by "is-lower-alpha"

    val isLowerRoman by "is-lower-roman"

    val isUpperAlpha by "is-upper-alpha"

    val isUpperRoman by "is-upper-roman"

    /*
     * Elements - Delete
     */

    val delete by "delete"

    /*
     * Elements - Icon
     */

    val icon by "icon"

    /*
     * Elements - Image
     */

    val image by "image"

    val is16x16 by "is-16x16"
    val is24x24 by "is-24x24"
    val is32x32 by "is-32x32"
    val is48x48 by "is-48x48"
    val is64x64 by "is-64x64"
    val is96x96 by "is-96x96"
    val is128x128 by "is-128x128"

    val isSquare by "is-square"
    val is1by1 by "is-1by1"
    val is5by4 by "is-5by4"
    val is4by3 by "is-4by3"
    val is3by2 by "is-3by2"
    val is5by3 by "is-5by3"
    val is16by9 by "is-16by9"
    val is2by1 by "is-2by1"
    val is3by1 by "is-3by1"
    val is4by5 by "is-4by5"
    val is3by4 by "is-3by4"
    val is2by3 by "is-2by3"
    val is3by5 by "is-3by5"
    val is9by16 by "is-9by16"
    val is1by2 by "is-1by2"
    val is1by3 by "is-1by3"

    /*
     * Elements - Notification
     */

    val notification by "notification"

    /*
     * Elements - Progress bars
     */

    val progress by "progress"

    /*
     * Elements - Table
     */

    val table by "table"

    val isSelected by "is-selected"

    val isBordered by "is-bordered"

    val isStriped by "is-striped"

    /*
     * Elements - Tag
     */

    val tag by "tag"

    val tags by "tags"

    val isDelete by "is-delete"

    /*
     * Elements - Title
     */

    val title by "title"

    val subtitle by "subtitle"

    val isSpaced by "is-spaced"

    /*
     * Components - Breadcrumbs
     */

    val breadcrumb by "breadcrumb"

    val hasArrowSeparator by "has-arrow-separator"

    val hasBulletSeparator by "has-bullet-separator"

    val hasDotSeparator by "has-dot-separator"

    val hasSucceedsSeparator by "has-succeeds-separator"

    /*
     * Components - Card
     */

    val card by "card"

    val cardHeader by "card-header"

    val cardHeaderTitle by "card-header-title"

    val cardHeaderIcon by "card-header-icon"

    val cardImage by "card-image"

    val cardContent by "card-content"

    val cardFooter by "card-footer"

    val cardFooterItem by "card-footer-item"

    /*
     * Components - Dropdown
     */

    val dropdown by "dropdown"

    val dropdownTrigger by "dropdownTrigger"

    val dropdownMenu by "dropdown-menu"

    val dropdownContent by "dropdown-content"

    val dropdownItem by "dropdown-item"

    val dropdownDivider by "dropdown-divider"

    val isUp by "is-up"

    /*
     * Components - Menu
     */

    val menu by "menu"

    val menuLabel by "menu-label"

    val menuList by "menu-list"

    /*
     * Components - Message
     */

    val message by "message"

    val messageHeader by "message-header"

    val messageBody by "message-body"

    /*
     * Components - Modal
     */

    val modal by "modal"

    val modalBackground by "modal-background"

    val modalContent by "modal-content"

    val modalClose by "modal-close"

    val modalCard by "modal-card"

    /*
     * Components - Navbar
     */

    val navbar by "navbar"

    val navbarBrand by "navbar-brand"

    val navbarBurger by "navbar-burger"

    val navbarMenu by "navbar-menu"

    val navbarStart by "navbar-start"

    val navbarEnd by "navbar-end"

    val navbarItem by "navbar-item"

    val navbarLink by "navbar-link"

    val navbarDropdown by "navbar-dropdown"

    val navbarDivider by "navbar-divider"

    val isTab by "is-tab"

    val isTransparent by "is-transparent"

    val isFixedTop by "is-fixed-top"

    val isFixedBottom by "is-fixed-bottom"

    val hasNavbarFixedTop by "has-navbar-fixed-top"

    val hasNavbarFixedBottom by "has-navbar-fixed-bottom"

    /*
     * Components - Pagination
     */

    val paginationPrevious by "pagination-previous"

    val paginationNext by "pagination-next"

    val paginationList by "pagination-list"

    val paginationEllipsis by "pagination-ellipsis"

    /*
     * Components - Panel
     */

    val panel by "panel"

    val panelTabs by "panel-tabs"

    val panelBlock by "panel-block"

    /*
     * Components - Tabs
     */

    val tabs by "tabs"

    val isToggle by "is-toggle"

    val isToggleRounded by "is-toggle-rounded"

    private operator fun String.getValue(self: Any, property: KProperty<*>): BulmaCssClasses {
        classes(this)
        return this@BulmaCssClasses
    }
}